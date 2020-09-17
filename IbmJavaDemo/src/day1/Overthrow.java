package day1;

public class Overthrow {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9,10,11};
		for(int b:a) {
			System.out.print(b+" ");
		}
		System.out.println();
		reshow(a);
		for(int b:a) {
			System.out.print(b+" ");
		}

	}
	public static void reshow(int[] a) {
		int temp;
		int len=a.length;
		for(int i=0;i<len/2+1;i++) {
			temp=a[i];
			a[i]=a[len-1-i];
			a[len-1-i]=temp;
		}
	}

}
