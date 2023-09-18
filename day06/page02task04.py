def bread () :
    print ( " <////////// > " )
def lettuce () :
    print ( " ~~~~~~~~~~~~ " )
def tomato () :
    print ( " O O O O O O " )
def ham () :
    print ( " ============ " )

def chef (orders,b="non") :

    if b.lower()=="non":

        for i in range(int(orders)):
            bread()
            lettuce()
            tomato()
            ham()
            ham()
            bread()

    else:
        for i in range(int(orders)):
            bread()
            lettuce()
            tomato()
            bread()

orders = input("combien de dwiches veux tu ? ")
b = input("es-tu veggy oui ou non ?")

chef(orders,b)
