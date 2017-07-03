package jishiben;
import java.io.*;

public class wenjianliu2 {

	public static void main(String[] args) throws IOException {
		FileReader wjl=new FileReader("F:/java文件/jishiben/src/jishiben/wenjianliu.java");
		//FileInputStream wjl=new FileInputStream("F:/java文件/jishiben/src/jishiben/wenjianliu.java");
        int a=-1;
        try {
			a=wjl.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
        while(a!=-1)
        {
        	System.out.print((char)a);
        	a=wjl.read();
        }
        wjl.close();
	}

}
