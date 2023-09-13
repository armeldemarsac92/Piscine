diviseur = 3
resultat = 1


for i in range(1,10000) :
    if i % 2 > 0 :
        resultat = resultat - 1 / diviseur

    else:
        resultat = resultat + 1 / diviseur

    diviseur += 2

resultat = resultat * 4

print(f"La solution est {resultat}")


