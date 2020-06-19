## Ancient messages were encrypted in a very simple way - by assigning each letter a value and "rotating" that letter by a given number - this is called a "Caesar Cipher" 

## a = 1, b = 2, c = 3 etc
## after you apply a rotation of 3
## "abc" becomes "def", "cat" becomes "fdw"
## Write a function that can encrypt a string using a given number as a Caesar Cipher

# Some tips
# ord('a') -> 97
# ord('c') -> 99 == ord('a') + 2
# chr(97) -> 'a'
# ord(chr(x)) == x

#.               97 (a) <--------> 122 (z)
# 0 (?) <-----> 25 (?)
#         offset (?). <-------> offset + 25 (?) % 26
# 0 (?) <-----> 25 (?)
#.               97 (a) <--------> 122 (z)

# All inputs will be lower case letters

def CaesarCipher(input_str, offset):
    
  newStr = ''
  
  for i in range(len(input_str)):
    currChar = input_str[i]
    
    currNum = ord(currChar) - 97
    newNum = (currNum + offset) % 26
    newChar = chr(newNum + 97)
    newStr += newChar
    
  return newStr

print(CaesarCipher('acf', 4)) # egj
print(CaesarCipher('zcf', 25)) # ???
