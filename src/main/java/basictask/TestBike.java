package basictask;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBike {
	public static void main(String[] args) {

	ApplicationContext context=new ClassPathXmlApplicationContext("car.xml");
	Bike bike=(Bike)context.getBean("mybike");
	bike.bikeRide();
	
}

}
