def bread () :
    print ( " <////////// > " )
def lettuce () :
    print ( " ~~~~~~~~~~~~ " )
def tomato () :
    print ( " O O O O O O " )
def ham () :
    print ( " ============ " )

def chef (orders) :

    for i in range(int(orders)):
        bread()
        lettuce()
        tomato()
        ham()
        ham()
        bread()

orders = input("combien de dwiches veux tu ? ")

chef(orders)
