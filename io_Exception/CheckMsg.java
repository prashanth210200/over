package io_Exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckMsg {
public static void main(String[] args) throws FileNotFOundException, IOException {
	File f=new File("C:\\Users\\divya\\Documents\\java 1.txt");
	FileReader fr=new FileReader(f);
	int temp=0;
	while((temp=fr.read())!=-1) {
		System.out.println((char)(temp));
	}
}
}
