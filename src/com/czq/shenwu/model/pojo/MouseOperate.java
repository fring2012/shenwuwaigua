package com.czq.shenwu.model.pojo;

import java.awt.event.KeyEvent;

public class MouseOperate {
    //KeyEvent.BUTTON1_MASK是左键
    //KeyEvent.BUTTON3_MASK是右键
    private Point point;
    private int mouse = KeyEvent.BUTTON1_MASK;

    public MouseOperate() {

    }

    public MouseOperate(Point point, int mouse) {
        this.point = point;
        this.mouse = mouse;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public int getMouse() {
        return mouse;
    }

    public void setMouse(int mouse) {
        this.mouse = mouse;
    }
}
