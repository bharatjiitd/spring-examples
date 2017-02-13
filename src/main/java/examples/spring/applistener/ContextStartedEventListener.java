package examples.spring.applistener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;


public class ContextStartedEventListener implements ApplicationListener<ContextStartedEvent> {

  public void onApplicationEvent(ContextStartedEvent event) {
    // TODO Auto-generated method stub
    System.out.println("application is starting..." + event.getSource());    
  }
 
}
