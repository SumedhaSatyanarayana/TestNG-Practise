package New;

import org.testng.annotations.Test;

public class DependancyTest {
  @Test(enabled= false,priority = 0)
  public void f() {
	  System.out.println("Hello");
  }
  @Test
  public void start() {
  System.out.println("Starting the server");
  }
  @Test(dependsOnMethods = { "start" })
  public void init() {
  System.out.println("Initializing the data for processing!");
  }
  @Test(dependsOnMethods = { "start", "init" })
  public void process() {
  System.out.println("Processing the data!");
  }
  @Test(dependsOnMethods = { "process" })
  public void stop() {
  System.out.println("Stopping the server");
  }
}
