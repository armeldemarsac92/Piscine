def to_jaden_case(string):
    ls = string.split()

    for i in range(len(ls)) :
        ls[i] = ls[i].capitalize()
    return " ".join(ls)


print(to_jaden_case("bonjour les mecs comment ça va bien ?"))