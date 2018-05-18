package com.espritpixel.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public static final String EXTRA = "com.espritpixel.myfirstapp.HAI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA);

        TextView textView = findViewById(R.id.textView1);
        textView.setText(message);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this,DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA, message);
        startActivity(intent);

    }
    public void onClick(View v) {
//        setContentView(R.layout.activity_bithday);
        startActivity(new Intent(this, FragmentSampleActivity.class));
    }
}
