def twoSum(numbers, target):
    i = 0
    j = len(numbers) - 1
    sum = 0

    while i < j:
        sum = numbers[i] + numbers[j]
        if sum > target:
            j -= 1
        elif sum < target:
            i += 1
        elif sum == target:
            return [i + 1, j + 1]

    return [-1, -1]


def main():
    numbers = [2, 7, 11, 15]
    target = 9

    print(twoSum(numbers, target))


if __name__ == "__main__":
    main()
