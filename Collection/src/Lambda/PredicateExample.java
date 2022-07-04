package Lambda;

import java.util.function.Predicate;

public class PredicateExample {
//	public static boolean salaryCheck(int salary) {
//		if(salary>=4000) {
//			return true;
//		}else
//			return false;
//	}

	public static void main(String[] args) {
		int salary = 3000;
		//boolean res = salaryCheck(salary);
		Predicate<Integer> p = i->i>=4000;
		System.out.println(p.test(salary));
	}

}
