package lviv.lgs.ua.task3;

public class Application {

	public static void main(String[] args) {

		Frog eat = () -> System.out.println("I eat sweet flies");
		Frog sleep = () -> System.out.println("I sleep");
		Frog swimm = () -> System.out.println("I swim very fast");
		Frog walk = () -> System.out.println("I walk");

		eat.action();
		sleep.action();
		swimm.action();
		walk.action();
	}

}

interface Frog {
	public void action();
}