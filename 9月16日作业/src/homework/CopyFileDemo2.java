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
		String path = "./note.txt";// ����֮ǰ�Ȳ鿴�Ƿ��������ļ�
		String str = bufferedReader(path);// ���ö��ļ�����
		System.out.println("��ӡ�����������ݣ�" + str);
	}
}
