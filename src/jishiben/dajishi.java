package jishiben;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;


public class dajishi extends JFrame implements ActionListener
{
	int x=20;
    JMenuBar cd;
    JMenu  cd1,cd2,cd3,cd4,cd5;
    JMenuItem cd11,cd12,cd13,cd21,cd22,cd31,cd32,cd33,cd34,cd35,cd41,cd42,cd43,cd44,cd51,cd52;
    JTextArea wby;
	private Font font;
	private String nr;
	public static void main(String[] args) {
		dajishi a=new dajishi();

	}
	dajishi()
	{
		cd=new JMenuBar();
		cd1=new JMenu("�ļ�");
		cd2=new JMenu("�༭");
		cd3=new JMenu("������ɫ");
		cd4=new JMenu("��������");
		cd5=new JMenu("�����С");
		
		cd11=new JMenuItem("�½�");
		cd11.addActionListener(this);
		cd11.setActionCommand("new");
		cd12=new JMenuItem("��");
		cd12.addActionListener(this);
		cd12.setActionCommand("open");
		cd13=new JMenuItem("����");
		cd13.addActionListener(this);
		cd13.setActionCommand("save");
		
		cd21=new JMenuItem("����");
		cd21.addActionListener(this);
		cd21.setActionCommand("copy");
		cd22=new JMenuItem("ճ��");
		cd22.addActionListener(this);
		cd22.setActionCommand("paste");
		
		cd31=new JMenuItem("��ɫ");
		cd31.addActionListener(this);
		cd31.setActionCommand("blue");
		cd32=new JMenuItem("��ɫ");
		cd32.addActionListener(this);
		cd32.setActionCommand("rad");
		cd33=new JMenuItem("��ɫ");
		cd33.addActionListener(this);
		cd33.setActionCommand("yellow");
		cd34=new JMenuItem("��ɫ");
		cd34.addActionListener(this);
		cd34.setActionCommand("green");
		cd35=new JMenuItem("��ɫ");
		cd35.addActionListener(this);
		cd35.setActionCommand("black");
		
		cd41=new JMenuItem("����");
		cd41.addActionListener(this);
		cd41.setActionCommand("1");
		cd42=new JMenuItem("б��");
		cd42.addActionListener(this);
		cd42.setActionCommand("2");
		cd43=new JMenuItem("б��");
		cd43.addActionListener(this);
		cd43.setActionCommand("3");
		cd44=new JMenuItem("����");
		cd44.addActionListener(this);
		cd44.setActionCommand("0");
		
		cd51=new JMenuItem("����");
		cd51.addActionListener(this);
		cd51.setActionCommand("bigger");
		cd52=new JMenuItem("��С");
		cd52.addActionListener(this);
		cd52.setActionCommand("smaller");
		
		wby=new JTextArea();

		
		cd.add(cd1);cd.add(cd2);cd.add(cd3);cd.add(cd4);cd.add(cd5);
		cd1.add(cd11);cd1.add(cd12);cd1.add(cd13);
		cd2.add(cd21);cd2.add(cd22);
		cd3.add(cd31);cd3.add(cd32);cd3.add(cd33);cd3.add(cd34);cd3.add(cd35);
		cd4.add(cd41);cd4.add(cd42);cd4.add(cd43);cd4.add(cd44);
		cd5.add(cd51);cd5.add(cd52);
		
		this.setJMenuBar(cd);this.add(wby);
		this.setTitle("���±�");
		this.setSize(400, 500);
		this.setLocation(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	    if(e.getActionCommand().equals("new"))
	    {
	    	dajishi b=new dajishi();
	    }
	    if(e.getActionCommand().equals("open"))
	    {
	    	JFileChooser xz=new JFileChooser();
	    	xz.setDialogTitle("�ļ���");
	    	xz.showOpenDialog(null);
	    	xz.setVisible(true);
	    	
	    	String wjlj=xz.getSelectedFile().getAbsolutePath();//�õ��ļ�ȫ·��
	    	
	    	FileReader wjl = null;BufferedReader hcl=null;
	    	try {
				wjl=new FileReader(wjlj);
				hcl=new BufferedReader(wjl);
				String s="",zfc="";
				while((s=hcl.readLine())!=null)
				{
					zfc+=s;
				}
				wby.setText(zfc);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	    	finally
	    	{
	    		try {
					wjl.close();
					hcl.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	    		
	    	}
	   
	    }
	    if(e.getActionCommand().equals("save"))
	    {
	    	JFileChooser bclj=new JFileChooser();
	    	bclj.setDialogTitle("���Ϊ");
	    	bclj.showOpenDialog(null);
	    	bclj.setVisible(true);
	    	
	    	String lj=bclj.getSelectedFile().getAbsolutePath();
	    	try {
				PrintStream bc=new PrintStream(lj);
				System.setOut(bc);
				System.out.println(this.wby.getText());
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	    }
	    
	    if(e.getActionCommand().equals("copy"))
	    {
	    	wby.copy();   	
	    }
	    if(e.getActionCommand().equals("paste"))
	    {
	    	wby.paste();	
	    }
	    
	    if(e.getActionCommand().equals("blue"))
	    {
	    	wby.setForeground(Color.blue);
	    }
	    if(e.getActionCommand().equals("rad"))
	    {
	    	wby.setForeground(Color.red);
	    }
	    if(e.getActionCommand().equals("yellow"))
	    {
	    	wby.setForeground(Color.yellow);
	    }
	    if(e.getActionCommand().equals("green"))
	    {
	    	wby.setForeground(Color.green);
	    }
	    if(e.getActionCommand().equals("black"))
	    {
	    	wby.setForeground(Color.black);
	    }
	    
	    if(e.getActionCommand().equals("1"))
	    {   
	    	wby.setFont(getFont().deriveFont(1));
	    }
	    if(e.getActionCommand().equals("2"))
	    {	
	    	wby.setFont(getFont().deriveFont(2));
	    }
	    if(e.getActionCommand().equals("3"))
	    {	
	    	wby.setFont(getFont().deriveFont(3));
	    }
	    if(e.getActionCommand().equals("0"))
	    {	
	    	wby.setFont(getFont().deriveFont(0));
	    }
	    
	    if(e.getActionCommand().equals("bigger"))
	    {	
	    	font = wby.getFont();
	    	x++;
	    	wby.setFont(new Font(font.getName(),Font.PLAIN,x));
	    }
	    if(e.getActionCommand().equals("smaller"))
	    {	
	    	font = wby.getFont();
	    	x--;
	    	wby.setFont(new Font(font.getName(),Font.PLAIN,x));
	    }
	}

}
