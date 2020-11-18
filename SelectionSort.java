/*
----------------Selection sort-------------------

It sorts a list in ascending order by finding the smallest number in the list 
and swaps with the first element in the list.
Then, it finds the next smallest number and place it into the second element.
It keeps doing until finish going through the whole list.
@author: Xiaomeng Li
@version: Nov 17, 2020

Input: a list of double values, double [] list

Output: a list of double values in ascending order.

*/

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