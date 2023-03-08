package src;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i<101 ; i++) {
			System.out.println(comprueba(i));
		}
	}
	private static String comprueba(int i) {
		if(i%3==0 && i%5==0) {
			return "Fizzbuzz";
		}
		if(i%3==0) {
			return "Fizz";
		}
		if(i%5==0) {
			return "buzz";
		}
		return String.valueOf(i);

	}
	

}
