def high_and_low(numbers):
    return max(list(map(int, list(numbers.split(" "))))) +" "+ min(list(map(int, list(numbers.split(" ")))))


print(high_and_low("9 8 5 4 7 485 -5 -120 0"))

def high_and_low(numbers): #z.
    nn = [int(s) for s in numbers.split(" ")]
    return "%i %i" % (max(nn),min(nn))