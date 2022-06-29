package String;

public class StringBuilder_ex {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		sb.append("0123456789");
		sb.delete(2,7);
		System.out.println(sb);
		sb.insert(2, 23456);
		System.out.println(sb);
		System.out.println(sb.reverse());
		StringBuffer obj = new StringBuffer("a");
			System.out.println(obj.append("b").append("cd").delete(0,2).reverse());
			System.out.println(obj.charAt(0));
			
	}

}
