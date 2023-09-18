str = input("donnez moi un mot : ")

n2=""

for s in str :
    print(s*2, end="")

for s in str :
    n2 = n2+s*2

print(f"deuxieme soluce {n2}")