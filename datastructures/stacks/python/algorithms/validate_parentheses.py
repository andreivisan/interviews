def is_valid(s):
    if len(s) < 2:
        return False

    dict = {
        "{": "}",
        "[": "]",
        "(": ")"
    }

    temp = []

    for element in s:
        if len(temp) > 0 and dict.get(temp[len(temp) - 1], None) == element:
            temp.pop()
        else:
            temp.append(element)

    return len(temp) == 0


def main():
    s = "()"

    print(is_valid(s))


if __name__ == "__main__":
    main()
