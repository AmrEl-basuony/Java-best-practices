abstract class GeoShape{
	protected int dim1;
	public GeoShape(){

	}
	public abstract void getArea();
}
class Circle extends GeoShape{
	public Circle(int d1){
		dim1 = d1;
	}
	public void getArea(){
		System.out.println(dim1*dim1*3.14f);
	}
}
class Triangle extends GeoShape{
	private int dim2;
	public Triangle(int d1,int d2){
		dim1 = d1;
		dim2 = d2;
	}
	public void getArea(){
		System.out.println(0.5*dim1*dim2);
	}
}
class Rectangle extends GeoShape{
	private int dim2;
	public Rectangle(int d1,int d2){
		dim1 = d1;
		dim2 = d2;
	}
	public void getArea(){
		System.out.println(dim1*dim2);
	}
}
class Main{
	public static void main(String[] args){
		GeoShape c = new Circle(5);
		GeoShape t = new Triangle(5,10);
		GeoShape r = new Rectangle(5,10);
		c.getArea();
		t.getArea();
		r.getArea();
	}
}