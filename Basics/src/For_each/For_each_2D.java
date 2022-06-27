package For_each;

public class For_each_2D {

	public static void main(String[] args) {
		char[][] vowels = {
				{'a','A'},
				{'e','E'},
				{'i','I'},
				{'o','O'},
				{'u','U'}
				
		};
		for(char[] rows : vowels) {
			for (char val : rows) {
				System.out.print(val + "\t");
			}
			System.out.println();
		}
	}

}
