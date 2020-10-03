package com.rajangautam.factorialcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button table;
    Button factorial;
    EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (EditText) findViewById(R.id.input);
        table = (Button) findViewById(R.id.table);
        factorial = (Button) findViewById(R.id.factorial);
        textView = (TextView) findViewById(R.id.result);

        factorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = Integer.parseInt(input.getText().toString().trim());
                textView.setText(x + "! = " + factorial(x));
            }
        });
        table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
                factorial_table();
            }
        });
    }

    private long factorial(long x)
    {
        if(x < 2)
            return 1;
        else if (x <21)
            return x * factorial(x -1);
        else
            return 0;
    }
    private void factorial_table()
    {
        int x = Integer.parseInt(input.getText().toString().trim());
        for(int i = 1; i <= x; i++)
        {
            String result = i + "! = " + factorial(i) + "\n";
            textView.append(result);
        }
    }
}
