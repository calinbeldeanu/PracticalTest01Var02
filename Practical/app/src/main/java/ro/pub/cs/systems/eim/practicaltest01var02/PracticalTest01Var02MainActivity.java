package ro.pub.cs.systems.eim.practicaltest01var02;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PracticalTest01Var02MainActivity extends AppCompatActivity {

    String nr1;
    String nr2;
    String rez;
    EditText numar1,numar2,rezultat;
    Button plus, minus,second;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var02_main);
        numar1 = findViewById(R.id.numar1);
        numar2 = findViewById(R.id.numar2);
        rezultat = findViewById(R.id.rezultat);

        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        second = findViewById(R.id.second);



        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nr1.length() == 0 && numar1.getText().toString() != null){
                    Toast.makeText(PracticalTest01Var02MainActivity.this, "Introdu numar1", Toast.LENGTH_LONG);
                }

                if(nr2.length() == 0 && numar2.getText().toString() != null){
                    Toast.makeText(PracticalTest01Var02MainActivity.this, "Introdu numar2", Toast.LENGTH_LONG);
                }

                nr1 = numar1.getText().toString().trim();
                nr2 = numar2.getText().toString().trim();



                Integer dif = Integer.parseInt(nr1) - Integer.parseInt(nr2);
                rez = nr1 + " - " + nr2 + " = " + dif.toString();
                rezultat.setText(rez);


            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 nr1 = numar1.getText().toString().trim();
                 nr2 = numar2.getText().toString().trim();

                if(nr1.length() == 0 && numar1.getText().toString() != null){
                    Toast.makeText(PracticalTest01Var02MainActivity.this, "Introdu numar1", Toast.LENGTH_LONG);
                }

                if(nr2.length() == 0 && numar2.getText().toString() != null){
                    Toast.makeText(PracticalTest01Var02MainActivity.this, "Introdu numar2", Toast.LENGTH_LONG);
                }


                Integer dif = Integer.parseInt(nr1) + Integer.parseInt(nr2);

                rez = nr1 + " + " + nr2 + " = " + dif.toString();
                Log.d("lala" , "sdjsadjasjdas");
                rezultat.setText(rez);


            }
        });

       second.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(PracticalTest01Var02MainActivity.this, PracticalTest01Var2SecondaryActivity.class);
               intent.putExtra("rezultat", rezultat.getText().toString().trim());
               startActivity(intent);
           }
       });

        if(this.getIntent() != null){
            String response = this.getIntent().getStringExtra("rezultat");
            if(response != null){
                Toast.makeText(this, response, Toast.LENGTH_SHORT).show();
            }

    }



          }




}
