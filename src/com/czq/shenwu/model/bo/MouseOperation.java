package com.czq.shenwu.model.bo;

import com.czq.shenwu.model.pojo.MouseOperate;
import com.czq.shenwu.utils.LogUtils;
import com.czq.shenwu.utils.ThreadUtil;

import java.awt.event.KeyEvent;

import com.czq.shenwu.model.pojo.Point;

/**
 * 鼠标操作类
 */
public class MouseOperation {

    public static void operationMouse(MouseOperate mouseOperate) {
        if (mouseOperate == null || mouseOperate.getPoint() == null) {
            LogUtils.d("MouseOperation","mouseOperate or point is null!!");
            return;
        }
        mouseMoveAndClickMouse(mouseOperate.getPoint(),mouseOperate.getMouse());
    }
    /**
     * 单击鼠标
     * @param mouse
     */
    public static void clickMouseRelease(int mouse) {
        RobotOperation.getInstance().mouseRelease(mouse);
    }
    /**
     * 移动到指定坐标单击鼠标
     * @param point 指定坐标
     * @param mouse
     */
    public static void mouseMoveAndClickMouse(Point point, int mouse)  {
        RobotOperation.getInstance().mouseMove(point);
        ThreadUtil.sleep(50L);
        clickMouseRelease(mouse);
    }

    /**
     * 双击鼠标
     * @param mouse
     */
    public  static void doubleMouseRelease(int mouse)  {
        clickMouseRelease(mouse);
        ThreadUtil.sleep(50L);
        clickMouseRelease(mouse);
        ThreadUtil.sleep(50L);
    }

    /**
     * 移动到指定坐标双击鼠标
     * @param point 指定坐标
     * @param mouse
     */
    public static void mouseMoveAndDoubleMouse(Point point, int mouse)  {
        RobotOperation.getInstance().mouseMove(point);
        ThreadUtil.sleep(100L);
        doubleMouseRelease(mouse);
    }

    /**
     * 按下和释放ALT + A
     * @throws InterruptedException
     */
    public static void keyAltAndA() {
        RobotOperation.getInstance().keyPress(KeyEvent.VK_ALT);
        RobotOperation.getInstance().keyPress(KeyEvent.VK_A);
        ThreadUtil.sleep(50L);
        RobotOperation.getInstance().keyRelease(KeyEvent.VK_ALT);
        RobotOperation.getInstance().keyRelease(KeyEvent.VK_A);
    }


    /**
     * 按下和释放ALT + Q
     * @throws InterruptedException
     */
    public static void keyAltAndQ() {
        RobotOperation.getInstance().keyPress(KeyEvent.VK_ALT);
        RobotOperation.getInstance().keyPress(KeyEvent.VK_Q);
        ThreadUtil.sleep(50L);
        RobotOperation.getInstance().keyRelease(KeyEvent.VK_ALT);
        RobotOperation.getInstance().keyRelease(KeyEvent.VK_Q);
    }

}
