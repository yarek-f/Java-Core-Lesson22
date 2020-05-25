package lviv.lgs.ua.task1;

public class Application {

	public static void main(String[] args) {

		Pet cat = () -> System.out.println("I'm cat - meow-meow-meow");
		Pet cow = () -> System.out.println("I'm cow - muu-muu-muu");
		Pet dog = () -> System.out.println("I'm dog - gaw-gaw-gaw");

		cat.voice();
		cow.voice();
		dog.voice();
	}

}

interface Pet {
	void voice();
}