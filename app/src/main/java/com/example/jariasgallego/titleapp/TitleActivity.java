package com.example.jariasgallego.titleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TitleActivity extends AppCompatActivity {

    private String title = "Aquest és el títol inicial...";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title);
        TextView title_text = (TextView) findViewById(R.id.title);
        title_text.setText(title);
    }

    public void editTitle(View view) {
        //1. Crear un 'intent'
        Intent intent = new Intent(this, EditTitleActivity.class);
        //2. Afegir paràmetres (dades extra) a la crida de l'activitat
        intent.putExtra("title", title);
        //3. Passar l'intent a Android perquè obri l'activitat
        startActivity(intent);
    }
}
