
public class Example13 {

	public static void main(String[] args) {
		
		int[] arr1={1,2,3,4};
		int[] arr2={5,6,7,8};
		
		int[] bigArray=makeArray(arr1, arr2);
		for (int i = 0; i < bigArray.length; i++) {
			System.out.print(bigArray[i]+" ");
		}

	}
	static int[] makeArray(int[] arr1,int[] arr2){
		int[] newArray=new int[arr1.length+arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			newArray[i]=arr1[i];
		}
		
		for (int i =0; i < arr2.length; i++) {
			newArray[arr1.length+i]=arr2[i];
		}
		return newArray;
		
	}

}
