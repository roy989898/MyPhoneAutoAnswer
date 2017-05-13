package com.example.pomingpo.pomautoanswer;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;

/**
 * Created by pomingpo on 2017/5/7.
 */

public class RobService extends AccessibilityService {

    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {

        int eventType = event.getEventType();
        Log.d("onAccessibilityEvent", eventType + "");
    }

    @Override
    public void onInterrupt() {
    }

    @Override
    protected void onServiceConnected() {
        AccessibilityServiceInfo serviceInfo = new AccessibilityServiceInfo();
        serviceInfo.eventTypes = AccessibilityEvent.TYPES_ALL_MASK;
        serviceInfo.feedbackType = AccessibilityServiceInfo.FEEDBACK_GENERIC;
        serviceInfo.packageNames = new String[]{"com.example.pomingpo.pomautoanswer","com.facebook.katana","com.android.incallui","com.android.providers.telephony","com.android.server.telecom"};
        serviceInfo.notificationTimeout = 100;
        setServiceInfo(serviceInfo);
    }
}