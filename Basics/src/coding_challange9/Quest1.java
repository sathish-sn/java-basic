/**
 * A 2-dimensional point represents a location in (x,y) co-ordinate space.
Create a Point class, which will have two fields of int type: x and y.
User should be able to create Point instances in following ways:
a) Pass x and y co-ordinate values at the time of initialization.
b) If x and y values are not passed, then both x and y should be 0.
Provide the printPoint() method, which should print "Point: (x, y)" on to the console, x and y should
get replaced by values at runtime.
 * 
 */


package coding_challange9;

public class Quest1 {

	public static void main(String[] args) {
		Quest1_tes x = new  Quest1_tes();
		x.print();
		Quest1_tes x1 = new  Quest1_tes("test");
		x1.print();
		Quest1_tes x2 = new  Quest1_tes(9876.00873);
		x2.print();
		Quest1_tes x3 = new  Quest1_tes("test" , 5.6);
		x3.print();
		
	}

}
