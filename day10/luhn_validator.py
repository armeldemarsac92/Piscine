str_1 = input("your_number")
str_2 = []
str_3 = []
str4 = []
index = 0

if str_1.isnumeric():
    for d1 in list(str_1)[-2::-2]:

        d1 = int(d1)

        d1 = d1*2

        if d1 > 9:
            d1 = d1 - 9
        str_2.append(d1)


    for i in list(str_1)[::2]:
        i = int(i)
        str_3.append(i)


        if len(str_3) == len(str_1):
            break
        else:
            str_3.append(str_2[::-1][index])
            index += 1

    if sum(str_3)%10 == 0:
        print("valid")

        for i in str_3:
            i = str(i)
            str4.append(i)

        print("".join(str4))
else :
    print(84)




