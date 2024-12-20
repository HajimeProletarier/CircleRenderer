package circleRender;

import java.awt.Color;

// コマンドラインで受け取った数字に応じて、色を渡す
public class ColorSwitcher {
	public static Color ColorSwitch(int input) {
		switch(input) {
			case 1 -> {
				return Color.white;
			}
			case 2 -> {
				return Color.black;
			}
			case 3 -> {
				return Color.red;
			}
			case 4 -> {
				return Color.green;
			}
			case 5 -> {
				return Color.blue;
			}
			default -> {
				return new Color(0.5f, 0.5f, 0.5f, 0.0f);
			}
		}
	}
}
