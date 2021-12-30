def get_row(row_index):
    if row_index == 0:
        return [1]

    if row_index == 1:
        return [1, 1]

    result = []
    result.append(1)

    previous_result = get_row(row_index - 1)

    for index in range(1, row_index):
        result.append(previous_result[index - 1] + previous_result[index])

    result.append(1)
    return result


def main():
    print(get_row(3))


if __name__ == "__main__":
    main()
