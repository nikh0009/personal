package nikhil.tripathy.matrix;

import java.util.ArrayList;

import nikhil.tripathy.util.Printer;

//https://practice.geeksforgeeks.org/problems/spirally-traversing-a-matrix-1587115621/1

public class Spiral {
	public static void main(String...args) {
		int arr[][] = {{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 15,16}
		};
		ArrayList<Integer> list = spirallyTraverse(arr,arr.length,arr[0].length);
		list.stream()
		   .forEach(Printer::print);
	}
	/*This algo was from https://www.educative.io/edpresso/spiral-matrix-algorithm, maintain the corner of matrix and 
	 * direction of movement.
	 * */
	public static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		int top = 0, right = c-1, bottom = r-1, left = 0;
		//dir - 1 = right, 2 = down, 3 = left, 4 = up
		int dir = 1;
		while (left <= right && top <= bottom) {
			if (dir == 1) {
				for (int i=left;i<=right;i++) {
					res.add(matrix[top][i]);
				}
				dir = 2;
				top++;
			}
			//dir 2 mean top to down movement
			else if (dir == 2) {
				for (int i=top; i<=bottom; i++) {
					res.add(matrix[i][right]);
				}
				dir = 3;
				right --;
			}
			//dir 3 mean right to left
			else if (dir == 3) {
				for (int i=right; i>=left; i--) {
					res.add(matrix[bottom][i]);
				}
				bottom--;
				dir = 4;
			}
			else if (dir == 4) {
				for (int i=bottom;i>=top;i--) {
					res.add(matrix[i][left]);
				}
				left++;
				dir = 1;
			}
		}
		return res;
	}
}
