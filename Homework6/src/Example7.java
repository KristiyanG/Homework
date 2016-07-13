public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 11, 12, 13, 14, 15, 16 }, { 21, 22, 23, 24, 25, 26 },
				{ 31, 32, 33, 34, 35, 36 }, { 41, 42, 43, 44, 45, 46 },
				{ 51, 52, 53, 54, 55, 56 }, { 61, 62, 63, 64, 65, 66 } };
		int obshtaSuma = 0;
		int i=0;
		for (int j = 0; i < arr.length; j++) {
			int sum = 0;
			if(i%2==0){
			System.out.print(arr[i][i]+","+arr[i][2]+","+arr[i][4]);
			sum=arr[i][i]+arr[i][2]+arr[i][4];
			System.out.println(" Sumata e " + sum);
			obshtaSuma += sum;
			i++;
			}
			else{
				System.out.print(arr[i][i]+","+arr[i][1]+","+arr[i][3]);
				sum=arr[i][i]+arr[i][1]+arr[i][3];
				System.out.println(" Sumata e " + sum);
				obshtaSuma += sum;
				i++;
			}
		}
		System.out.println(obshtaSuma);
	}

}
