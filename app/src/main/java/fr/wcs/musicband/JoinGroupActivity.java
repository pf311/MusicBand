package fr.wcs.musicband;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class JoinGroupActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.join_group_activity);

        ListView listView = findViewById(R.id.list);
        ArrayList<JoinGroupModel> models = new ArrayList<>();

        models.add(new JoinGroupModel("Le groupe","Funk",5,"No"));
        models.add(new JoinGroupModel("Les foufous","Jazz",3,"Yes"));
        models.add(new JoinGroupModel("Fc Guitare","Metal",4,"Yes"));
        models.add(new JoinGroupModel("Lynyrd Skynyrd","Rock",5,"No"));
        models.add(new JoinGroupModel("The Rolling Stones","Rock",2,"Yes"));
        models.add(new JoinGroupModel("U2","Rock",4,"No"));
        models.add(new JoinGroupModel("Incroyable","Soul",2,"Yes"));
        models.add(new JoinGroupModel("StarFunk","Funk",56,"Yes"));

        JoinGroupAdapter adapter = new JoinGroupAdapter(this,models);
        listView.setAdapter(adapter);
    }
}
