package com.raj.testing;

import java.io.File;
import java.io.IOException;

public class FileOper {
public static void main(String[] args) throws IOException {
	File f1 = new File("D:\\Automation Testing\\Vaishu");
	
	/*FileUtils.write(f1, "i am shalu");
	FileUtils.write(f1, "\r\ni am raj", true);
	FileWriter fw = new FileWriter(f1, true);
	fw.write("\r\ni am learning java");
	fw.close();
	List<String> list = FileUtils.readLines(f1);
	for (String string : list) {
		if (string.contains("java")) {
			System.out.println("File contains java: true");
		}
		
	}*/
	String[] list = f1.list();
	for (String string : list) {
		if (string.contains(".txt")) {
			System.out.println(string);

		}
	}
	
}
}
