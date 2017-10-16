package com.example.jariasgallego.titleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class EditTitleActivity extends AppCompatActivity {

    private EditText edit_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_title);

        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        edit_title = (EditText) findViewById(R.id.edit_title);
        edit_title.setText(title);
    }
}
