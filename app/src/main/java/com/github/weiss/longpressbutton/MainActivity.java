package com.github.weiss.longpressbutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private LongPressButton longPressButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        longPressButton = (LongPressButton) findViewById(R.id.longPressButton);

        longPressButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                longPressButton.Countdown("60");
                longPressButton.timer.start();
                Toast.makeText(MainActivity.this, "开始倒计时", Toast.LENGTH_SHORT);
                return true;
            }
        });
    }
}
