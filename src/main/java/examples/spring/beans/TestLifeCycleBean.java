package examples.spring.beans;

import org.springframework.context.Lifecycle;
import org.springframework.stereotype.Component;

@Component
public class TestLifeCycleBean implements Lifecycle {
  public boolean isStarted = false;
  
  public TestLifeCycleBean() {
    
  }
  
  public void start() {
    System.out.println(String.format("%s %s", this.getClass(), "started"));
    isStarted = true;
  }

  public void stop() {
    System.out.println(String.format("%s %s", this.getClass(), "stopped"));    
  }

  public boolean isRunning() {
    return isStarted;
  }

}
