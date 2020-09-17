package tutorial35_RunTimeCheckedExceptions;

public class NumError {
	public void byZero() {
		int value = 7;
		int answer = value/0;
		System.out.println(answer);
	}
}
