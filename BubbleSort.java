/*
Bubble sort is a sorting algorithm that starts at the first element in the list
and compare its value with its successive element, 
and swap their values if they are in decreasing order.
Then, it goes on until finish go through the list.

After each loop,  it ensures the biggest number in the remaining list
to pop up on top to be the last element in the list


Time Complexity: O(n^2)

@version: Novemeber 18th, 2020
@author: Xiaomeng Li
*/
public class BubbleSort {
	public static double[] bubbleSort(double[] list) {
		for(int j=list.length;j>0;j--){
			for(int i=1;i<j;i++) {
				if(list[i]<list[i-1]) {
					double tmp = list[i-1];
					list[i-1] = list[i];
					list[i] = tmp;
				}
			}
		}
		return list;
	}

	public static void main (String[] args) {
		for(double value : bubbleSort(new double [] {5,6,7,4,3,1,2})){
			System.out.print(value+" ");
		}
	}
}