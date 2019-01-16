package fr.wcs.musicband;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class FinishCreationActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finish_creation_activity);
        Intent intent = getIntent();
        String desc = intent.getStringExtra("Desc");
        Intent intentTwo = getIntent();
        String groupe = intent.getStringExtra("Grp");

        TextView textViewDesc = findViewById(R.id.tv_description);
        textViewDesc.setText(desc);
        TextView textViewGroup = findViewById(R.id.tv_name_group);
        textViewGroup.setText(groupe);
    }
}
