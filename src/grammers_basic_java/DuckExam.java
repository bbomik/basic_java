package grammers_basic_java;

public class DuckExam {

	public static void main(String[] args) {
		Duck duck = new Duck();
		duck.sing();
		duck.fly();
		
		/* 추상클래스는 부모클래스로서의 역할은 가능
		 * 하지만 추상클래스 자체를 이용해 객체를 이용하는 것은 불가능.
		Bird b = new Bird(); <<추상클래스 자체를 이용해 객체를 이용시 에러남
		 */

	}

}
