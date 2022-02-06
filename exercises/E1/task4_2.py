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


if __name__ == "__main__":
    maxVal: int = int(input("Please enter max value"))
    pf = PermutationFinder(maxVal)
    pf.makeList()
    pf.randomize()
    print(pf.get())