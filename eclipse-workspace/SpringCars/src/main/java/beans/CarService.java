package beans;

public interface CarService {

	public void sellCar(long buyCarId, boolean sold);
	public Car getCar(long carId);
}
