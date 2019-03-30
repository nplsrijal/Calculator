package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btndivide,btnmult,btnsub,btnadd,btndot,btnc,btncalc,btnclearlast;
    private TextView inputval;
    double answer;
    private static DecimalFormat df2 = new DecimalFormat(".##");




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btn0=findViewById(R.id.btn0);
        btndot=findViewById(R.id.btndot);
        btnc=findViewById(R.id.btnc);
        btnadd=findViewById(R.id.btnadd);
        btnsub=findViewById(R.id.btnsub);
        btnmult=findViewById(R.id.btnmult);
        btndivide=findViewById(R.id.btndivide);
        btncalc=findViewById(R.id.btncalc);
        btnclearlast=findViewById(R.id.btnclearlast);






        inputval=findViewById(R.id.inputval);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputval.setText(inputval.getText().toString() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputval.setText(inputval.getText().toString() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputval.setText(inputval.getText().toString() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputval.setText(inputval.getText().toString() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputval.setText(inputval.getText().toString() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputval.setText(inputval.getText().toString() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputval.setText(inputval.getText().toString() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputval.setText(inputval.getText().toString() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputval.setText(inputval.getText().toString() + "9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputval.setText(inputval.getText().toString() + "0");
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    inputval.setText(inputval.getText().toString() + ".");

            }
        });
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputval.setText("0");
            }
        });
        btnclearlast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String edited=inputval.getText().toString().substring(0, inputval.getText().toString().length() - 1);
                inputval.setText(""+edited);
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputval.setText(inputval.getText().toString() + "+");
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputval.setText(inputval.getText().toString() + "-");
            }
        });

        btnmult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputval.setText(inputval.getText().toString() + "*");
            }
        });

        btndivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputval.setText(inputval.getText().toString() + "/");
            }
        });
        btncalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = inputval.getText().toString();


                String[] separated = value.split("[-+*/]");
                double part1 = Double.parseDouble(separated[0]);
                double part2 = Double.parseDouble(separated[1]);

                Pattern p = Pattern.compile("[+]");
                Matcher m = p.matcher(value);
                if (m.find()){
                    answer = part1 + part2;
                    inputval.setText(""+df2.format(answer));
                }
                Pattern p1 = Pattern.compile("[-]");
                Matcher m1 = p1.matcher(value);
                if (m1.find()){
                    answer = part1 - part2;
                    inputval.setText(""+df2.format(answer));
                }
                Pattern p2 = Pattern.compile("[*]");
                Matcher m2 = p2.matcher(value);
                if (m2.find()){
                    answer = part1 * part2;
                    inputval.setText(""+df2.format(answer));
                }
                Pattern p3 = Pattern.compile("[/]");
                Matcher m3 = p3.matcher(value);
                if (m3.find()){
                    answer = part1 / part2;
                    inputval.setText(""+df2.format(answer));
                }






            }

    });






    }
}
