package io.javabrains.unit1;

public class Greeter {

	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {
		Greeter greeter = new Greeter();

		HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
		greeter.greet(helloWorldGreeting);
		/*****/

		Greeting lambdaGreeting = () -> System.out.println("Hello world lambdaGreeting!");
		greeter.greet(lambdaGreeting);

		/*****/

		Greeting innerClassGreeting = new Greeting() {
			public void perform() {
				System.out.println("Hello world innerClassGreeting!");
			}
		};
		greeter.greet(innerClassGreeting);

		/*****/

		greeter.greet(() -> System.out.println("()-> Hello world!"));

		/*****/

	}

}
