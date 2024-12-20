package circleRender;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

// 画像生成や乱数生成のテスト用クラス
public class RandomImageGenerator {

    public static void main(String[] args) {
        // 画像の解像度を指定
        int width = 512;  // 幅
        int height = 512; // 高さ

        // BufferedImageで画像を作成
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        // 各ピクセルの色を指定
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                // ランダムなRGB色を生成
                Color color = new Color((int)(Math.random() * 0x1000000));
                image.setRGB(x, y, color.getRGB());
            }
        }

        // 画像をファイルとして保存
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

