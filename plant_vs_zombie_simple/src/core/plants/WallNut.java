package core.plants;

import java.awt.image.BufferedImage;

/**
 * 坚果
 */
public class WallNut extends Plant {

    // 构造器
    public WallNut() {
        super(65, 73);
        live = 10;
    }

    // 坚果
    // 加载图片
    private static BufferedImage[] imgs;

    static {
        imgs = new BufferedImage[6];
        for (int i = 0; i < imgs.length; i++) {
            imgs[i] = loadImage("WallNut" + i + ".png");
        }
    }

    // 获取图片，0-4为生存图片，5为卡片图片
    int index = 1;

    @Override
    public BufferedImage getImage() {
        if (isWait() || isStop() || isMove()) {
            return imgs[5];
        } else if (isLife()) {
            return imgs[index++ % 5];//0-4
        } else {
            return null;
        }
    }

}
