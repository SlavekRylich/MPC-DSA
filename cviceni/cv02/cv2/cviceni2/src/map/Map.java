package map;

import java.util.Vector;

public class Map {
	private Vector<Car> cars = new Vector<Car>();

	public void addCar(Car car) {
		cars.add(car);
	}
	
	public void printCars() {
		for (Car c : cars) {
			System.out.println(c.getBrand() + 
					"=" + c.getX() + c.getY() );
			
		}
	}
	
	public void removeCar(int index) {
		cars.remove(index);
	}

	public int countCars() {
		return cars.size();
	}
	
	public Car getCar(int index) {
		return cars.get(index);
	}
}
