package oop;

public class ooptest {
	String name;
	int age;
	char gender;
	
	boolean isMarry;
	public void eat(String food){
		System.out.println("吃饭-----红烧排骨+猪头肉+绿豆汤"+food);
	}
	public void sleep(String location){
		System.out.println("休息-----学生在"+location+"休息");
	}
	public void playGame(String name){
		System.out.println("打游戏-----"+name);
	}
	public  String introduce(String name,int age,char gender,boolean isMarry){
		return  "自我介绍      姓名:"+name+",年龄："+age+"岁,性别："+gender+",婚否："+isMarry; // 拼接字符串
	}

}
