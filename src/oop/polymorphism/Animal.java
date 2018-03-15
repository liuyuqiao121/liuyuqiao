package oop.polymorphism;

public class Animal {
	int age;
	String color;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public Animal() {
		}
	public  Animal(int age ,String color) {
		this.age=age;
		this.color=color;
		}
	public void show() {
	System.out.println("年龄是"+"this.age"+"衣服颜色是"+"this.color");
		}
	}
