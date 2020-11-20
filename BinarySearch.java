/*
-----------------Binary Search-------------------
Given a double value key, and a sorted list of double values.
The program will try to find the key inside the list.
It sets up 3 
The program compares the key to the value in the middle of the list.
If the key is bigger, it will discard the first half of the list before middle index.
If the key is smaller, it will discard the second half of the list after middle index.
It will repeat the process until it finds the value 
when key is equal to a value inside the list.
Then the program will return the index of that value.
Or when the pointer low is greater than high. 
It means there is no such a value in the list.
And the program will return -1.

Time Complexity: O (log n)

@author: Xiaomeng Li
@version: Nov 19, 2020
*/
public class BinarySearch {
	public static int binarySearch (double key, double[] list) {
		int low = 0;
		int high = list.length-1;;

		while(high>=low){
			int mid = (high+low)/2;
			if(key>list[mid]) {
				low = mid+1;
			}
			else if(key<list[mid]) {
				high = mid-1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}

	public static void main (String[] args) {
		System.out.println(binarySearch(1.2, new double[] {0.1, 0.5, 0.8, 1.1, 1.2, 2.5, 6.6}));

	}
}