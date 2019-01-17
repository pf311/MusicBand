package fr.wcs.musicband;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FinishCreationActivity extends AppCompatActivity {

    private ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finish_creation_activity);
        constraintLayout = (ConstraintLayout) findViewById(R.id.container);
        Intent intent = getIntent();
        String desc = intent.getStringExtra("Desc");
        Intent intentTwo = getIntent();
        String groupe = intent.getStringExtra("Grp");
        Intent intentThree = getIntent();
        String psd = intent.getStringExtra("pseudo");
        TextView textViewPseudo = findViewById(R.id.tv_pseudo);
        textViewPseudo.setText(psd);

       /* for (int i = 0; i < psd.length(); i++) {
            TextView tv = (TextView) getLayoutInflater().inflate(R.layout.textview, null);
            constraintLayout.addView(tv);
        }*/


        TextView textViewDesc = findViewById(R.id.tv_description);
        textViewDesc.setText(desc);
        TextView textViewGroup = findViewById(R.id.tv_name_group);
        textViewGroup.setText(groupe);
        PopUp();
    }

    public void PopUp() {
        Button popPup = findViewById(R.id.buttonPop);
        popPup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FinishCreationActivity.this, Pop.class));
            }
        });
    }


}

