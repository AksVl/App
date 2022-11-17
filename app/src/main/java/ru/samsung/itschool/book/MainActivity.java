package ru.samsung.itschool.book;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.sql.SQLOutput;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void run(View view) {
        EditText InputA = (EditText) findViewById(R.id.a);
        EditText InputB = (EditText) findViewById(R.id.b);
        EditText InputC = (EditText) findViewById(R.id.c);
        double a = Double.parseDouble(InputA.getText().toString());
        double b = Double.parseDouble(InputB.getText().toString());
        double c = Double.parseDouble(InputC.getText().toString());
        String result = null;
        TextView textView = findViewById(R.id.res);
        double D = b*b-4*a*c;
        if(D==0 && !(a == 0 && b==0 && c==0)){
            result = Double.toString((-1*b)/(2*a));
        }
        else if(D<0 && a != 0){
            result = "none";
        }
        else if(D>0 && a != 0){
            result = ((-1*b-Math.sqrt(D))/(2*a))+" "+((-1*b+Math.sqrt(D))/(2*a));
        }
        else if(a == 0 && b==0 && c==0){
            result = "any";
        }
        else if(a==0){
            result = Double.toString(-1*c/b);
        }
        textView.setText(result);
    }
}
