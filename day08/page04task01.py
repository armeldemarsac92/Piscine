import tkinter
from tkinter import *
from tkinter import ttk

def afficher():
    print(entree.get())

window = Tk()
window.geometry("600x600")
window.title("exercice piscine")
bgimg = PhotoImage(file="/home/armeldemarsac/Images/River-otter-main.png")

backgroundi = Label(window,image=bgimg)
backgroundi.place(x=0,y=0)
# backgroundi.place(x=0, y=0, relwidth=1, relheight=1)
lf = Frame(window)
lf.pack(pady = 20)

# texte = Label(window, text="Bonjour", bg="ivory")

entree = Entry(lf)
entree.pack(pady = 20)
bouton = Button(lf, text="Afficher dans le terminal", command=afficher)
bouton.pack(pady = 20)



window.mainloop()
