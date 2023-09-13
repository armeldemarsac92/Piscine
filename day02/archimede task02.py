def recursive(divisé,i):

    if i < 950 :
        divisé += 2
        i += 1
        fn = divisé**2/recursive(divisé,i)+6

    else :
        fn = divisé**2

    return fn

soluce = 1/recursive(1,0)
print(soluce)



for i in range(1001,1,-2):
    s = (i-2)**2/(i**2)+6