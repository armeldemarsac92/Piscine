import math

import matplotlib.pyplot as plt
import numpy as np

def plot_fct(fx,deb,fin):
    xvalues = [fx(n) for n in np.arange(deb,fin) if n != 0]
    yvalues = [n for n in np.arange(deb,fin) if n != 0]
    plt.plot(yvalues, xvalues, color = "red")
    plt.grid()
    plt.show()

def f(x):
    return x**2 + x*3 + 2

plot_fct(lambda x: 1/x, -100, 100)