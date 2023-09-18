student = {
    "name" : "antoine",
    "year" : "l1",
}

student["units"] = [
    {
        "name" : "Web Development",
        "credits" : "150",
        "grade" : "A"

    },
    {
        "name" : "Network and sys",
        "credits" : "147",
        "grade" : "B"
    },
    {
        "name" : "Java",
        "credits" : "100",
        "grade" : "D"
    }
    ]

grade_weight_mapping = {
    "A" : 4,
    "B" : 3,
    "C" : 2,
    "D" : 1,
    "E" : 0
}

student["total_credits"] = sum(list(grade_weight_mapping[student["units"][i]["grade"]] for i in range(len(student["units"])) ))

student["GPA"] = {
    round(int(student["total_credits"])/int(len(student["units"])),2)
}


print(student)