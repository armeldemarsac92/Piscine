def get_decimal(n):
    res = round(float(n) % 1,6)
    return res

while True :
    n = input("quel est votre chiffre ? ")

    res = get_decimal(n)

    print(f"votre résultat est {res}")