package circleRender;

// 3次元ベクトルのクラスを作る
public class Vector3 {
	private double x, y, z;

	// コンストラクタの定義
	public Vector3(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	// 平面上でのコンストラクタ	
	public Vector3(double x, double y) {
		this(x, y, 0);
	}

	// ベクトルの加法
	public static Vector3 add(Vector3 u, Vector3 v) {
		Vector3 z = new Vector3(0, 0, 0);

		z.x = u.x + v.x;
		z.y = u.y + v.y;
		z.z = u.z + v.z;

		return z;
	}

	// ベクトルの差法
	public static Vector3 diff(Vector3 u, Vector3 v) {
		Vector3 z = new Vector3(0, 0, 0);

		z.x = u.x - v.x;
		z.y = u.y - v.y;
		z.z = u.z - u.z;

		return z;
	}

	public static Vector3 scalar(double r, Vector3 v) {
		Vector3 z = new Vector3(0, 0, 0);

		z.x = r * v.x;
		z.y = r * v.y;
		z.z = r * v.z;

		return z;
	}

	public String show() {
		String result = "(" + this.x + ", " + this.y + ", " + this.z + ")";
		
		return result;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

}
