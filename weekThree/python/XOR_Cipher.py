## Given that we were able to create a Caesar Cipher, let's use a different operation. We'll "XOR" (in Python, ^ ) a given number into each letter to produce a different number, and then we'l use that number to produce a letter instead.

## Write a function that takes a string to encrypt and the xor value to encrypt it with.

def xor_cipher(string, encoding_number):
  return ''.join([
    chr(ord(c) ^ encoding_number)
    for c in string
  ])

print(xor_cipher('cat', 5)) # Should be 'fdq'
