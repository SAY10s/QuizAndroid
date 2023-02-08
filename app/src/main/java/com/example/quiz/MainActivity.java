package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView questionBox = (TextView) findViewById(R.id.questionBox);
        TextView resultBox = (TextView) findViewById(R.id.resultBox);
        Button opt1 = (Button) findViewById(R.id.opt1);
        Button opt2 = (Button) findViewById(R.id.opt2);
        Button opt3 = (Button) findViewById(R.id.opt3);
        Button opt4 = (Button) findViewById(R.id.opt4);

        int currentAnsw = 1;

        opt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(currentAnsw == 1){
                    resultBox.setText("CORRECT ANSWER!!!");
                }
                else{
                    resultBox.setText("incorrect answer :c");
                }
            }
        });
    }
}