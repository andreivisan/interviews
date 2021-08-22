class Operations:
    def __init__(self):
        self.numbers = []

    def insert(self, number, index):
        if (index < len(self.numbers)):
            self.numbers[index] = number
        else:
            self.numbers.append(number)

        return self.numbers

    def get(self, index):
        if (index < len(self.numbers)):
            return self.numbers[index]
        else:
            return -1

    def delete(self, index):
        if (index < len(self.numbers)):
            self.numbers.pop(index)

        return self.numbers


if __name__ == "__main__":
    operations = Operations()

    operations.insert(1, 0)
    operations.insert(2, 1)
    operations.insert(3, 2)

    print(operations.numbers)
    print(operations.get(1))

    operations.delete(2)
    print(operations.numbers)
