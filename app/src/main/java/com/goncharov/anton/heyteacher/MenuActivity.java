package com.goncharov.anton.heyteacher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        String[] choices = getResources().getStringArray(R.array.student_choices);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layoutMenu);

        TextView textView;
        Button button;
        for (int i = 0; i < linearLayout.getChildCount(); i++)
        {
            View view = linearLayout.getChildAt(i);
            if (view instanceof TextView) {
                textView = (TextView) view;
                textView.setText(choices[i]);
            }
            if (view instanceof Button) {
                button = (Button) view;
                button.setOnClickListener(this);
            }
        }
    }

    @Override
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.button1:
                /*Intent intent1 = new Intent(this, someActivity.class);
                startActivity(intent1);*/
                break;
            case R.id.button2:
                /*Intent intent2 = new Intent(this, someActivity.class);
                startActivity(intent2);*/
                break;
            case R.id.button3:
                /*Intent intent3 = new Intent(this, someActivity.class);
                startActivity(intent3);*/
                break;
        }
    }
}
