package hellojetty;

import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class TableView {
	
	private List<String> cars = Arrays.asList("Audi", "BMW", "Citroen", "Dacia", "Fiat");

	public List<String> getCars() {
		return cars;
	}

	public void setCars(List<String> cars) {
		this.cars = cars;
	}
	
}
