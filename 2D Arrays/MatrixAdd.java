/* In this program I will be implementing matrix sum operation using 
classes imported from other packages */

import java.util.*;
import matrix.MultiArray;

class MatrixAdd{
	static int[][] addMat(int mat1[][], int mat2[][], int m, int n){
		int i, j;
		int finalMat[][] = new int[m][n];
		for(i=0; i<m; i++){
			for(j=0; j<n; j++){
				int item;
				item = mat1[i][j] + mat2[i][j];
				finalMat[i][j] = item;
			}
		}
		
		return(finalMat);
	}
	
	public static void main(String args[]){
		int m, n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of rows: ");
		m = sc.nextInt();
		
		System.out.println("Enter number of cols: ");
		n = sc.nextInt();
		
		System.out.println("Enter the values of first matrix: ");
		int arr1[][] = new int[m][n];
		int mat1[][] = MultiArray.putArray(arr1, m, n);
		
		System.out.println("Enter the values of second matrix: ");
		int arr2[][] = new int[m][n];
		int mat2[][] = MultiArray.putArray(arr2, m, n);
		
		System.out.println("Your First matrix is: ");
		MultiArray.getArray(mat1, m, n);
		
		System.out.println("Your second matrix is: ");
		MultiArray.getArray(mat2, m, n);
		
		int matf[][] = new int[m][n];
		matf = addMat(mat1, mat2, m, n);
		System.out.println("Your matrix after addition is: ");
		MultiArray.getArray(matf, m, n);
	}
}