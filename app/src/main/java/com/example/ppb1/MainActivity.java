package com.example.ppb1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {

    private TextView txtDataLuas;
    private TextView txtDataKeliling;
    private EditText angka1;
    private EditText angka2;
    private Button show1;
    private Button show2;
    private Button show3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtDataLuas = (TextView)findViewById(R.id.luas);
        txtDataKeliling = (TextView)findViewById(R.id.keliling);
        angka1 = (EditText) findViewById(R.id.input1);
        angka2 = (EditText) findViewById(R.id.input2);
        show1 = (Button)findViewById(R.id.btn1);
        show2 = (Button)findViewById(R.id.btn2);
        show3 = (Button)findViewById(R.id.btn3);

        show1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Angka1, Angka2;

                Angka1 = angka1.getText().toString();
                Angka2 = angka2.getText().toString();

                double a;
                a = Double.parseDouble(Angka1);
                double b;
                b = Double.parseDouble(Angka2);
                double c;
                c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

                double hasilLuas;
                double hasilKeliling;

                hasilLuas = (a * b) / 2;
                hasilKeliling = a + b + c;
                txtDataLuas.setText("Luas = " + hasilLuas);
                txtDataKeliling.setText("Keliling = " + hasilKeliling);
            }
        });

        show2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Angka1, Angka2;

                Angka1 = angka1.getText().toString();
                Angka2 = angka2.getText().toString();

                double a;
                a = Double.parseDouble(Angka1);
                double b;
                b = Double.parseDouble(Angka2);


                double hasilLuas;
                double hasilKeliling;

                hasilLuas = a*b;
                hasilKeliling = (a+b)*2;
                txtDataLuas.setText("Luas = " + hasilLuas);
                txtDataKeliling.setText("Keliling = " + hasilKeliling);
            }
        });

        show3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Angka1, Angka2;

                Angka1 = angka1.getText().toString();
                Angka2 = angka2.getText().toString();

                double a;
                a = Double.parseDouble(Angka1);
                a = a/2;


                double hasilLuas;
                double hasilKeliling;

                hasilLuas = Math.pow(a,2)*22/7;
                hasilKeliling = 2*22/7*a;
                txtDataLuas.setText("Luas = " + hasilLuas);
                txtDataKeliling.setText("Keliling = " + hasilKeliling);
            }
        });

    }
}
