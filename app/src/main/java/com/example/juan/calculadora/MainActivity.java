package com.example.juan.calculadora;

import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button0,button1,button2,button3,button4,button5;
    Button button6,button7,button8,button9,buttonigual,buttonC,buttonpunto;
    Button buttonmas,buttonmenos,buttonpor,buttondiv;
    String num = "";
    String num2 = "";
    TextView termino;
    double a=0;
    double b=0;
    int flag1 =0;
    int flag=0;
    int flag2=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText) findViewById(R.id.eNumero);
        button0 = (Button)findViewById(R.id.b0);
        button1 = (Button)findViewById(R.id.b1);
        button2 = (Button)findViewById(R.id.b2);
        button3 = (Button)findViewById(R.id.b3);
        button4 = (Button)findViewById(R.id.b4);
        button5 = (Button)findViewById(R.id.b5);
        button6 = (Button)findViewById(R.id.b6);
        button7 = (Button)findViewById(R.id.b7);
        button8 = (Button)findViewById(R.id.b8);
        button9 = (Button)findViewById(R.id.b9);
        buttonmas= (Button)findViewById(R.id.bmas);
        buttonmenos = (Button)findViewById(R.id.bmenos);
        buttonC = (Button)findViewById(R.id.bc);
        buttonpor = (Button)findViewById(R.id.bmul);
        buttonigual = (Button)findViewById(R.id.bigual);
        buttondiv = (Button)findViewById(R.id.bdiv);
        termino = (TextView)findViewById(R.id.termino);
        buttonpunto=(Button)findViewById(R.id.bpunto);

    }
    public void pressed (View view){
        int id= view.getId();

        switch (id){
            case R.id.b0:
                num=num.concat("0");
                editText.setText(num);
                a=Double.parseDouble(num);
                break;
            case R.id.b1:
                num=num.concat("1");
                editText.setText(num);
                a=Double.parseDouble(num);
                break;
            case R.id.b2:
                num=num.concat("2");
                editText.setText(num);
                a=Double.parseDouble(num);
                break;
            case R.id.b3:
                num=num.concat("3");
                editText.setText(num);
                a=Double.parseDouble(num);
                break;
            case R.id.b4:
                num=num.concat("4");
                editText.setText(num);
                a=Double.parseDouble(num);
                break;
            case R.id.b5:
                num=num.concat("5");
                editText.setText(num);
                a=Double.parseDouble(num);
                break;
            case R.id.b6:
                num=num.concat("6");
                editText.setText(num);
                a=Double.parseDouble(num);
                break;
            case R.id.b7:
                num=num.concat("7");
                editText.setText(num);
                a=Double.parseDouble(num);
                break;
            case R.id.b8:
                num=num.concat("8");
                editText.setText(num);
                a=Double.parseDouble(num);
                break;
            case R.id.b9:
                num=num.concat("9");
                editText.setText(num);
                a=Double.parseDouble(num);
                break;
            case R.id.bmas:
                flag2=1;
                flag1=0;
                if (flag==0){
                    b=a;
                    flag=1;
                }
                else if (flag==1){
                    b=b+a;
                }
                num2=num2.concat(num.concat("+"));
                termino.setText(num2);
                //num=Integer.toString(b);
                num = "0";
                editText.setText(num);
                num="";
                 break;
            case R.id.bmenos:
                flag2 =2 ;
                flag1=0;
                if (flag==0){
                    b=a;
                    flag=1;
                }
                else if (flag==1){
                    b=b-a;
                }

                num2=num2.concat(num.concat("-"));
                termino.setText(num2);
                //num=Integer.toString(b);
                num="0";
                editText.setText(num);
                num = "";

                break;
            case R.id.bmul:
                flag2 =3;
                flag1=0;
                if (flag==0){
                    b=a;
                    flag=1;
                }
                else if (flag==1){
                    b=b*a;
                }

                num2=num2.concat(num.concat("*"));
                termino.setText(num2);
                //num=Integer.toString(a);
                editText.setText(num);
                num = "";

                break;
            case R.id.bdiv:
                flag2 =4;
                flag1=0;
                if (flag==0){
                    b=a;
                    flag=1;
                }
                else if (flag==1){
                    b=b/a;
                }

                num2=num2.concat(num.concat("*"));
                termino.setText(num2);
                //num=Integer.toString(a);
                editText.setText(num);
                num = "";
                break;
            case R.id.bigual:
                 if(flag2 ==1 ){
                    b=a+b;
                }
                else if (flag2==2){
                    b=b-a;
                }
                else if(flag2 ==3){
                    b=b*a;
                }
                else if (flag2 ==4){
                    b=b/a;
                }
                num2=num2.concat(num);
                num=Double.toString(b);

                editText.setText(num);
                termino.setText(num2);
                num2="";
                num="";
                flag =0;
                flag2=0;
                flag1=0;
                a=0;
                b=0;
                break;

            case R.id.bc:
                num="";
                num2="";
                a=0;
                editText.setText(num);
                termino.setText(num2);
                break;
            case R.id.bpunto:
                if (flag1==0){
                    flag1=1;
                    num=num.concat(".");
                    editText.setText(num);
                    a=Double.parseDouble(num);
                }
                else if(flag1==1){

                }
                break;


        }

    }
}
