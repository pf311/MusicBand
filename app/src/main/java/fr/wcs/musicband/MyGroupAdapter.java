package fr.wcs.musicband;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyGroupAdapter extends ArrayAdapter {
    public MyGroupAdapter(Context context, ArrayList<GroupeModel> groupeModels) {
        super(context, 0, groupeModels);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        GroupeModel model = (GroupeModel) getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_group, parent, false);
        }
        // Lookup view for data population
        TextView tvName = (TextView) convertView.findViewById(R.id.tv_name);
        TextView tvDesc = (TextView) convertView.findViewById(R.id.tv_style);
        // Populate the data into the template view using the data object
        tvName.setText(model.getName());
        tvDesc.setText(model.getDesciption());
        // Return the completed view to render on screen
        return convertView;
    }
    

}


