public class CarApp{
    public static void main(String[] args){
	Car c=new Car();
		c.brand="maruthi";
		c.colour="red";
		c.price=120000;
		System.out.println(c.brand);
		System.out.println(c.colour);
		System.out.println(c.price);
		c.accelerate();
	}
}
class Car{
    String brand;
    String colour;
    int price;
    public static void accelerate(){
        System.out.println("A car accelerates");
    }
}