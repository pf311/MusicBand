package fr.wcs.musicband;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DescriptionActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.description_activity);
        Intent intent = getIntent();
        String groupe = intent.getStringExtra("Groupe");

        TextView tvName = findViewById(R.id.tv_name);
        tvName.setText(groupe);
    }
}
