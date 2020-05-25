package lviv.lgs.ua.task2;

public class Main {

	public static void main(String[] args) {

		Hospital o = () -> "Patient - ";
		p1(o.hover(), "Ihor", "male");
		p2(o.hover(), "Olya", "female", 23);
		p3(o.hover(), "Jeck", "male", 27, true);

	}

	public static void p1(String p1, String name, String sex) {
		System.out.println(p1 + name + " " + sex);
	}

	public static void p2(String p2, String name, String sex, int age) {
		System.out.println(p2 + name + sex + " " + age);
	}

	public static void p3(String p3, String name, String sex, int age, boolean smoking) {
		System.out.println(p3 + name + " " + sex + " " + age + " " + smoking);
	}
}

interface Hospital {
	String hover();
}
