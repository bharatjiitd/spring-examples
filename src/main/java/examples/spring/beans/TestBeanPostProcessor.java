package examples.spring.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class TestBeanPostProcessor implements BeanPostProcessor{

  public Object postProcessBeforeInitialization(Object bean, String beanName)
      throws BeansException {
    // TODO Auto-generated method stub
    System.out.println(String.format("%s.postProcessBeforeInitialization bean name %s", this.getClass(), beanName));
    if (beanName.indexOf("TestProfileBeanA") != -1) {
      System.out.println(String.format("profile is: %s", "dev"));
    }
    
    if (beanName.indexOf("TestProfileBeanB") != -1) {
      System.out.println(String.format("profile is: %s",  "production"));
    }
    return bean;
  }

  public Object postProcessAfterInitialization(Object bean, String beanName)
      throws BeansException {
    System.out.println(String.format("%s.postProcessAfterInitialization bean name  %s", this.getClass(), beanName));
    return bean;
  }

}
