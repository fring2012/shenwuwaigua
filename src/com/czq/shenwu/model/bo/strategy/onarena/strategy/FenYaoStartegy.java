package com.czq.shenwu.model.bo.strategy.onarena.strategy;

import com.czq.shenwu.constant.SizeConstant;
import com.czq.shenwu.model.pojo.Point;
import com.czq.shenwu.model.bo.BGRCollection;
import com.czq.shenwu.model.bo.MouseOperation;
import com.czq.shenwu.model.bo.PointCollection;
import com.czq.shenwu.model.bo.strategy.OnArenaStrategyImpl;
import com.czq.shenwu.utils.LogUtils;

import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;


public class FenYaoStartegy extends OnArenaStrategyImpl {
    private static final String TAG = "FenYaoStartegy";
    @Override
    public void ready(BufferedImage bi) {
        //判断是否半血以上
        mouseSelect = isEnoughHp(bi) ? KeyEvent.BUTTON3_MASK : KeyEvent.BUTTON1_MASK;
    }




    @Override
    protected boolean confirmTarget(BufferedImage bi) {

        LogUtils.d(TAG,"npcBGR:" + BGRCollection.getInstance().getPointBGR(bi,PointCollection.NpcName.UNDER_FOURTH.getPoint()));
        if (npcIsAlive(bi,PointCollection.NpcName.UNDER_FIFTH)) {
            masterOperate.setPoint(PointCollection.NpcName.UNDER_FIFTH.getPoint());
            masterOperate.setMouse(KeyEvent.BUTTON1_MASK);
            petOperate.setPoint(PointCollection.NpcName.BOSS.getPoint());
            petOperate.setMouse(KeyEvent.BUTTON3_MASK);
        } else {
            Point point =  new Point(PointCollection.getInstance().hpZeroPoint, SizeConstant.PU_TONG_ZHEN_BOSS_ZERO_HP_DX
                    , SizeConstant.PU_TONG_ZHEN_BOSS_ZERO_HP_DY);
            masterOperate.setPoint(point);
            masterOperate.setMouse(KeyEvent.BUTTON3_MASK);
            petOperate.setPoint(point);
            petOperate.setMouse(KeyEvent.BUTTON3_MASK);
        }

        return true;
    }

    @Override
    public void initStrategyCheckStateVO() {
        mCheckStateVO.setRenewHp(true);
        mCheckStateVO.setRenewBbMp(true);
    }


    @Override
    public void end() {
        MouseOperation.keyAltAndA();
        MouseOperation.keyAltAndA();
    }

}
