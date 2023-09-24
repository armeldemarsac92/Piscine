import subprocess

from jeu_pendu import hangman_core
from tkinter import *
#hangman_core("bonjour")


window = Tk()
window.geometry("600x600")
window.title("exercice piscine")

text_output = Text(window)
text_output.grid(row = 2, column = 1, pady = 20, padx = 20)


word_input = Entry(window)
word_input.grid(row = 1, column = 1, pady = 20, padx = 20)


# Create a global variable to hold the generator object
hangman_gen = None

def launch():
    global hangman_gen
    # Initialize the generator
    hangman_gen = hangman_core(word_input.get())
    # Get the first yielded value
    initial_output = next(hangman_gen)
    # Insert that value into the Text widget
    text_output.insert('end', initial_output + '\n')

def next_step():
    global hangman_gen
    if hangman_gen:  # Make sure the generator is initialized
        try:
            # Get the next yielded value
            game_output = next(hangman_gen)
            # Insert that value into the Text widget
            text_output.insert('end', game_output + '\n')
        except StopIteration:  # Generator has no more values to yield
            text_output.insert('end', 'Game Over!\n')



bouton = Button(window, text="Afficher dans le terminal", command=launch)
bouton.grid(row = 2, column = 1)
bouton2 = Button(window, text="tenter", command= next_step)
bouton2.grid(row = 3, column = 1)


window.mainloop()