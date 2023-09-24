def open_or_senior(x):
    x2 = []
    for x,z in x:
        if x>=55 and z>7:
            x2.append("Senior")
        else:
            x2.append("Open")

#alternative solution :

def openOrSenior(data):
  return ["Senior" if age >= 55 and handicap >= 8 else "Open" for (age, handicap) in data]