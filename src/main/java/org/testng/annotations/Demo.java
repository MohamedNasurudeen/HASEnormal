package org.testng.annotations;

public class Demo {
@Test(invocationCount = 3, threadPoolSize = 3)
public void login() {
	System.out.println("Login Page");
}

@Test
public void signup() {
	throw new ArithmeticException();
	//System.out.println("Signup Page");
}

@Test
public void logout() {
	System.out.println("Logout");
}

}
