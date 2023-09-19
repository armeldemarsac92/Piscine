word = input("Votre mot : ")
w_list = []
t_list = []

for i in word:
    w_list.append(i.lower())
    t_list.append("_ ")

points = 0

print(' '.join(t_list), end="")
print("/ 0 point")

while points < 8:

    lettre = input("votre lettre ? ")

    if lettre.isalpha():


        if lettre.lower() == word.lower():
            print(f"Bravo vous avez réussi ! Le mot était {word.capitalize()}.")
            break

        n = 0

        for i in w_list:


            if lettre.lower() == i :
                t_list[n] = lettre.lower()
                n += 1
            if lettre.lower() != i :
                n += 1

        if lettre.lower() not in w_list:
            print("sheh !")
            points += 1

        if "_ " not in t_list:
            print(f"Bravo vous avez réussi ! Le mot était {word.capitalize()}.")
            break


        print(' '.join(t_list), end="")
        if points <2 :
            print(f"/ {points} point")
        else :
            print(f"/ {points} points")

    else :
        print("Seul les lettres sont autorisées...")


if points == 8 :
    print(f"Miskine tu as perdu. Le mot était {word.capitalize()}.")

# print("_ "*len(word)+ "/ " + f"{points} point", end="")

