## Opgave 1

## Opgave 2
Tæl hvor mange elementer, der er lig med x, hvis antallet er ulige, smid det pågældende element i venstre liste eller højre liste.

## Opgave 3
Worst case reached => O(n^2)

## Opgave 4
[4,3,2,1]

Fordi det sidste element altid er mindre end de forrige elementer vil partition altid placere dem i samme subarray,
så vil grenene altid vokse ned af til r-1.

[1,2,3,4]

Der vil gælde det samme, bortset for at det vil komme ud på den anden gren i træet.

## Opgave 5
|#|Best case| Worst case |Sorteret input|
|---|---|------------|---|
|Insertion Sort|O(n)| O(n^2)     |O(n)|
|Merge Sort|O(n log n)| O(n log n) |O(n log n)|
|Quick Sort|O(n log n)| O(n^2)     |O(n log n)|

## Opgave 6
Original:
```
PARTITION(A, p, r)
x = A[r]
i = p - 1
for j = p to r - 1
    if A[j] <= x
        i = i + 1
        swap A[i] with A[j]
swap A[i + 1] with A[r]
return i + 1
```

Modified:
```
PARTITION(A, p, r)
x = A[r]
i = p - 1
q = p - 1
for j = p to r - 1
    if A[j] <= x
        i = i + 1
        swap A[i] with A[j]
swap A[i + 1] with A[r]
return i + 1
```

7.2-2: Theta(n)

7.2-3: Når elementerne ikke kan være det samme, kan der ikke hentes gevinst på at samle dem sammen. Derfor Theta(n^2)

## Opgave 7
Et sorted array (ascending) er min-heap.

## Opgave 8
Den er ikke max-heap, da 6-tallet har en child med højere værdi.

## Opgave 9

