package com.example.usingintent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void onClick(View view) {
        Intent data = new Intent();
        //get the Edit Text
        EditText txt_username = (EditText)findViewById(R.id.txtUsername);
        //set Data to pass back
        data.setData(Uri.parse(txt_username.getText().toString()));
        setResult(RESULT_OK, data);
        //close the activity
        finish();
    }
}
