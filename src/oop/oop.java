package oop;

public class oop {

	public static void main(String[] args) {
	
		ooptest stu1 = new ooptest();
		   ooptest stu2 = new ooptest();
		   ooptest stu3 = new ooptest();
		
		//2.�Զ�����и�ֵ
		    stu1.name="����ʤ";
		    stu1.age=21;
		    stu1.gender='��';
		    stu1.isMarry=false;
		    
		    
		    stu2.name="�߰���";
		    stu2.age=22;
		    stu2.gender='��';
		    stu2.isMarry=false;
		    
		    
		    
		    stu3.name="�����";
		    stu3.age=18;
		    stu3.gender='Ů';
		    stu3.isMarry=false;
		
		//3.���÷���
		    stu1.eat("+С����Ģ��");
		    stu1.sleep("���ҵ�������");
		    stu1.playGame("LOL");
		    String introduce=stu1.introduce(stu1.name, stu1.age, stu1.gender, true);
		    System.out.println(introduce);
	}

}
