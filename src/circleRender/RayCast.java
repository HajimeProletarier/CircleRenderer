package circleRender;

// スクリーンから円に向かって直線を投げて、円にぶつかるかどうかの真偽値を判定する
public class RayCast {
	public static boolean checkHit(int x, int y, Circle circle) {
		boolean result = false;

		if (Math.pow(x - 1000 * circle.getCenter().getX(), 2)
				+ Math.pow(y - 1000 * circle.getCenter().getY(), 2) < 1000 * Math.pow(circle.getRadius(), 2)) {
			result = true;
		}

		return result;
	}

}
