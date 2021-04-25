package hellojetty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(eager = true)
@SessionScoped
public class TableView implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String brand;
	private String model;
	
	private List<Car> cars = new ArrayList<>(
			Arrays.asList(
					new Car("Audi", "A4"),
					new Car("BMW", "3 series"),
					new Car("Citroen", "C5"),
					new Car("Dacia", "Dokker"),
					new Car("Fiat", "Tipo")
			));
	
	public void addCar() {
		Car car = new Car(brand, model);
		cars.add(car);
		clearForm();
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	private void clearForm() {
		brand = "";
		model = "";
	}
	
}
