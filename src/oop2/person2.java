package oop2;

public class person2 {
String name;
String genter;
String ismarry;
String age;

public person2() {
	
}
public person2 (String name,String genter,String ismarry,String age) {
this.name=name;
this.genter=genter;
this. ismarry=ismarry;
this.age=age;
}
public  void show() {
	System.out.println("姓名是"+name+"性别是"+genter+"是否婚配"+ismarry+"年龄是"+age);
}
}