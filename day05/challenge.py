import random
import time

start_time = time.time()

l1 = random.sample(range(0,4541684875415),1000000)
l1.sort()

end_time = time.time()

print(f"it took {end_time - start_time}s ")

print(l1[0:10])
