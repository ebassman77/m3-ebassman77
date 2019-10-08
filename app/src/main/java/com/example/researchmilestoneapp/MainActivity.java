package com.example.researchmilestoneapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void toastCreate(View view) {
        Toast newToast = Toast.makeText(this, "This is a simple integer counter!", Toast.LENGTH_SHORT);
        newToast.show();

    }
    public void increaseCount(View view) {
        TextView countTextView = (TextView) findViewById(R.id.textView);
        String stringCount = countTextView.getText().toString();
        Integer num = Integer.parseInt(stringCount);
        num++;
        countTextView.setText(num.toString());
    }
    public void decreaseCount(View view) {
        TextView countTextView = (TextView) findViewById(R.id.textView);
        String stringCount = countTextView.getText().toString();
        Integer num = Integer.parseInt(stringCount);
        num--;
        countTextView.setText(num.toString());
    }
}
