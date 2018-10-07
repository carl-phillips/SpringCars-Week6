package beans;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public CarDao carDao() {
		CarDaoInMemoryImpl bean = new CarDaoInMemoryImpl();
		return bean;
	}
	
	@Bean
	public CarDao carDaoJdbc() {
		CarDaoJdbcImpl bean = new CarDaoJdbcImpl();
		return (CarDao) bean;
	}
	
	@Bean(autowire=Autowire.BY_NAME)
	public CarService carService() {
		CarServiceImpl bean = new CarServiceImpl(carDao());
		return bean;
	}

}
