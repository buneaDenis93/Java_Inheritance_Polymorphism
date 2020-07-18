package oopPrinciples;

public class Car extends Vehicle implements AutoCloseable, Cloneable {
	
		private int doorsNo;
		private static int noCars;
		
		
		public Car() {
			Car.noCars++;
		}
		
		public Car(int weight, int doorsNo) {
			super(weight);
			this.doorsNo = doorsNo;
			Car.noCars++;
		}
		
		public int getDoorsNo() {
			return this.doorsNo;
		}
		
		public void setDoosNo(int doorsN) {
			this.doorsNo = doorsN;
		}
		
		public static int getNoCars() {
			return Car.noCars;
		}
		
		@Override
		public String display() {
			return new String("Car - w = " + this.getWeight() + ", doorsNo = " + this.doorsNo);
		}
		
		@Override
		public void close() throws Exception {
			Car.noCars--;
		}
		
		@Override
		public Object clone() {
			Car r = null;
			try {
				r = (Car)super.clone();
				//r.capacity = this.capacity.clone();
				r.doorsNo = this.doorsNo;
				Car.noCars++;
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
			return r;
		}
	}


