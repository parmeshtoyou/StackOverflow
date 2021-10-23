package com.param.stackoverflow.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.param.stackoverflow.R;
import com.param.stackoverflow.util.JavaMathExample1;

public class MainActivity extends AppCompatActivity {

    EditText calculateX, calculateY, output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculateX = findViewById(R.id.calculateX);
        calculateY = findViewById(R.id.calculateY);
        output = findViewById(R.id.math_test2);

        findViewById(R.id.calculate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JavaMathExample1 myObj = new JavaMathExample1();
                String inputX = calculateX.getText().toString();
                String inputY = calculateY.getText().toString();

                if (inputX.isEmpty() || inputY.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Enter X or Y value", Toast.LENGTH_LONG).show();
                } else {
                    double x = Double.parseDouble(inputX);  // Enter a number for x
                    double y = Double.parseDouble(inputY); // Enter a number for y
                    double max = myObj.fullThrottle(x, y); //This will give you result
                    output.setText(String.format("%s", max));
                }
            }
        });
    }
}
