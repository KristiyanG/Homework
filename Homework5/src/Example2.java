
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={2,9,8,48,35};
		int[] newArr=new int[arr.length*2];
		for (int i = 0; i < arr.length; i++) {
			newArr[i]=arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			newArr[arr.length*2-1-i]=arr[i];
		}
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i]+" ");
		}
	}

}
