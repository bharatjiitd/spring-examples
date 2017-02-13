package examples.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      String[] configLocations = {"test-1.xml"};
      ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext(configLocations, false);
      context1.getEnvironment().setActiveProfiles("dev");
      context1.refresh();
      context1.start();
      context1.close();
    }
}
