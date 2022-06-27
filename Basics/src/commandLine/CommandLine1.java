package commandLine;
public class CommandLine1 {

	public static void main(String[] args) {
		
		System.out.println(args.length);
		for(String x : args)
		System.out.print(x + " ");
	}

}
