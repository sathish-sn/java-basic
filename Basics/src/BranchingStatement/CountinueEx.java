package BranchingStatement;

public class CountinueEx {

	public static void main(String[] args) {
		int searchfornum =17;
		int count=0;
		outer:
			for(int i=0;i<100;i++) {
				for(int j=0; j<10;j++) {
					int num =i*j;
					if(num==searchfornum)
					{
						count++;
						if(j==1)
						continue outer;
					}
					
					}
				}
		System.out.println(searchfornum + " appears " + count + " times");
	}

}
