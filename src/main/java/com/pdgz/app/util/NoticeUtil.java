package com.pdgz.app.util;

import com.gexin.rp.sdk.base.impl.AppMessage;
import com.gexin.rp.sdk.http.IGtPush;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


/**
 * 消息推送工具类
 */
public class NoticeUtil extends SpringBootServletInitializer {
    Logger logger = LoggerFactory.getLogger(NoticeUtil.class);

    private static final String IOS = "ios";
    private static final String ANDROID ="Android";

    private static String pushMessage(){
        IGtPush push = new IGtPush("","","");
        AppMessage appmessage = new AppMessage();
        return null;
    }


}
