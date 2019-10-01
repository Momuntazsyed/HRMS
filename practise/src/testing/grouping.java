package testing;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class grouping {
  
  
  @Test(groups = {"sanity","Smoke","Regression"})
  public void f1() {
	  System.out.println("f1");
  }
  @Test(groups= {"sanity","regression"})
  public void f2() {
	  System.out.println("f2");
  }
  @Test(groups= {"sanity","retesting"})
  public void f3() {
	  System.out.println("f3");
  }
  @Test(groups= {"sanity"})
  public void f4() {
	  System.out.println("f4");
  }
  @Test(groups= {"smoke","regression"})
  public void f5() {
	  System.out.println("f5");
  }
  @Test(groups= {"sanity","regression"})
  public void f6() {
	  System.out.println("f6");
  }
  @Test(groups= {"regression"})
  public void f7() {
	  System.out.println("f7");
  }
  @Test(groups= {"sanity","regression"})
  public void f8() {
	  System.out.println("f8");
  }
  @Test(groups= {"sanity","regression","retesting"})
  public void f9() {
	  System.out.println("f9");
  }
  @Test(groups= {"sanity","regression"})
  public void f10() {
	  System.out.println("f10");
  }
  

}
