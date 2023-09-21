import tkinter as tk

window = tk.Tk()
canvas = tk.Canvas(window, width = 600, height = 1000)
canvas.pack()

x1, y1 = 300,120
x2, y2 = 75,300
x3, y3 = 300,600
x4, y4 = 525,300

canvas.create_line(x1, y1, x2, y2, width=5, fill="green")
canvas.create_line(x4, y4, x1, y1, width=5, fill="green")
canvas.create_line(x1, y1-15, x3,y3, width=5, fill="green")
canvas.create_line(x3, y3, x2, y2+600, width=5, fill="green")
canvas.create_line(x3, y3, x4, y4+600, width=5, fill="green")

#to draw a circle using the .create_oval fn
#1: distance from the top of the circle to the top of the window
#2: distance from the top of the circle to the top of the window
#3: distance from the right edge of the circle to the left edge of the window
#4: distancce from the bottom of the circle to the top of the window

canvas.create_oval(250, 5, 350,105, width=0, fill="green" )

window.mainloop()