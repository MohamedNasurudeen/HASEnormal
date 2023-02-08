package testForListener;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibraties.BaseClass;

//@Listeners(genericLibraties.ListenerImplimentation.class)
public class Test1  extends BaseClass{
	
	@Test(retryAnalyzer = genericLibraties.RetryImplimantation.class)
	public void test1() {
		System.out.println("Test1");
		Assert.fail();
	}

}
