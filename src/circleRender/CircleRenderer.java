package circleRender;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

// 実行クラス
public class CircleRenderer {

	public static void main(String[] args) {
		System.out.println("円の色を入力してください 1:白、2:黒、3:赤、4:緑、5:青");
		
		@SuppressWarnings("resource")
		int input = new java.util.Scanner(System.in).nextInt();

		Color choiseColor = ColorSwitcher.ColorSwitch(input);

		// カメラと円のインスタンス化
		Space space = new Space();
		space.RandomDeploy(choiseColor);

		Camera camera = new Camera(1366, 768);

		int width = camera.getWidth();
		int height = camera.getHeight();

		// イメージのバッファを用意する
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Random random = new Random();

		// 背景としてグレイとノイズで塗る
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				Color backColor = new Color((int) Color.lightGray.getRGB() + (int) (30 * random.nextGaussian() + 25));
				image.setRGB(x, y, backColor.getRGB());
			}
		}

		// 円の領域を塗る
		for (var circle : space.getCircles()) {
			for (int x = 0; x < width; x++) {
				for (int y = 0; y < height; y++) {
					if (RayCast.checkHit(x, y, circle)) {
						Color color = new Color(circle.getColor().getRGB());
						image.setRGB(x, y, color.getRGB());
					}
				}
			}
		}

		// 画像を書き出す
		try {
			File outputFile = new File("generated_image.png");
			ImageIO.write(image, "png", outputFile);
			System.out.println("画像が生成されました: " + outputFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("エラーが発生しました: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
