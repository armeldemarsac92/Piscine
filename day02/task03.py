def get_sum(n):
    sum = 0
    for digit in str(n):
        sum += int(digit)
    return sum

while True:
    n = input("entrez votre nombre à calculer")

    res = get_sum(n)

    print(f"le résultat est {res}")

