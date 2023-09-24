phrase = input("Your phrase please my dear : ")

word_list = phrase.split(" ")

cleaned_phrase = []

for word in word_list :
    if word != "":
        letter_list = list(word)
        i = 0
        for letter in letter_list:
            if letter.isspace():
                letter_list.pop(i)
            else :
                pass
            i+=1
        cleaned_phrase.append(("".join(letter_list)))
    else:
        pass

print(" ".join(cleaned_phrase[1::]+cleaned_phrase[0::-1]))


