package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText h;
    EditText pr;
    TextView r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Connecting Variable to IDs
        h=findViewById(R.id.hours);
        pr=findViewById(R.id.payrate);
        r=findViewById(R.id.result);
    }

    public void ClickMe(View v){
        // converting  Variables to actual usable Java
        // Turning text view to String then to Double
           double hours= Double.parseDouble(h.getText().toString());
           double payrate=Double.parseDouble(pr.getText().toString());

           // Creating an instance of the Payroll class
           PayRoll gust= new PayRoll();

           // Initializing class and Calc Pay and turning it into a variable
           double payment = gust.CalcPay(hours,payrate);


           // displaying the payment to the text view
            r.setText("Your Payment is " + payment);



    }
}