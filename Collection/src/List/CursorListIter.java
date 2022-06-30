package List;
import java.util.*;
public class CursorListIter {

	public static void main(String[] args) {
		ArrayList<String> data = new ArrayList<String>();
		data.add("Raj");
		data.add("Ramesh");
		data.add("sathish");
		data.add("john");
		data.add("Rajesh");
		System.out.println(data);
		ListIterator li = data.listIterator();
		while(li.hasNext()) {
			String item = (String)li.next();
			if(item.equals("john"))
			{
				li.add("Cena");
			}
			if(item.equals("Raj")) {
				li.remove();
			}if(item.equals("sathish")) {
				li.set("Rock");
			}
			
		}
		System.out.println(data);
	}

}
