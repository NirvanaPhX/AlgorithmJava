public class SelectionSort {
	public static double[] selectionSort (double[] list) {


		for(int j=1;j<list.length;j++){
			
			// Find the index of the minimum number in the list
			// Every time a minimum number is found, the first element can be opted out from the list
			int min = j-1;
			for (int i=j;i<list.length;i++) {
				if (list[i]<list[min]) {
					min = i;
				}
			}

			// Swap the minimum number with first element in the list
			double tmp = list[j-1];
			list[j-1] = list[min];
			list[min] = tmp;
		}

		return list;
	}

	public static void main(String[] args) {

		for (double value : selectionSort(new double[]{2,9,5,4,8,1,6})) {
			System.out.print(value+" ");
		}
	}
}