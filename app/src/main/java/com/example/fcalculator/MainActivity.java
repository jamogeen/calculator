package com.example.fcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class MainActivity extends AppCompatActivity {
    Button btnclean,btnmodule,btndelete,btn7,btn8,btn9,btnsubtract,btn4,btn5,btn6,btnmultipy,btn1,btn2,btn3,btndecimal,btnzero,btnequal,btnaddition,btndivide;

    TextView inputext,outputext;
    String inputnumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1= findViewById(R.id.btn1);
        btn2= findViewById(R.id.btn2);
        btn3= findViewById(R.id.btn3);
        btn4= findViewById(R.id.btn4);
        btn5= findViewById(R.id.btn5);
        btn6= findViewById(R.id.btn6);
        btn7= findViewById(R.id.btn7);
        btn8= findViewById(R.id.btn8);
        btn9= findViewById(R.id.btn9);
        btnzero= findViewById(R.id.btnzero);

        btnclean= findViewById(R.id.btnclean);
        btnmodule= findViewById(R.id.btnmodule);
        btnsubtract= findViewById(R.id.btnsubtract);
        btndecimal= findViewById(R.id.btndecial);
        btndelete= findViewById(R.id.btndelete);
        btnaddition= findViewById(R.id.btnaddition);
        btnmultipy= findViewById(R.id.btnmultipy);
        btnequal= findViewById(R.id.btnequal);
        btndivide= findViewById(R.id.btndivide);

        inputext= findViewById(R.id.inputext);
        outputext=findViewById(R.id.outputext);

        btnclean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputext.setText("");
                outputext.setText("");

            }
        });

        btnzero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputnumber=inputext.getText().toString();
                inputext.setText(inputnumber+ "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputnumber=inputext.getText().toString();
                inputext.setText(inputnumber+ "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputnumber=inputext.getText().toString();
                inputext.setText(inputnumber+ "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputnumber=inputext.getText().toString();
                inputext.setText(inputnumber+ "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputnumber=inputext.getText().toString();
                inputext.setText(inputnumber+ "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputnumber=inputext.getText().toString();
                inputext.setText(inputnumber+ "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputnumber=inputext.getText().toString();
                inputext.setText(inputnumber+ "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputnumber=inputext.getText().toString();
                inputext.setText(inputnumber+ "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputnumber=inputext.getText().toString();
                inputext.setText(inputnumber+ "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputnumber=inputext.getText().toString();
                inputext.setText(inputnumber+ "9");
            }
        });

        btndelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputnumber=inputext.getText().toString();
                if (inputnumber.length()==0)
                {}
                else
                {

                    String delde = inputnumber.substring(0,inputnumber.length()-1);
                    inputext.setText(delde + "");
                }
            }
        });



        btndecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputnumber=inputext.getText().toString();
                inputext.setText(inputnumber+ ".");
            }
        });


        btnaddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputnumber=inputext.getText().toString();
                inputext.setText(inputnumber+ "+");
            }
        });



        btndivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputnumber=inputext.getText().toString();
                inputext.setText(inputnumber+ "/");
            }
        });

        btnmultipy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputnumber=inputext.getText().toString();
                inputext.setText(inputnumber+ "*");
            }
        });

        btnsubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputnumber=inputext.getText().toString();
                inputext.setText(inputnumber+ "-");
            }
        });

        btnmodule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputnumber=inputext.getText().toString();
                inputext.setText(inputnumber+ "%");
            }
        });

        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputnumber=inputext.getText().toString();

                ScriptEngine ingine = new ScriptEngineManager().getEngineByName(  "rhino");

                try {
                    double result = (double)ingine.eval(inputnumber);

                    outputext.setText(result+"");

                }
                catch (ScriptException e)
                {
                    Toast.makeText(getApplicationContext(),"snytax error/maths error",Toast.LENGTH_SHORT).show();
                }
            }
        });














    }
}
