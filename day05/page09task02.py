guests = ["Eric","Marc","Antoine","Eric"]

guests2 = []

for guest in guests:
    if guest not in guests2:
        guests2.append(guest)
    else:
        pass
guests = guests2

print(guests2)

#another simpler methid, use set function, it stores only unique elements
#and removes the duplicates.

guests = ["Eric", "Marc", "Antoine", "Eric"]
guests = list(set(guests))
print(guests)


