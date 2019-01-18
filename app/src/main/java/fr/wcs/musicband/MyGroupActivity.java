package fr.wcs.musicband;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class MyGroupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_group_activity);


        ListView listView = findViewById(R.id.listView);
        ArrayList<GroupeModel> models = new ArrayList<>();

        models.add(new GroupeModel("Green Day", "Rock"));
        models.add(new GroupeModel("Led Zeppelin", "Rock"));
        models.add(new GroupeModel("Scorpion", "Rock"));
        models.add(new GroupeModel("Sum 41", "Punk-Rock"));
        models.add(new GroupeModel("Les violonistes", "Classique"));

        MyGroupAdapter adapter = new MyGroupAdapter(this,models);
        listView.setAdapter(adapter);


    }
}