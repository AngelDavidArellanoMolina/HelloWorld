package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText ageEdit = findViewById(R.id.age_edit);
        TextView resultText = findViewById(R.id.result_set);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String edad = ageEdit.getText().toString();
                if (!edad.isEmpty()){
                    int ageInt = Integer.parseInt(edad);
                    int result = ageInt * 7;
                    String resultString = ("Si fueras perro, te edad sería de " + result + " años");

                    resultText.setText(resultString);
                }

            }
        });
    }
}