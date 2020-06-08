##project euler 25, find the nth digit of fibonacci sequence

##use a loop to solve
def fibonacci():

    f1 = 1
    f2 = 1
    count = 2
    fn = 0

    while len(str(fn)) < 1000:
        
          fn = f1 + f2
          f1 = f2
          f2 = fn
          count+=1

    return count

##use recursion to solve, works with small numbers only 
def fibonacciHelper(f1,f2,fn,count):

    if len(str(fn)) < 1000:
        fn = f1 + f2
        f1 = f2
        f2 = fn
        count+=1
        
        return fibonacciHelper(f1,f2,fn,count)
    
    return count    

def main():

    ##print(fibonacciHelper(1,1,0,2))
    print(fibonacci())

main()
