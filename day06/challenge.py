import time


def compute(x,p):
    s = time.time()
    ans = int(x)**int(p)
    s2 = time.time()
    s3 = s2-s
    return ans, s3


x = input("votre nombre")
p = input("sa puissance")

print(compute(x,p))
