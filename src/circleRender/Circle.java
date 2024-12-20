package circleRender;
import java.awt.Color;

// 円のクラス
public class Circle {
	
	private double radius; // 半径
	private Vector3 center; // 中心位置
	private Color color; // 色
	
	public Circle(double radius, Vector3 center) {
		this.radius = radius;
		this.center = center;
	}
	
	public Circle(double radius, Vector3 center, Color color) {
		this(radius, center);
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public double getRadius() {
		return radius;
	}
	public void setRedius(double radius) {
		this.radius = radius;
	}
	public Vector3 getCenter() {
		return center;
	}
	public void setCenter(Vector3 center) {
		this.center = center;
	}
}
