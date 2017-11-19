package com.goncharov.anton.heyteacher;

import android.app.Notification;
import android.view.View;

interface Messages {
    void callback(View view, String result);

}

public class Text implements Messages{
    @Override
    public void callback(View view, String result) {

    }
}
