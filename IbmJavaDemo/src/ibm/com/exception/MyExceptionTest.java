package ibm.com.exception;

public class MyExceptionTest {

	public static void main(String[] args) {
		ShowException se=new ShowException();
		try {
			se.show(-3);
		}catch(MyException e) {
			System.out.println(e.getMessage());
		}
	}

}
