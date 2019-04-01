package ro.pub.cs.systems.eim.practicaltest01var02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PracticalTest01Var2SecondaryActivity extends AppCompatActivity {

    EditText text;
    Button correct, incorrect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var2_secondary);

        correct = findViewById(R.id.correct);
        incorrect = findViewById(R.id.incorrect);

        text = findViewById(R.id.text);
        Intent intent = this.getIntent();
        String value = intent.getStringExtra("rezultat");
        text.setText(value);

        correct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PracticalTest01Var2SecondaryActivity.this, PracticalTest01Var02MainActivity.class);
                intent.putExtra("rezultat", "correct");
                startActivity(intent);
            }
        });

        incorrect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PracticalTest01Var2SecondaryActivity.this, PracticalTest01Var02MainActivity.class);
                intent.putExtra("rezultat", "incorrect");
                startActivity(intent);
            }
        });


    }
}
