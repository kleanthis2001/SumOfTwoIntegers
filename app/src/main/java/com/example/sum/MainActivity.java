package com.example.sum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editTextTextPersonName2,editTextTextPersonName;
    private Button SumButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButton();
    }

    public void addListenerOnButton(){
        editTextTextPersonName = (EditText) findViewById(R.id.editTextTextPersonName);
        editTextTextPersonName2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        SumButton = (Button) findViewById(R.id.button2);


        SumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val1 = editTextTextPersonName.getText().toString();
                String val2 = editTextTextPersonName2.getText().toString();

                int a = Integer.parseInt(val1);
                int b = Integer.parseInt(val2);

                int sum = a + b;

                Toast.makeText(getApplicationContext(),String.valueOf(sum), Toast.LENGTH_LONG).show();            }
        });
    }
}