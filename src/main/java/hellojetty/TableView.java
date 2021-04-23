package hellojetty;

import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class TableView {
	
	private String brand;
	private String model;
	
	private List<Car> cars = Arrays.asList(
			new Car("Audi", "A4"),
			new Car("BMW", "3 series"),
			new Car("Citroen", "C5"),
			new Car("Dacia", "Dokker"),
			new Car("Fiat", "Tipo")
		);
	
	public void addCar() {
		Car car = new Car(brand, model);
		cars.add(car);
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	
}
