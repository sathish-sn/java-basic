package For_each;

public class For_eachEX {

	public static void main(String[] args) {

			int[] arr = {10,20,30,40,50};
			for(int i=0; i<arr.length;i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			System.out.println("..............");
			for(int x:arr) {
				System.out.print(x + " ");
			}
	}

}
