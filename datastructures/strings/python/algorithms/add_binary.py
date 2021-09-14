def addBinary(a, b):
    result = []
    carry = 0

    i = len(a) - 1
    j = len(b) - 1

    while i >= 0 or j >= 0:
        sum = carry

        if i >= 0:
            sum += int(a[i])
        if j >= 0:
            sum += int(b[j])

        result.append(str(sum % 2))
        carry = sum / 2

        i -= 1
        j -= 1

    if carry == 1:
        result.append(str(carry))

    result.reverse()

    return ''.join(result)


def main():
    a = "1010"
    b = "1011"

    print(addBinary(a, b))


if __name__ == "__main__":
    main()
