public class Main {
	public static void main(String[] args){
		for(int i = 0; i < 5 ; i++) {
			printStart();
		}
	}
	private static void printStart() {
		for(int i = 0 ; i < 10 ; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}