package oop;

public class oop {

	public static void main(String[] args) {
	
		ooptest stu1 = new ooptest();
		   ooptest stu2 = new ooptest();
		   ooptest stu3 = new ooptest();
		
		//2.对对象进行赋值
		    stu1.name="刘中胜";
		    stu1.age=21;
		    stu1.gender='男';
		    stu1.isMarry=false;
		    
		    
		    stu2.name="高阿四";
		    stu2.age=22;
		    stu2.gender='男';
		    stu2.isMarry=false;
		    
		    
		    
		    stu3.name="孙慧舒";
		    stu3.age=18;
		    stu3.gender='女';
		    stu3.isMarry=false;
		
		//3.调用方法
		    stu1.eat("+小鸡炖蘑菇");
		    stu1.sleep("教室的桌子上");
		    stu1.playGame("LOL");
		    String introduce=stu1.introduce(stu1.name, stu1.age, stu1.gender, true);
		    System.out.println(introduce);
	}

}
