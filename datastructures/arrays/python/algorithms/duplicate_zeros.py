def duplicateZeros(arr):
    length = len(arr)
    zeros = countZeros(arr)

    print(f"zeros = {zeros}")

    for index in reversed(range(len(arr))):
        insert(arr, zeros, index)

        if arr[index] == 0:
            zeros -= 1
            insert(arr, zeros, index)


def countZeros(arr):
    zeros = 0
    for index in range(len(arr)):
        if arr[index] == 0:
            zeros += 1
    return zeros


def insert(arr, number_of_zeros, index):
    if (index + number_of_zeros < len(arr)):
        arr[index + number_of_zeros] = arr[index]


def main(arr):
    duplicateZeros(arr)
    for index in range(len(arr)):
        print(arr[index])


if __name__ == "__main__":
    arr = [1, 0, 2, 3, 0, 4, 5, 6]
    main(arr)
