sentence = "This is a test. Is it possible to fly? Good things blabla"
mot = []
mots = []



for c in range(len(sentence)):

    if sentence[c] != " ":
        mot.append(sentence[c])
    mots.append(mot)
    mot = []

    if sentence[c] == "." | "!" | "?":







