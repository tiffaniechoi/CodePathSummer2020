# Computes the largest prime factor of a given input.
# Input: `n` (int)
# Output: the largest prime factor of n (int) or None

def largest_prime_factor(n):
  # edge case: `n` must be >= 2.
  if n < 2:
    return None
  potential_prime_factor = 2  # `ppf`
  prime_factors = []
  while potential_prime_factor <= n:
    if n % potential_prime_factor == 0:
      # `ppf` divides evenly into `n`, so divide it into 
      # `n` and add it to the list of prime factors.
      n /= potential_prime_factor
      prime_factors.append(potential_prime_factor)
    else:
      # `ppf` doesn't divide evenly into `n`, so check the 
      # next number.
      potential_prime_factor += 1
  # `prime_factors` now has all prime factors of `n`, so 
  # just return the largest. We could also return
  # `prime_factors[-1]` or just keep track of the current
  # largest prime factor since that is the only one we
  # need.
  return max(prime_factors)

print(largest_prime_factor(5))  # should be 5
print(largest_prime_factor(26))  # should be 13
print(largest_prime_factor(13195))  # should be 29
print(largest_prime_factor(600851475143))  # 6857
