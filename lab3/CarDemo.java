package lab3;

public class CarDemo {

	public static void main(String[] args) {
		// alt + shift +r 
		Car car=new Car();
		car.type="Fiat";
		car.model="2019";
		car.color="black";
		
		System.out.println("the car has the following attributes "+ car.type + " "+ car.model +" "+ car.color);

	}

}
