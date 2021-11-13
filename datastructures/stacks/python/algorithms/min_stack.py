class MinStack:
    def __init__(self):
        self.stack = []
        self.min_stack = []

    def push(self, x: int) -> None:
        self.stack.append(x)
        if not self.min_stack or x <= self.min_stack[-1]:
            self.min_stack.append(x)

    def pop(self) -> None:
        if self.min_stack[-1] == self.stack[-1]:
            self.min_stack.pop()
        self.stack.pop()

    def top(self) -> int:
        return self.stack[-1]

    def getMin(self) -> int:
        return self.min_stack[-1]

    def print_stack(self):
        self.stack.reverse()
        print(*self.stack)


def main():
    min_stack = MinStack()

    min_stack.push(1)
    min_stack.push(2)
    min_stack.push(3)
    min_stack.push(4)

    print("==== MY STACK ====")
    min_stack.print_stack()

    print("==== MIN VALUE IN THE STACK ====")
    print(min_stack.getMin())


if __name__ == "__main__":
    main()
