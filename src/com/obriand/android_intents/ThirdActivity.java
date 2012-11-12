package com.obriand.android_intents;

import com.obriand.android_intents.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class ThirdActivity extends Activity {
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

}
