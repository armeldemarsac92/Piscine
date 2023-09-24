str_1 = "phrase you want to inspect : "

str_2 = "word you are looking for :"

str_3 =[]

index = 0

for lettre_2 in str_2:

    for lettre_1 in str_1[index::]:
        index+=1
        if lettre_1 == lettre_2:
            str_3.append(lettre_1)

            break


if str_2.lower()=="".join(str_3).lower():
    print(1)

else :
    print(0)