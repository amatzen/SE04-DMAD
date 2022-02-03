import itertools
import random

maxValue = input("Please enter highest value: ")

listA = list(range(1, int(maxValue)+1))
permA = itertools.permutations(listA)
permA = list(permA)

rand_index = random.randrange(0, (len(permA)-1))

print(permA[rand_index])