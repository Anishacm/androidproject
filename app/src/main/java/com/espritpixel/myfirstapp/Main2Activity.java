package com.espritpixel.myfirstapp;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    public void onClick(View v)
    {
        TextView textview1 = (TextView) findViewById(R.id.textView2);
        String name=textview1.getText().toString();

        TextView textview2 = (TextView) findViewById(R.id.textView3);
        textview2.setText(name);

    }
}