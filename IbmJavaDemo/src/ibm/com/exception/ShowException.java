package ibm.com.exception;

public class ShowException {
	public void show(int num)throws MyException{
		if(num<0) {
			MyException me=new MyException("�쳣��"+num+"С��0");
			throw(me);
		}
	}
}
