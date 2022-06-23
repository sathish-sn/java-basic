package Arrays;

public class Ex1 {

	public static void main(String[] args) {
		int []arr =new int[10];
		for(int i=0,j=10;i<arr.length;i++,j+=10)
		{
			arr[i]=j;
		}
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}

}
