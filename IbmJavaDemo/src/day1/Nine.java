package day1;

public class Nine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<10;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+"*"+i+"="+i*j+"\t");
				//System.out.print("\t");
			}
			System.out.println();
		}
	}

}
