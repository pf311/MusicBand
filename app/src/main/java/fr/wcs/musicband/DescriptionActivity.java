package fr.wcs.musicband;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DescriptionActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.description_activity);
        Intent intent = getIntent();
        String groupe = intent.getStringExtra("Groupe");

        TextView tvName = findViewById(R.id.tv_name_group);
        tvName.setText(groupe);
        tvName.getText().toString();
        confirmButton();
    }

    public void confirmButton(){
        Button confirm = findViewById(R.id.bComfirmer);
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText etDesc = findViewById(R.id.tv_description);
                TextView tvNameGrp = findViewById(R.id.tv_name_group);
                final String strGrp = tvNameGrp.getText().toString();
                final String textDesc = etDesc.getText().toString();

                if (textDesc.isEmpty()) {
                    Toast.makeText(DescriptionActivity.this, "Veuillez indiquer le nom du groupe", Toast.LENGTH_LONG).show();
                } else {
                    Intent description = new Intent(DescriptionActivity.this, FinishCreationActivity.class);
                    description.putExtra("Desc", etDesc.getText().toString());
                    description.putExtra("Grp", strGrp);
                    startActivity(description);
                }
            }

        });
    }
}
