package fr.wcs.musicband;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.menu_activity);

            Button create = findViewById(R.id.ib_creation);
            create.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent createGroup = new Intent(MenuActivity.this, CreateGroupActivity.class);
                    startActivity(createGroup);
                }
            });

            Button bSee = findViewById(R.id.b_see_group);
            bSee.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent newIntent = new Intent(MenuActivity.this, MyGroupActivity.class);
                    startActivity(newIntent);
                }
            });
        }
}
