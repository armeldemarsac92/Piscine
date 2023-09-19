# row1 = "R R G B R G B B"
#
#
# def triangle(row):
#     row = row.replace(" ","")
#     row2 = ""
#     print(row)
#     if len(row) > 1:
#
#         for a,b in zip(row[0::], row[1::]):
#
#             if a+b == "RG" or a+b == "GR":
#                 # print(f"{a} and {b}")
#                 # print("match 1")
#                 row2 += "B"
#             elif a+b == "BG" or a+b == "GB":
#                 # print(f"{a} and {b}")
#                 # print("match 3")
#                 row2 += "R"
#             elif a+b == "RB" or a+b == "BR":
#                 row2 += "G"
#             elif a == b:
#
#                 row2 += a
#             else:
#                 # print(f"{a} and {b}")
#                 # print("no match")
#                 pass
#
#         row = row2
#
#         triangle(row)
#
#     else :
#         return row
#
#
# triangle(row1)
#


def triangle(row):
    row = row.replace(" ", "")
    row2 = ""

    if len(row) > 1:

        for a, b in zip(row[0::], row[1::]):

            if a + b == "RG" or a + b == "GR":
                # print(f"{a} and {b}")
                # print("match 1")
                row2 += "B"
            elif a + b == "BG" or a + b == "GB":
                # print(f"{a} and {b}")
                # print("match 3")
                row2 += "R"
            elif a + b == "RB" or a + b == "BR":
                row2 += "G"
            elif a == b:

                row2 += a
            else:
                # print(f"{a} and {b}")
                # print("no match")
                pass

        return triangle(row2)


    else:
        return row

print(triangle("GB"))