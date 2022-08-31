package cn.itedus.lottery.interfaces.facade;

import cn.itedus.lottery.rpc.booth.IActivityBooth;
import cn.itedus.lottery.rpc.booth.req.ActivityReq;
import cn.itedus.lottery.rpc.booth.res.ActivityRes;

public class ActivityBooth implements IActivityBooth {

    @Override
    public ActivityRes queryActivityById(ActivityReq req) {
        return null;
    }
}
