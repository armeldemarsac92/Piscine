def palindrome(mot):
    if len(mot) <= 1 :
        return True

    if mot[0]==mot[-1]:
        return(palindrome(mot[1:-1]))

    else :
        return False

mot = input("mot à tester : ")

print(palindrome(mot))