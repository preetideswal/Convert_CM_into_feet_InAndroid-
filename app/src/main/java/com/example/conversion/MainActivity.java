package com.example.conversion;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
        EditText val;
        EditText result;
        Button convert;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            val = (EditText)findViewById(R.id.convertEditText);
            result = (EditText)findViewById(R.id.resultEditText);
            convert = (Button)findViewById(R.id.calculateButton);
            convert.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    double num1 = Double.parseDouble((val.getText().toString()));
                    double num3 = (num1 / 30.48);
                    result.setText(Double.toString(num3));
                }
            });
        }
}