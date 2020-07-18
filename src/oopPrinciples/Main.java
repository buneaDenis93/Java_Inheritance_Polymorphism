package oopPrinciples;

public class Main {

	public static void main(String[] args) {
	
		Vehicle v = null;
		Car c = new Car(1200, 5);
		Plane p = new Plane(15000, 12, 2);
		
		v = c;
		System.out.println(v.display());
		
		v = p;
		System.out.println(v.display());
		
		Vehicle v0 = null;
        v0 = c; //Car -> Vehicul - up-cast (is implicit)
        
        try {
            p = (Plane)v0;
        } catch(ClassCastException cce) {
        	//System.out.println("Eroare cast!!!");
            cce.printStackTrace();
        }        
        
        Movement im0 = new Car(2900, 4);
       
        im0.startEngine();
        
        System.out.println("No Cars = " + Car.getNoCars());
        
        try(Car car = new Car(3000, 5)) {
        		car.display();
        		System.out.println("No Cars = " + Car.getNoCars());
        } catch (Exception e) {
			e.printStackTrace();
		}
        System.out.println("No Cars = " + Car.getNoCars());
        
	}


}


