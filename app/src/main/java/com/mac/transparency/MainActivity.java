package com.mac.transparency;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.hello_world).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(this, SecondActivity.class);
        startActivity(i);
    }
}
