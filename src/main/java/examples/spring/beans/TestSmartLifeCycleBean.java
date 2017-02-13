package examples.spring.beans;

import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

@Component
public class TestSmartLifeCycleBean implements SmartLifecycle {

  private boolean isStarted = false;

  public TestSmartLifeCycleBean() {

  }

  public void start() {
    // TODO Auto-generated method stub
    System.out.println(String.format("%s %s", this.getClass(), "started"));
    isStarted = true;
  }

  public void stop() {
    // TODO Auto-generated method stub
    System.out.println(String.format("%s %s", this.getClass(), "stopped"));
  }

  public boolean isRunning() {
    // TODO Auto-generated method stub
    return isStarted;
  }

  public int getPhase() {
    // TODO Auto-generated method stub
    return 1;
  }

  public boolean isAutoStartup() {
    // TODO Auto-generated method stub
    return false;
  }

  public void stop(Runnable callback) {
    // TODO Auto-generated method stub
    
  }

}
