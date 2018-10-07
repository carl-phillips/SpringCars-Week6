package beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans/beans.xml");
		
		CarService carService = applicationContext.getBean("carService", CarService.class);
		System.out.println("Before");
		System.out.println("Car: " + carService.getCar(1).getId() + ", " + carService.getCar(1).getMake() + ", " + carService.getCar(1).getModel() + ", " + carService.getCar(1).getYear() + ", " + carService.getCar(1).carSold());
		System.out.println("Car: " + carService.getCar(2).getId() + ", " + carService.getCar(2).getMake() + ", " + carService.getCar(2).getModel() + ", " + carService.getCar(2).getYear() + ", " + carService.getCar(2).carSold());
	
		carService.sellCar(1, true);
		
		System.out.println("After");
		System.out.println("Car: " + carService.getCar(1).getId() + ", " + carService.getCar(1).getMake() + ", " + carService.getCar(1).getModel() + ", " + carService.getCar(1).getYear() + ", " + carService.getCar(1).carSold());
		System.out.println("Car: " + carService.getCar(2).getId() + ", " + carService.getCar(2).getMake() + ", " + carService.getCar(2).getModel() + ", " + carService.getCar(2).getYear() + ", " + carService.getCar(2).carSold());
		
	}
}
