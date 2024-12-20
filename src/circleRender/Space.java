package circleRender;

import java.awt.Color;
import java.util.Random;

// 円を配置するための空間クラス
public class Space {
	private Circle[] circles = new Circle[10];

	// 10 個の円を配置する　配置する際に、円の色と半径、位置を乱数で調整する
	public void RandomDeploy(Color choiseColor) {
		for (int i = 0; i < 10; i++) {

			Random random = new Random();
			double radius = 4 + 3 * (-0.5 * random.nextGaussian());

			double x = random.nextDouble(1) + 0.1;
			double y = random.nextDouble(1);
			double z = random.nextDouble(1);

			Vector3 center = new Vector3(x, y, z);

			int R = (int) (choiseColor.getRed() * random.nextDouble(0.6, 1));
			int G = (int) (choiseColor.getGreen() * random.nextDouble(0.6, 1));
			int B = (int) (choiseColor.getBlue() * random.nextDouble(0.6, 1));
			
			Color randColor = new Color(R, G, B);
			this.circles[i] = new Circle(radius, center, randColor);
		}
	}

	public Circle[] getCircles() {
		return circles;
	}

	public void setCircles(Circle[] circles) {
		this.circles = circles;
	}
}
