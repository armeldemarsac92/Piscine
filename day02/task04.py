def get_int(n):
    res = int(float(n))
    return res

while True:
    n = input("votre chiffre ? ")

    res = get_int(n)

    print((f"Votre résultat est {res}"))