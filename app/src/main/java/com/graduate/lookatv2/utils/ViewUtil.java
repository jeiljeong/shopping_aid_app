package com.graduate.lookatv2.utils;

import android.view.View;
import android.view.ViewGroup;

public class ViewUtil {
    private static ViewGroup getParent(View view) {
        return (ViewGroup)view.getParent();
    }

    private static void removeView(View view) {
        ViewGroup parent = getParent(view);
        if(parent != null) {
            parent.removeView(view);
        }
    }

    public static void replaceView(View currentView, View newView) {
        ViewGroup parent = getParent(currentView);
        if(parent == null) {
            return;
        }
        final int index = parent.indexOfChild(currentView);
        removeView(currentView);
        removeView(newView);
        parent.addView(newView, index);
    }
}
