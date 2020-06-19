import java.util.*; 

public class Merge_Overlapping_Intervals {
	/*
	 * Complete the 'merge_overlapping_intervals' function below.
	 *
	 * The function is expected to return a 2D_INTEGER_ARRAY.
	 * The function accepts 2D_INTEGER_ARRAY intervals as parameter.
	 * The function will go through the intervals, merge any 
	 * intervals that overlap, sort, and return the final array.
	 *
	 */


	public static List<List<Integer>> merge_overlapping_intervals(List<List<Integer>> intervals) {

		/**IF NOT SORTED ALREADY
		Collections.sort(intervals,new Comparator<List<Integer>>(){ 
			@Override
			public int compare(List<Integer> o1, List<Integer> o2) {
				return o1.get(0)-o2.get(0);
			}
		}); 
		*/
		int index = 0;
		
		for(List<Integer> list: intervals) {
			if(list.get(0) < intervals.get(index).get(1)) {
				
				List<Integer> temp = new ArrayList<>();
				temp.add(intervals.get(index).get(0));
				temp.add(list.get(1));
				intervals.set(index, temp);
				
			} else {
				index++;
				intervals.set(index, list);
			}

		}
		intervals.remove(index);
		return intervals;
	}

}
