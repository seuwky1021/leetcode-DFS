package core.plants;

import core.bullets.Bullet;

import java.awt.image.BufferedImage;

public class Blover extends Plant {

    // 吹风草独有的可点击状态
    public static final int CLICK = 5;

    // 构造器
    public Blover() {
        super(90, 80);
        live = 3;
    }

    // 吹风草
    // 加载图片
    private static BufferedImage[] imgs;

    static {
        imgs = new BufferedImage[6];
        for (int i = 0; i < imgs.length; i++) {
            imgs[i] = loadImage("Blover" + i + ".png");
        }
    }

    // 获取图片，0-4为生存图片，5为卡片图片
    int index = 1;

    @Override
    public BufferedImage getImage() {
        if (isWait() || isStop() || isMove()) {
            return imgs[5];
        } else if (isLife() || isClick()) {
            return imgs[index++ % 5];//0-4
        } else {
            return null;
        }
    }

    @Override
    public Bullet[] shoot() {
        throw null;
    }

    // 判断状态
    public boolean isClick() {
        return state == CLICK;
    }

    // 改变状态
    public void goClick() {
        state = CLICK;
    }

}
