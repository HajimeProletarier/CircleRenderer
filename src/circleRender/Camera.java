package circleRender;

// カメラを定義する
// カメラの位置とスクリーンによって出力画像の内容が変わる
public class Camera {
	
	private int width;
	private int height;
	private Vector3 position;
	
	public Camera(int width, int height) {
		this.width = width;
		this.height = height;
		this.position = new Vector3(0, 0, 0);
	}
	
	public Vector3 getPosition() {
		return position;
	}
	public void setPosition(Vector3 position) {
		this.position = position;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
}
