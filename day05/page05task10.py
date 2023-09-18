#Test this code and try to explain it:
first_name = [ " Jackie " , " Bruce " , " Arnold " , " Sylvester " ]
last_name = [ " Stallone " , " Schwarzenegger " , " Willis " , " Chan " ]
magic = [* zip ( first_name , last_name [:: -1]) ]
print ( magic [0])
print ( magic [3])
print ( magic [1][0])
print ( magic [0][1])
print ( magic [2])



#l'asterisque permet d'unpacker une valeur en une liste lorsqu'elle appartient à une liste sans avoir à utiliser la fonction list

print(magic[0][1])

#on accède d'abord à l'index 0 de la liste magic, soit la première valeurs stockées à l'aide de * et zip,
#ici ce serait la sous liste "jackie, chan", ensuite vu qu'il y a un second index "[1]" on retourne le second element
#de la sous liste "jackie, chan" soit la valeur "chan"