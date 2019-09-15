package com.czq.shenwu;


import com.czq.shenwu.controller.IController;
import com.czq.shenwu.controller.controllerImpl.Controller;
import com.czq.shenwu.ui.MainJFrame;
import com.czq.shenwu.ui.view.IView;
import com.czq.shenwu.utils.LogUtils;

import javax.swing.*;

public class main {

    public static void main(String[] args) {
        IController controller = new Controller();

        IView mainView = MainJFrame.getInstance();

        controller.bindView(mainView);

        mainView.bindConstant(controller);

        controller.ready();

        // 确保一个漂亮的外观风格
        JFrame.setDefaultLookAndFeelDecorated(true);

        MainJFrame.getInstance().pack();

        LogUtils.write_file(false);

//        BufferedImage bi = RobotOperation.getInstance().createScreenCapture(ScreenInfo.rec);
//        PointCollection.getInstance().obtainAllPoint(bi);
////
//        Point target =
////                PointCollection.getInstance().dialogCenter;
//                new Point(PointCollection.getInstance().dialogCenter,10,0);
//        int bgr = BGRCollection.getInstance().getPointBGR(bi,target);
//        LogUtils.logger.info("bgr:" + bgr);
//        RobotOperation.getInstance().mouseMove(target);
//        //-350,320  -6889013


//        IThemeBGRInfo iThemeBGRInfo = new BlueThemeBGRImpl();
//        Point point = PointCollection.getInstance().checkBgrPoint(bi,iThemeBGRInfo.getDialogCenter());
//        System.out.println(point);
//        System.out.println(PointCollection.getInstance().hpZeroPoint);
//        RobotOperation.getInstance().mouseMove(point);
    }



}
