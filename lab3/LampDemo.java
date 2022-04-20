package lab3;

public class LampDemo {

	public static void main(String[] args) {
		//1- construction
		Lamp lamp1=new Lamp();
		//lamp1.isOn=false;
		System.out.println(lamp1); // address
		System.out.println("lamp 1 is on :"+ lamp1.isOn); // attribute value
		
		Lamp lamp2=new Lamp();
		lamp2.isOn=true;
		System.out.println("lamp2 is on :"+lamp2.isOn);
		
		Lamp lamp3=new Lamp();
		lamp3.isOn=true;
		//lamp3.voltage=3;
		
		System.out.println(lamp3.isOn);
		System.out.println(lamp3.voltage);
		
		System.out.println("the end");

	}

}
