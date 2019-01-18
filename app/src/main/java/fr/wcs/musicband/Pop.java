package fr.wcs.musicband;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Pop extends Activity {

    ConstraintLayout constraintLayout;
    TextView writePseudo = findViewById(R.id.tv_write_pseudo);
    Button confirm = findViewById(R.id.buttonConfirm);
    EditText etPseudo = findViewById(R.id.et_pseudo);
    final String pseudo = etPseudo.getText().toString();
    List members = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popwindow);
        constraintLayout = findViewById(R.id.container);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width * .8), (int) (height * .6));

        final Button ok = findViewById(R.id.button_ok);
        ok.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (pseudo.isEmpty()) {
                    Toast.makeText(Pop.this, "Veuillez indiquer le peuso", Toast.LENGTH_LONG).show();
                } else {
                    TextView textView = (TextView) getLayoutInflater().inflate(R.layout.textview, null);
                    textView.setText("");
                    for (int i = 0; i < pseudo.length(); i++) {
                        TextView tv = (TextView) getLayoutInflater().inflate(R.layout.textview, null);
                        tv.setText("Vous avez bien ajouté : " + pseudo);
                        constraintLayout.addView(tv);
                    }
                    etPseudo.setVisibility(View.GONE);
                    etPseudo.setEnabled(false);
                    ok.setVisibility(View.GONE);
                    writePseudo.setVisibility(View.GONE);
                    confirm.setVisibility(View.VISIBLE);

                }
            }
        });

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                members.add(pseudo);
            }
        });
    }
}
