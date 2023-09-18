l1=[7,5,8,9,6552,1,45,114,22,455]

def smaller(x):
    return x>7

l2 = filter(smaller,l1)
print(list(l2))

#other method

filtered_list = [x for x in l1 if x > 7]

print(filtered_list)

#other example using mixed list



mixed_list = [7, 'a', 8, 9, 6552, 'b', 1, 45, 'c', 114, 22, 455]
filtered_list = [x for x in mixed_list if type(x) == int and x > 7]


#adding multiple conditions for the type of x

mixed_list = [7, 'a', 8.5, 9, 6552, 'b', 1, 45, 'c', 114, 22, 455, 3.5]
filtered_list = [x for x in mixed_list if (type(x) == int or type(x) == float) and x > 7]

#new exercise with filter and lambda

def filtered(x):
    return type(x) == int or type(x) == float and x > 7

l5 = list(filter(lambda x: (type(x) == int or type(x) == float) and x > 7,l1))

print(list(l5))