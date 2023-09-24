n1 = input("n1 ? :")

n2 = input("n2 ? : ")


for i in range(int(n1), int(n2+1)):

    val = 0

    for i2 in range(1,i):
        if i%i2 == 0:
            val +=1
    if val < 2:
        print(i)

    else:
        pass







