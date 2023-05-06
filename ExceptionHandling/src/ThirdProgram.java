public class ThirdProgram {
	public static void main(String[] args) {
		System.out.println("FirstLine");
		System.out.println("SecondLine");
		int[] myIntArray = new int[] {1,2,3};
		print(myIntArray);
		System.out.println("Third Line");
	}
	public static void print(int[] arr) {
		try {
			System.out.println(arr[3]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Fourth element");
		}
	}

}
