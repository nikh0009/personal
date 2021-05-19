package nikhil.tripathy.matrix;

import java.util.Arrays;

import nikhil.tripathy.util.Printer;

public class MatrixSearch {
	
	public static void main(String...args) {
//		int mat[][] = {{1,3,5,7},
//				{10,11,16,20},
//				{23,30,34,60}
//		};
		int mat[][] = {
				{1,3}
		};
		int target = 3;
		
		System.out.println(searchMatrix(mat, target));
	}
	
	public static boolean searchMatrix(int[][] mat, int tar) {
		int r = mat.length;
		int c = mat[0].length;
		
		for (int i=0;i<r;i++) {
			if (tar <= mat[i][c-1] && tar >= mat[i][0])
				return binarySearch(mat[i], tar, 0, c-1);
		}
		return false;
	}
	
	public static boolean binarySearch(int arr[], int tar, int lo, int hi) {
		Arrays.stream(arr)
		.forEach(Printer::print);
		if (lo <= hi) {
			int mid = lo + (hi-lo) / 2;
			if (arr[mid] == tar)
				return true;
			else if (arr[mid] > tar) {
				return binarySearch(arr, tar, lo, mid-1);
			}
			else
				return binarySearch(arr, tar, mid+1, hi);
		}
		return false;
	}
}
