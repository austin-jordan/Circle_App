import java.math.BigDecimal;
import java.text.NumberFormat;


/**
 * @author austinjordan
 *This class constructs a circle object and provides methods to find the circumference and the area of the circle using a given radius.
 *Then there are two methods which format the circumference and area of the circle to two decimal places.
 */
class Circle {
	private static int counter = 0;
	static double radius;

	public Circle(double radius) {
		this.radius = radius;
		counter++;
	}
	
	public double getCircumference() {
		double circumference = (radius * 2) * Math.PI;
		return circumference;
	}
	
	public String getFormattedCircumference() {
		String formatted = formatNumber(getCircumference());
		return formatted;
	}
	
	public String getFormattedArea() {
		return formatNumber(getArea());
	}
	
	private String formatNumber (double number) {
		NumberFormat newNumber = NumberFormat.getNumberInstance();
		newNumber.setMaximumFractionDigits(2);
		String format = newNumber.format(number).toString();
		return format;
//		BigDecimal a = new BigDecimal(number);
//		BigDecimal formattedNumber = a.setScale(2, BigDecimal.ROUND_UP);
//		return formattedNumber.toString();
	}
	
	public double getArea(){
		double area = Math.PI * (radius * radius);
		return area;
	}
	
	public static int getObjectCount() {
		return counter;
	}
}
