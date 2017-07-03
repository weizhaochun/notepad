package jishiben;

import java.io.*;

public class fuzhizhantie {

	public static void main(String[] args) throws IOException {
		//FileReader fz=new FileReader("F:/java文件/jishiben/src/jishiben/wenjianliu.java");
		//FileWriter zt=new FileWriter("F:/java文件/jishiben/src/jishiben/wenjianliu1.java");
		
		FileInputStream fz=new FileInputStream("F:/java文件/jishiben/src/jishiben/wenjianliu.java");
		FileOutputStream zt=new FileOutputStream("F:/java文件/jishiben/src/jishiben/wenjianliu3.java");
		int a;
		a=fz.read();
		while(a!=-1)
		{
			zt.write(a);
			a=fz.read();
		}
		zt.flush();
		fz.close();
		zt.close();
	}

}
