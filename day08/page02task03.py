import matplotlib.pyplot as plt
import numpy as np

lx = np.arange(1, 10)

plt.plot(lx, lx**2, 'o', color="red")
plt.grid()
plt.show()
