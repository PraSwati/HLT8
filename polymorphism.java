class Shapes {
	  public void area() {
	    System.out.println("Find area of the ");
	  }
	public void area(int r) {
	    System.out.println("Circle  = "+3.14*r*r);
	  }
	 
	public void area(double b, double h) {
	    System.out.println("Triangle = "+0.5*b*h);
	  }
	public void area(int l, int b) {
	    System.out.println("Rectangle ="+l*b);
	  }
}
	 
class polymorphism {
	  public static void main(String[] args) {
	    Shapes result = new Shapes();  // Create a Shapes object
	     
	    result.area();
	    result.area(7);
	    result.area(3.5,4.7);
	    result.area(4,8);
	     
	  }
}