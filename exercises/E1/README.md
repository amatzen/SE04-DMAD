# Opgave 1

|          | 1 second | 1 hour       |
|----------|--------|--------------|
| n        | 10^9   | 10^9\*60\*60 |
| n*log(n) |        |              |

# Opgave 2

I det optimale scenarie vil der blive krævet n/2 ombytninger, da ombytningerne vil sætte 2 på deres rigtige plads ad gangen.

# Opgave 3

# Opgave 4

```python
import itertools
import random

maxValue = input("Please enter highest value: ")

listA = list(range(1, int(maxValue)+1))
permA = itertools.permutations(listA)
permA = list(permA)

rand_index = random.randrange(0, (len(permA)-1))

print(permA[rand_index])
```

# Opgave 5
