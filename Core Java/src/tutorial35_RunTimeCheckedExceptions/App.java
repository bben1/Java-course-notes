package tutorial35_RunTimeCheckedExceptions;

public class App {

	public static void main(String[] args) {
		//NumError num = new NumError();
		//num.byZero();//returns a runtime exception
		
		StringError string = new StringError();
		string.stringLength();//returns a runtime exception
	}

}
