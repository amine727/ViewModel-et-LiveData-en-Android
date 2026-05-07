package com.example.viewmodellivedatademoenrichi;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int count = 0;

    private TextView tvCount;
    private Button btnIncrement, btnDecrement, btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvCount = findViewById(R.id.tvCount);
        btnIncrement = findViewById(R.id.btnIncrement);
        btnDecrement = findViewById(R.id.btnDecrement);
        btnReset = findViewById(R.id.btnReset);

        if (savedInstanceState != null) {
            count = savedInstanceState.getInt("count_key", 0);
        }

        updateUI();

        btnIncrement.setOnClickListener(v -> {
            count++;
            updateUI();
        });

        btnDecrement.setOnClickListener(v -> {
            count--;
            updateUI();
        });

        btnReset.setOnClickListener(v -> {
            count = 0;
            updateUI();
        });
    }

    private void updateUI() {
        tvCount.setText(String.valueOf(count));
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("count_key", count);
    }
}