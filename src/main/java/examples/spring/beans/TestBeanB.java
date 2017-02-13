package examples.spring.beans;

import org.springframework.stereotype.Component;

@Component
public class TestBeanB {
  
  public TestBeanB() {
    System.out.println("TestBeanB");
  }
}
