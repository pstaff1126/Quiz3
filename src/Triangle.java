
public class Triangle extends GeometricObject {
	private double side1=1;
	private double side2=1;
	private double side3=1;
	public Triangle() {
		
	}
	public Triangle(double s1, double s2, double s3) {
		this.side1=s1;
		this.side2=s2;
		this.side3=s3;
	}
	public double getside1() {
		return this.side1;
	}
	public double getside2() {
		return this.side2;
	}
	public double getside3() {
		return this.side3;
	}
	@Override
	public double getPerimeter() {
		return (this.side1+this.side2+this.side3);
	}
	/*
	 * Heron's formula
	 * @see GeometricObject#getArea()
	 */
	@Override
	public double getArea() {
		double a=(this.getPerimeter()*(.5));
		double area=Math.sqrt(a*((this.getPerimeter()-this.side1)*(this.getPerimeter()-this.side2)*(this.getPerimeter()-this.side3)));
		return area;
	}
	
	
	
}
