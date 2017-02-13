package examples.spring.applistener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

public class ContextClosedEventListener implements ApplicationListener<ContextClosedEvent> {

  public void onApplicationEvent(ContextClosedEvent event) {
    System.out.println("Context closed event listener ... ");
  }

}
