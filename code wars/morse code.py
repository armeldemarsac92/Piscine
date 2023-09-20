MORSE_CODE_DICT = { 'A':'.-', 'B':'-...',
                    'C':'-.-.', 'D':'-..', 'E':'.',
                    'F':'..-.', 'G':'--.', 'H':'....',
                    'I':'..', 'J':'.---', 'K':'-.-',
                    'L':'.-..', 'M':'--', 'N':'-.',
                    'O':'---', 'P':'.--.', 'Q':'--.-',
                    'R':'.-.', 'S':'...', 'T':'-',
                    'U':'..-', 'V':'...-', 'W':'.--',
                    'X':'-..-', 'Y':'-.--', 'Z':'--..',
                    '1':'.----', '2':'..---', '3':'...--',
                    '4':'....-', '5':'.....', '6':'-....',
                    '7':'--...', '8':'---..', '9':'----.',
                    '0':'-----', ', ':'--..--', '.':'.-.-.-',
                    '?':'..--..', '/':'-..-.', '-':'-....-',
                    '(':'-.--.', ')':'-.--.-'}


def decode_morse(morse_code):

    new_phrase = morse_code.replace("·",".").replace("−","-")
    print(new_phrase)
    decoded_phrase = []

    for mot in new_phrase.split("   "):
        for lettre in mot.split(" "):

            for i in MORSE_CODE_DICT.keys():

                if MORSE_CODE_DICT[i] == lettre:


                    decoded_phrase.append(i)


    decoded_phrase.append(" ")

    return "".join(decoded_phrase)




print(decode_morse('.... . -.--   .--- ..- -.. .'))
