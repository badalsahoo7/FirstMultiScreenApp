package com.example.firstmultiscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  EditText editText ;
  public static final String EXTRA_NAME ="com.example.firstmultiscreenapp.extra.NAME";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         editText=findViewById(R.id.name);
    }
    public void openActivity(View view){
        Toast.makeText(this, "Open second activity", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,MainActivity2.class);
        String nameText = editText.getText().toString();
        intent.putExtra(EXTRA_NAME,nameText);
        startActivity(intent);
    }

}