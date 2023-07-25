
public class FinalFieldTest {
	public static void main(String[] args) {
		
		
		//final float PI=3.14f; // local variable of main
		//System.out.println("PI "+PI);
		

		Circle circ1 = new Circle(56.5f);
		Circle circ2 = new Circle(36.2f);
		Circle circ3 = new Circle(66.5f);
		Circle circ4 = new Circle(38.5f);
		Circle circ5 = new Circle(26.6f);
		
		circ1.calcArea();
		circ2.calcArea();
		circ3.calcArea();
		circ4.calcArea();
		circ5.calcArea();
		
		Car car1 = new Car("Blue","MH-12-1234");
		Car car2 = new Car("Red","MH-15-4434");
		Car car3 = new Car("Silver","MH-14-9234");
		
		car1.showCar();
		car2.showCar();
		car3.showCar();
		
		
	}
}

class Car
{
	private String color;
	private final String numberPlate;
	
	Car(String c, String np) {
		color = c;
		numberPlate = np;
	}
	void setCar(String c, String np) {
		color = c;
		//numberPlate = np;
	}
	void showCar() {
		System.out.println("Car : "+color);
		System.out.println("NP  : "+numberPlate);	
	}
}

class Circle
{
	private float radius;
	private final float PI=3.14f; // UNIVERSAL CONSTANT | data member | one copy
	
	public Circle(float radius) {
		super();
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	void calcArea() {
		float area = PI * radius * radius;
		System.out.println("Area : "+area);
	}
	
}