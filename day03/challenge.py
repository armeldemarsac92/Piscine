n = int(input("combien de mots voulez vous rechercher ? "))
phrase = "thE Cat’s tactic wAS tO surpRISE thE mIce iN tHE gArdeN"
l =[]
c = 0

for i in range(n):
    l.append(input(f"votre mot numéro {i} : "))

for mot in l:
    c = c + phrase.lower().count(mot.lower()) + phrase.lower().count(mot[::-1].lower())

print(f"Il y a {c} occurences dans la phrase.")



