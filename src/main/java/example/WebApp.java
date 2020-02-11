package example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WebApp {


        public static void main(String[] args) {
            ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
            //Student student = context.getBean("Student", Student.class);

            ((ConfigurableApplicationContext) context).close();

    }
}
