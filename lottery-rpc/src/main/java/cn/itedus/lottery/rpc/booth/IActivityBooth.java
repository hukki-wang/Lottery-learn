package cn.itedus.lottery.rpc.booth;

import cn.itedus.lottery.rpc.booth.req.ActivityReq;
import cn.itedus.lottery.rpc.booth.res.ActivityRes;

public interface IActivityBooth {

    ActivityRes queryActivityById(ActivityReq req);
}
