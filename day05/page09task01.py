guests = ["Eric","Marc","Antoine"]

n1 = input("quel est votre nom")

l2 = list(map(lambda x : x.lower(),guests))

if n1.lower() in l2 :
    print("hey")
else :
    print("ciao")

#lorsqu'on définit lambda on utilise : et non =