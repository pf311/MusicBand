package fr.wcs.musicband;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class JoinGroupAdapter extends ArrayAdapter {
    public JoinGroupAdapter(Context context, ArrayList<JoinGroupModel> joinModels) {
        super(context, 0, joinModels);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        JoinGroupModel model = (JoinGroupModel) getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_join_group, parent, false);
        }
        // Lookup view for data population
        TextView tvMembers = (TextView) convertView.findViewById(R.id.tv_members);
        TextView tvName = (TextView) convertView.findViewById(R.id.text_name);
        TextView tvDesc = (TextView) convertView.findViewById(R.id.text_desc);
        TextView newMembers = (TextView) convertView.findViewById(R.id.text_new);
        // Populate the data into the template view using the data object
        assert model != null;
        tvMembers.setText(Integer.toString(model.getMembers()));
        tvName.setText(model.getName());
        tvDesc.setText(model.getType());
        newMembers.setText(model.getNewMembers());

        // Return the completed view to render on screen
        return convertView;
    }
}
