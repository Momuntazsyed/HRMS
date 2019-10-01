package testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class grouptest {
  @Test(groups= {"smoke"})
  public void f1() {
	  System.out.println("test1");
  }
  @Test(groups= {"sanity","smoke"})
  public void f2() {
	  System.out.println("test2");
  
  }
  @Test(groups= {"regration"})
	  public void f3() {
		  System.out.println("test3");
		  
	  }
  @Test(groups= {"functional"})
	  public void f4() {
		  System.out.println("test4");
		  
	  }
  

}
