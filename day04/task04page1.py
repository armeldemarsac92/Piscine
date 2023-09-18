n1 = int(input("ur number ? "))

if n1 == 42 or n1 <= 21 or n1%2 == 0 or n1 / 2 < 21 :
    print("okay")
elif n1%2 > 0 and n1 >= 45 :
    print("okay 2")
else:
    print("you got wrong my friend ! ")

#ici il faut analyser les conditions pour repérer le seul cas dans lequel le programme retourne une erreur, cad lorsque
#n1 est égal à 43

if n1 == 43:
    print("you got wrong my friend")
else:
    print("okay")