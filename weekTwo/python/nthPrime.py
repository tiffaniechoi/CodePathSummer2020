# Helper function that determines if a number is prime
# given the list of all known prime numbers preceding it.
# Input: `candidate` (int), the potential prime number
#        `known_primes` (list of ints), list of all known
#          primes preceding the candidate
# Output: bool, True if `candidate` is prime
def isPrime(candidate, known_primes):
  for p in known_primes:
    if candidate % p == 0:
      # `candidate` is composite, so no need to check this 
      # number any further.
      return False
  return True

# Computes the nth prime and returns it.
# Input: `n` (int), representing the desired prime
# Output: the nth prime (int) or None
def nth_prime(n):
  # edge case: `n` must be > 0.
  if n <= 0:
    return None
  potential_prime = 2  # the first prime
  primes = []
  # keep potentially adding to primes until we have `n` of 
  # them.
  while len(primes) < n:
    if isPrime(potential_prime, primes):
      # `potetial_prime` is prime, so add it to the list 
      # of primes.
      primes.append(potential_prime)
    potential_prime += 1
  # we only need to return the last element, the nth prime.
  return primes[-1]

print(nth_prime(2))
print(nth_prime(4))
print(nth_prime(8))
print(nth_prime(10001))
