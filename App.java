
public class App {

	public static void main(String[] args) {
System.out.println("arg length="+args.length);
    if (args.length==0) {
    	System.out.println("no arguments ");
    }else {
    	for (String arg : args) {
    		System.out.println(arg);
    	}
    	
    }
	}

}
