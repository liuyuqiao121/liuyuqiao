package oop.polymorphism;

public class Dog extends Animal {
String language;
public String getLanguage() {
	return language;
}
public void setLanguage(String language) {
	this.language=language;
}
public Dog() {
	super();
}
public Dog(String language) {
	this.language=language;
}
public Dog(int age,String color,String language) {
	super(age,color);
	this.language=language;
}

@Override
public String toString() {
	return "Dog [language=" + language + "]";
}
public void show() {
	System.out.println("年龄是"+age+"颜色是"+color+"习惯性说的话是"+language);
	
}

}
