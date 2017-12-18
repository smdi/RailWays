package com.example.android.railways;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

 class MyExceoption extends Exception
{
    MyExceoption(String Err_msg)
    {
        super(Err_msg);
    }
}

public class MainActivity extends AppCompatActivity {


    double x,y,res;
    TextView tv,tv1;
    EditText ed1 ,ed2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

   public void calResult(View v) {
        ed1 = (EditText) findViewById(R.id.edit_x);
        ed2 = (EditText) findViewById(R.id.edit_y);
        tv = (TextView) findViewById(R.id.dispaly_view);
       tv1 = (TextView) findViewById(R.id.ydispaly_view);

        try {
            x = Double.parseDouble(ed1.getText().toString());
            y = Double.parseDouble(ed2.getText().toString());
            if((( x<Double.MIN_VALUE)&& (x>Double.MAX_VALUE))||(( x<Integer.MIN_VALUE) && (x>Integer.MAX_VALUE)))
            {

                tv.setText("Dear User enter only numbers");
                tv1.setText("Dear User enter only numbers");
                throw (new MyExceoption(" \n Dear User Enter Only Numbers ! "));

            }
            else {


// just
                  double X = (y-35)*.017*(x);
                  double Y = 3*(y-35)*.017*(x);

                    double res =  1300.000-X;
                    double re2 =  2300.000-Y;

                    String s = ""+res;
                    String s1 = ""+re2;

                    tv.setText(s);
                    tv1.setText(s1);


            }
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }

      }



}
