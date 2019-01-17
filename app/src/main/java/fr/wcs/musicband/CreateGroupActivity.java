package fr.wcs.musicband;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreateGroupActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_group_activity);

        confirmButton();
    }

    public void confirmButton() {
        Button confirm = findViewById(R.id.button_confirm);
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText etGroup = findViewById(R.id.tv_group);
                final String textGroup = etGroup.getText().toString();

                if (textGroup.isEmpty()) {
                    Toast.makeText(CreateGroupActivity.this, "Veuillez indiquer le nom du groupe", Toast.LENGTH_LONG).show();
                } else {
                    Intent description = new Intent(CreateGroupActivity.this, DescriptionActivity.class);
                    description.putExtra("Groupe", etGroup.getText().toString());
                    startActivity(description);
                }
            }

        });
    }
}
