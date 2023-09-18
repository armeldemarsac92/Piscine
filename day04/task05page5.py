def ls(n1,i):
    for i in range(n1-(n1%i),1,-i):
        print(i,end=" ")



while True:
    n1 = int(input("votre nombre"))


    for i in range(2,(n1//2)+1):
        print("")
        ls(n1,i)
