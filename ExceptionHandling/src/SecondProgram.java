public class SecondProgram {

	public static void main(String[] args) {
		String[] s = {"Hello","423",null,"Hi"};
		for(int i=0;i<5;i++)
		{
			try {
				int a=s[i].length()+Integer.parseInt(s[i]);
				System.out.println(a);
			}
			catch(NumberFormatException ex) {
				System.out.println("NumberFormatException");
			}
			catch(NullPointerException ne) {
				System.out.println("Null Pointer Exception");
			}
			catch(Exception e) {
				System.out.println("Array index out of bounds exception");
			}
			System.out.println("continuing....");
		}

	}

}
