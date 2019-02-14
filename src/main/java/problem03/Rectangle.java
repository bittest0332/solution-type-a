package problem03;

public class Rectangle extends Shape implements Resizable {
	private double width;
	private double height;
	private double area;
	private double perimeter;

	public Rectangle(double width, double height) {
		area = width * height;
		getArea();
	}

	@Override
	public void resize(double rate) {
		width = width * rate;
		height = height * rate;
	}

	@Override
	public double getArea() {
		System.out.printf("area: %d\n", area);

		return area;
	}

	@Override
	public double getPerimeter() {
		return perimeter;
	}
}