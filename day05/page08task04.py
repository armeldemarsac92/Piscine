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

students = [student]

n = int(input("combien d'étudiants souhaitez vous ajouter ?"))

for a in range(n):
    student[int(len(students))+a] = {}
    for b in range(0,2):
        student[int(len(students))+a][list(student.keys())[b]] = input(list(student.keys())[b])
    units = []
    for c in range(len(student["units"])):
        print(range(len(student["units"])))
        unit = {}
        for d in range(len(student["units"][c])):
            unit[list(student["units"][c].keys())[d]] = input(list(student["units"][c].keys())[d])
        units.append(unit)
    student[int(len(students))+a]["units"] = units

    student[int(len(students))+a]["total_credits"] = sum(
        list(grade_weight_mapping[student[int(len(students))+a]["units"][i]["grade"]] for i in range(len(student[int(len(students))+a]["units"]))))

    student[int(len(students))+a]["GPA"] = {
        round(int(student[int(len(students))+a]["total_credits"]) / int(len(student[int(len(students))+a]["units"])), 2)
    }



sorted_students = sorted(students, key=lambda student: student["name"])
sorted_students2 = sorted(students, key=lambda student: student["GPA"], reverse=True)

print(sorted_students)
print(sorted_students)


# print(list(student.keys())[1])