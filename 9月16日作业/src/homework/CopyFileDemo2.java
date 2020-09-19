package homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CopyFileDemo2 {
	public static String bufferedReader(String path) throws IOException {
		File file = new File(path);
		if (!file.exists() || file.isDirectory())
			throw new FileNotFoundException();
		BufferedReader br = new BufferedReader(new FileReader(file));
		String temp = null;
		StringBuffer sb = new StringBuffer();
		temp = br.readLine();
		while (temp != null) {
			sb.append(temp + " ");
			temp = br.readLine();
		}
		return sb.toString();
	}

	public static String bufferedwrite(String path) {
		
		return path;
		
	}
	
	public static void main(String[] args) throws IOException {
		String path = "./note.txt";// 测试之前先查看是否存在这个文件
		String str = bufferedReader(path);// 调用读文件方法
		System.out.println("打印读出来的内容：" + str);
	}
}
