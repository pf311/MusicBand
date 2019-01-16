package fr.wcs.musicband;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class InscriptionActivity extends AppCompatActivity {

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inscription_activity);

        spinner = (Spinner)this.findViewById(R.id.spin_one);
        spinner = (Spinner)this.findViewById(R.id.spin_two);
        spinner = (Spinner)this.findViewById(R.id.spin_three);
        spinner = (Spinner)this.findViewById(R.id.spin_four);
        //Ajout Listener sur sélection dans la liste
        spinner.setOnItemSelectedListener(new Spinner.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int pos, long id) {
            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {

            }
        });

        Button bConfirmer = findViewById(R.id.b_confirmer);
        bConfirmer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent confirmer = new Intent(InscriptionActivity.this,MenuActivity.class);
                startActivity(confirmer);
            }
        });

    }


}
