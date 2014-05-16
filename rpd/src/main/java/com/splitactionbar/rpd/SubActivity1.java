package com.splitactionbar.rpd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by rpd on 14/05/16.
 */
public class SubActivity1 extends Activity {

    @Override
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub1);
    }

    Intent mIntent = getIntent();
}
