package oop.polymorphism;

public class Test {

	public static void main(String[] args) {
	Animal a =new Animal();

	Dog d=new Dog();
	Eyu e= new Eyu();
	
	Animal a1=new Dog();
	Dog d1= (Dog) a1;
	a1.show();
	d.show();
	d1.show();
	d1.color="金黄色";
	d1.show();
	String name ="abc";
	System.out.println(a instanceof  Object); // Animal对象是否属于Object类的一个实例？  属于 
	System.out.println(a1 instanceof Dog);    // 属于
	System.out.println(a1 instanceof Animal);
	System.out.println("abc" instanceof String);
	System.out.println(a1 instanceof Eyu);
   System.out.println(d);
	}

}
