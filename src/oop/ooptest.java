package oop;

public class ooptest {
	String name;
	int age;
	char gender;
	
	boolean isMarry;
	public void eat(String food){
		System.out.println("�Է�-----�����Ź�+��ͷ��+�̶���"+food);
	}
	public void sleep(String location){
		System.out.println("��Ϣ-----ѧ����"+location+"��Ϣ");
	}
	public void playGame(String name){
		System.out.println("����Ϸ-----"+name);
	}
	public  String introduce(String name,int age,char gender,boolean isMarry){
		return  "���ҽ���      ����:"+name+",���䣺"+age+"��,�Ա�"+gender+",���"+isMarry; // ƴ���ַ���
	}

}
