package day3;

import java.io.File;
import java.util.ArrayList;

public class FileDir {

	
	public void showAll(File file){
		File[] arr=file.listFiles();
		if(file.isDirectory()) {
			for(File one:arr) {
				System.out.println(one.getName());
				if(one.isDirectory())
					showAll(one);
			}
		}else {
			System.out.println(file.getName());
			System.out.println(file.getName()+"²»ÊÇÄ¿Â¼");
		}
	}
	public static void main(String[] args) {
		FileDir fDir=new FileDir();
		File ft=new File("D:\\1");
		fDir.showAll(ft);
	}
}
