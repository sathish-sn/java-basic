package List;
import java.util.*;
class ArrayList_ex {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		//List al1 = new ArrayList();
		//ArrayList alist = new ArrayList(30);
		//ArrayList alist1 = new ArrayList(Collection c);
		al.add("john");
		al.add(true);
		al.add(10);
		System.out.println(al);
		//al.remove(1);//remove using index
		
		al.remove(new Integer(10));
		System.out.println(al);
		System.out.println(al.get(1));
	}

}
