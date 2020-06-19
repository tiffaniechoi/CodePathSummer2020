#
# Complete the 'isValid' function below.
#
# The function is expected to return a BOOLEAN.
# The function accepts STRING sentence as parameter.
# The function will check if the sentence is valid 
# and return true or false accordingly. 
#

def isValid(sentence):

    ##a valid sentence has an uppercase on the 1st letter & a punctuation at the end
    if(sentence[0].isupper() and isPunctuation(sentence[-1])):
        return True
    return False

def isPunctuation(c):
    if(c=='?' or c=='.' or c=='!'):
        return True
    return False
