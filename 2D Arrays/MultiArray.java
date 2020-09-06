import java.util.*;

class MultiArray{
	static void putArray(int mat[][], int m, int n){
		int i, j;
		System.out.println("Enter the elements of the matrix: ");
		Scanner sc = new Scanner(System.in);
		for(i=0; i<m; i++){
			for(j=0; j<n; j++){
				int item;
				item = sc.nextInt();
				mat[i][j] = item;
			}
		}
	}
	
	static void getArray(int mat[][], int m, int n){
		int i, j;
		System.out.println("Your matrix is: ");
		for(i=0; i<m; i++){
			for(j=0; j<n; j++){
				System.out.print(mat[i][j] + " ");
			}System.out.println();
		}
	}
	
	public static void main(String args[]){
		int r, c;
		System.out.println("Enter number of rows: ");
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
		System.out.println("Enter number of cols: ");
		c = sc.nextInt();
		int mat[][] = new int[r][c];
		putArray(mat, r, c);
		getArray(mat, r, c);
	}
}