package problem03;

public class RectTriangle extends Shape {
	private double width;
	private double height;
	private double area;
	private double perimeter;

	public RectTriangle(double width, double height) {
		area = width * height;
		getArea();
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
