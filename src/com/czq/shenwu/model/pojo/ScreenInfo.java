package com.czq.shenwu.model.pojo;

import com.czq.shenwu.model.bo.RobotOperation;

import java.awt.*;
import java.awt.image.BufferedImage;

public class ScreenInfo {
    public static final Rectangle rec;

    public static final int SCREEN_WIDTH;

    public static final int SCREEN_HEIGHT;

    static {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension di = tk.getScreenSize();
        SCREEN_WIDTH = di.width;
        SCREEN_HEIGHT = di.height;
        rec = new Rectangle(0, 0, di.width, di.height);
    }

    /**
     * 截取屏幕图片
     * @return
     */
    public static BufferedImage createScreenCapture() {
        return RobotOperation.getInstance().createScreenCapture(rec);
    }

}
