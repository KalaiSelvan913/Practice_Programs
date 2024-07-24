package program;

import pattern.UserBuilderPattern;

public class Test {
	
	
	public static void main(String[] args) {
		
		UserBuilderPattern user = new UserBuilderPattern.Builder("Kalai","Selvan")
				.age(27).address("Chennai").phone("852316497").build();
		
		System.out.println(user);
	}

}
