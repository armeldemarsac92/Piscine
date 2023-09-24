class Game:

    def __init__(self,word):
        self.word = word
        self.is_alpha = None


    def check_if_letter(self):
        if self.word.isalpha():
            self.is_alpha = "yes"
        else :
            self.is_alpha = "no"



