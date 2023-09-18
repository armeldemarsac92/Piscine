meetings = [
    ["Monday", "3:30pm", "Joe", "Samantha", "Alice", "Bob", "Charlie"],
    ["Tuesday", "10:00am", "Sophia", "John", "Ella", "Michael"],
    ["Wednesday", "2:00pm", "Olivia", "Daniel", "Mia", "James", "Lily", "William"],
    ["Thursday", "4:30pm", "Ava", "David", "Emily", "Joseph"],
    ["Friday", "1:00pm", "Liam", "Emma", "Henry", "Evelyn"],
    ["Saturday", "11:00am", "Noah", "Olivia", "William", "Charlotte", "Logan"]
]


def finder(name):
    calendar = []

    for a in range(len(meetings)):
        for b in meetings[a][2:]:
            meeting = {}
            if name.lower() == b.lower():
                meeting = {}
                meeting["Day"]=meetings[a][0]
                meeting["Time"]=meetings[a][1]
                calendar.append(meeting)
            else:
                pass

    return calendar

n1 = input("who are you ? : ")

dates = finder(n1)

i = 0

print(f"{n1.capitalize()} you have {len(dates)} meetings planned.")

for day, time in dates :
    print(f"Meeting no{i+1} on {dates[i][day]} at {dates[i][time]}.")
    i += 1