package lecture_36;

public class Cars {//implements Comparable<Cars>{

	int price;
	int speed;
	String color;
	
	public Cars(){
		
	}
	
	public Cars(int price, int speed, String color) {
		this.price = price;
		this.speed = speed;
		this.color = color;
	}
	
	public String toString() {
		return "P " + price + " S "+ speed + " C " + color ;
	}

//	@Override 
//	public int compareTo(Cars o) {
//		// TODO Auto-generated method stub
//		
////		return this.price - o.price;
////		return this.speed - o.speed;
//		return this.color.compareTo(o.color);
//	}

}