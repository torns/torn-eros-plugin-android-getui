package com.benmu.erosplugingt.manager;

import android.content.Context;

import com.benmu.erosplugingt.GetuiPushService;
import com.igexin.sdk.PushManager;

/**
 * Created by liuyuanxiao on 18/4/8.
 */

public class GetuiManager {

    public static void pushInit(Context context){
        PushManager.getInstance().initialize(context, GetuiPushService.class);
    }
}
