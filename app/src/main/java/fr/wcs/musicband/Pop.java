package fr.wcs.musicband;

import android.app.Activity;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Pop extends Activity {

    ConstraintLayout constraintLayout;

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

        Button ok = findViewById(R.id.button_ok);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText etPseudo = findViewById(R.id.et_pseudo);
                final String pseudo = etPseudo.getText().toString();
                if (pseudo.isEmpty()) {
                    Toast.makeText(Pop.this, "Veuillez indiquer le peuso", Toast.LENGTH_LONG).show();
                } else {
                    for (int i = 0; i < pseudo.length(); i++) {
                        TextView tv = (TextView) getLayoutInflater().inflate(R.layout.textview, null);
                        tv.setText(pseudo);
                        constraintLayout.addView(tv);
                    }

                }
            }
        });
    }
}
