package core.plants;

import java.awt.image.BufferedImage;

import core.bullets.Bullet;
import core.bullets.SnowBullet;

/**
 * 冰豌豆射手
 */
public class SnowPea extends Plant {

    // 构造器
    public SnowPea() {
        super(71, 71);
        live = 5;
    }

    // 冰豌豆射手
    // 加载图片
    private static BufferedImage[] imgs;

    static {
        imgs = new BufferedImage[6];
        for (int i = 0; i < imgs.length; i++) {
            imgs[i] = loadImage("SnowPea" + i + ".png");
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

    // 发射子弹
    @Override
    public Bullet[] shoot() {
        Bullet[] bs = new Bullet[1];
        bs[0] = new SnowBullet(this.x + this.width, this.y + this.height / 2 - 25);
        return bs;
    }

}
