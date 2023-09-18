student = {
    "name" : "antoine",
    "year" : "l1",
}

#the idea is to add a new key to our dictionnary, it will be named "units". in this key we will store 3 new dicts in a list.

student["units"] = [
    {
        "name" : "Web Development",
        "credits" : "150",
        "grade" : "A"

    },
    {
        "name" : "Network and sys",
        "credits" : "147",
        "grade" : "B+"
    },
    {
        "name" : "Java",
        "credits" : "100",
        "grade" : "D+"
    }
    ]

print(student["units"][1]["grade"])

#to access the second element of the list stored for the key "units" we type student["units"][1]["grade"] the 1 is used because
#we are accessing one of the 3 dicts stored in the list matching the key "units" from the first dict.
