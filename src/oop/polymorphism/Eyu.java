package oop.polymorphism;

public class Eyu extends Animal {
	String language;
	public String getLanguage() {
		return language;
		}
	public void setLanguage(String language) {
		this.language=language;
	}
	public Eyu() {
		super();
	}
	public Eyu(String language) {
		this.language=language;
	}
	public Eyu( int age,String color,String language) {
		super(age,color);
		this.language=language;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((language == null) ? 0 : language.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Eyu other = (Eyu) obj;
		if (language == null) {
			if (other.language != null)
				return false;
		} else if (!language.equals(other.language))
			return false;
		return true;
	}
	public void show() {
		System.out.println("年龄是"+this.age+"颜色是"+this.color+"习惯性预言是"+"language");
	}
}
