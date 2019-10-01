package testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class dependtest {
  @Test
  public void f1() {
	  System.out.println("method1");
  }
  @Test(dependsOnMethods = "f3")
  public void f2() {
	  System.out.println("method2");
  }
  @Test
  public void f3() {
	  System.out.println("method3");
  }
  @Test
  public void f4() {
	  System.out.println("method4");
  }

}
