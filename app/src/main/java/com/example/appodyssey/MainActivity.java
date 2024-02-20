package com.example.appodyssey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnPress, btnClear;
    EditText OP1, OP2;
    TextView input2, out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OP1 = findViewById(R.id.OP1);
        OP2 = findViewById(R.id.OP2);
        input2 = findViewById(R.id.input2);
        out = findViewById(R.id.out);
        btnPress = findViewById(R.id.btnPress);
        btnClear = findViewById(R.id.btnClear);
        btnPress.setOnClickListener(this);
        btnClear.setOnClickListener(this);
    }

    public void onClick(View v) {
        if (v.getId() == R.id.btnPress) {
            double input1, input2, output;
            input1 = Double.parseDouble(OP1.getText().toString());
            input2 = Double.parseDouble(OP2.getText().toString());
            output = input1 + input2;
            out.setText(String.valueOf(output));
        } else if (v.getId() == R.id.btnClear) {
            out.setText("");
            input2.setText("");
        }
    }
}


