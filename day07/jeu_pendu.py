def hangman_core(input_word):
    word = input_word
    w_list = []
    t_list = []

    for i in word:
        w_list.append(i.lower())
        t_list.append("_ ")

    points = 0

    yield(' '.join(t_list))
    yield("/ 0 point")

    while points < 8:

        lettre = input("votre lettre ? ")

        if lettre.isalpha():


            if lettre.lower() == word.lower():
                yield (f"Bravo vous avez réussi ! Le mot était {word.capitalize()}.")
                break

            n = 0

            for i in w_list:


                if lettre.lower() == i :
                    t_list[n] = lettre.lower()
                    n += 1
                if lettre.lower() != i :
                    n += 1

            if lettre.lower() not in w_list:
                yield ("sheh !")
                points += 1

            if "_ " not in t_list:
                yield(f"Bravo vous avez réussi ! Le mot était {word.capitalize()}.")
                break


            yield(' '.join(t_list))
            if points <2 :
                yield(f"/ {points} point")
            else :
                yield(f"/ {points} points")

        else :
            yield("Seul les lettres sont autorisées...")


    if points == 8 :
        yield(f"Miskine tu as perdu. Le mot était {word.capitalize()}.")

    # yield("_ "*len(word)+ "/ " + f"{points} point", end="")

