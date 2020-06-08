//project euler 25
public class Fibonacci_nth_digit {
	
	//solve using recursion
	public static int helper(int f1, int f2, int fn, int count) {

		fn = f1+f2;
		f1 = f2;
		f2 = fn;
		count++;

		if(Integer.toString(fn).length()==20) {
			return count;
		}

		return helper(f1,f2,fn,count);
	}
	
	//solve using loops
	public static int helperLoop() {
		int f1 = 1, f2 = 1, fn = 0, count = 2;
		
		while(Integer.toString(fn).length()<1000) {
			fn = f1 + f2;
			f1 = f2;
			f2 = fn;
			count++;
		}
		return count;

	}

	public static void fibonacci() {
		int nth = helper(1,1,0,2);
		System.out.println(nth);
	}

	public static void main(String[] args) {
		//fibonacci();
		System.out.println(helperLoop());
	}

}
