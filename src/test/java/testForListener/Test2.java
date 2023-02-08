package testForListener;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibraties.BaseClass;

public class Test2  extends BaseClass{
	@Test(retryAnalyzer = genericLibraties.RetryImplimantation.class)	
	public void test2() {
		System.out.println("Test2");
		Assert.fail();
	}
	
	

}
