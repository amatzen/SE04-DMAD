from random import shuffle

class PermutationFinder:
    def __init__(self, max: int) -> None:
        super().__init__()
        self.list = None
        self.max = max

    def makeList(self) -> None:
        self.list = list(range(1, int(self.max)+1))

    def randomize(self) -> None:
        shuffle(self.list)

    def get(self) -> list:
        return self.list

def count_cycles(list: list[int]):
    cycles = 0
    for i in range(len(list)):
        if list[i] != i+1:
            cycles += 1
    return cycles


if __name__ == "__main__":
    maxVal: int = int(input("Please enter max value"))
    pf = PermutationFinder(maxVal)
    pf.makeList()
    pf.randomize()
    print(pf.get())
    print(count_cycles(pf.get()))