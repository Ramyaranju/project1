package basictask;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;



public class TestCar {
	public static void main(String[] args) {
	//ClassPathResource resource=new ClassPathResource("car.xml");
	//BeanFactory beanFactory=new XmlBeanFactory(resource);
	//Car car=(Car)beanFactory.getBean("mycar");
	//car.driveEngine();
	//-----------------------------IOC CONTAINER-1(ApplicationContext)--------------------------------//
	
			ApplicationContext context=new ClassPathXmlApplicationContext("car.xml");
			Car car=(Car)context.getBean("mycar");
			car.driveEngine();
			
	}
}