from os import listdir

def finder(path):
    if len(listdir()>1):
        for path in listdir():
            finder(path)
    else:
        return path