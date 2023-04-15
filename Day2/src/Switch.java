public class Switch {

	public static void main(String[] args) {
		char x='l';
		switch(x) {
		case'l':
		case'L':
			System.out.println(x+ " is a letter");
			break;
		case'd':
		case'D':
			System.out.println(x+ " is a digit");
			break;
		}

	}

}
