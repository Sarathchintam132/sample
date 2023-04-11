
public class App3 {

	public static void main(String[] args) {
		if (args != null && args.length > 0) {
			System.out.println(args.length);
			for (int i = 0; i < args.length; i++) {
			String commandLine = args[i];
			System.out.println(i+"commandline argument "+commandLine);
		}
	}else {
		System.out.println("no arguments available");
	}
	}
}
