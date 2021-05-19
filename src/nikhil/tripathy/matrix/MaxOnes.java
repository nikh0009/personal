package nikhil.tripathy.matrix;

public class MaxOnes {
	public static void main(String...args) {
		int mat[][] = {
				{0, 1, 1, 1},
				{0, 0, 1, 1},
				{1, 1, 1, 1},
				{0, 0, 0, 0}
		};
		System.out.println(oneCount(mat));
	}
	
	public static int oneCount(int mat[][]) {
		int global = Integer.MIN_VALUE;
		int index = -1, r = mat.length, c = mat[0].length, maxIndex = -1;
		
		for(int i=0;i<r;i++) {
			index = binaryCount(mat[i], 0, c-1);
			if (index != -1 && c - index > global) {
				global = c -index;
				maxIndex = i;
			}
		}
		return maxIndex;
	}
	
	public static int binaryCount(int arr[], int lo, int hi) {
		if (lo <= hi) {
			int mid = lo + (hi - lo)/2;
			if (mid == 0 || (arr[mid] == 1 && arr[mid-1] == 0))
				return mid;
			else if (arr[mid] == 0)
				return binaryCount(arr,mid+1,hi);
			else 
				return binaryCount(arr,lo,mid-1);
		}
		return -1;
	}
}
