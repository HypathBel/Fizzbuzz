 /**
 * 
 */

/**
 * @author ivillegas
 *
 */
public class Main {

	/**
	 * @param args
	 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			/*for(int i = 1; i < 101; i++) {
				comprueba(i);
			}*/
			int i =1;
			while(i<101) {
				comprueba(i);
				i++;
			}
		}
		private static String comprueba(int i) {
			String string;
			if(i%3==0 && i%5==0) {
				string = "Fizzbuzz";
				printea(string);
			}
			else if(i%3==0) {
				string = "fizz";
				printea(string);
			}
			else if(i%5==0) {
				string = "buzz";
				printea(string);
			}
			return String.valueOf(i);
			
		}
		private static String printea(String string) {
			return System.out.println(string);
		}

}
	


