package com.example.student1.myapplication3;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private EditText editText2;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        textView = (TextView) findViewById(R.id.textView);
        Button b = findViewById(R.id.button);
        View.OnClickListener Listener = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                double a, b, c;

                String S1 = editText.getText().toString();
                String S2 = editText2.getText().toString();
                a = Double.parseDouble(S1);
                b = Double.parseDouble(S2);
                c = a + b;

                String S = Double.toString(c);

                textView.setText(S);
            }
        };
        b.setOnClickListener(Listener);
    }
}
