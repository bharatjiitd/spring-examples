package examples.spring.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestBeanA {

  @Autowired
  private TestBeanB testBeanB;

  private int callOrder;

  public TestBeanA() {
    printCallOrderAndInc();
  }

  @PostConstruct
  public void init() {
    printCallOrderAndInc();
  }

  @PreDestroy
  public void destroy() {
    printCallOrderAndInc();
  }

  public void printCallOrderAndInc() {
    System.out.println(String.format("%s callback no: %d", this.getClass(), callOrder++));
  }

}
