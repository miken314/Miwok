package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView numbersTextView = (TextView) findViewById(R.id.numbers);
        numbersTextView.setOnClickListener(new NumbersClickListener());
    }
}
// the above is simplified from:
// NumbersClickListener clickListener = new NumbersClickListener();
// numbersTextView.setOnClickListener(clickListener);