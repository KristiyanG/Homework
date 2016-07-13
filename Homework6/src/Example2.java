import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x;
		do {
			System.out.println("Vuvedi razmera na masiva");
			x = sc.nextInt();
		} while (x < 0);
		int[][] arr = new int[x][x];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println("Cell : " + (i + 1) + ";" + (j + 1));
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j) {
					System.out.print(arr[i][j] + " ");
				}
			}
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			for (int j=0; j < arr.length; j++) {
				if(i+j==arr.length-1){
				System.out.print(arr[i][j] + " ");
				
				}
			}
		}
	}

}
