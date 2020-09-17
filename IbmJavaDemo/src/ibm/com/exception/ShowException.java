package ibm.com.exception;

public class ShowException {
	public void show(int num)throws MyException{
		if(num<0) {
			MyException me=new MyException("Òì³££º"+num+"Ð¡ÓÚ0");
			throw(me);
		}
	}
}
