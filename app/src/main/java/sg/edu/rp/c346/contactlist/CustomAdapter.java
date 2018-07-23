package sg.edu.rp.c346.contactlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 16020267 on 23/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<ContactsInfo> infoList;


    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<ContactsInfo> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        infoList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvCountryCode = rowView.findViewById(R.id.textViewCountryCode);
        TextView tvPhone = rowView.findViewById(R.id.textViewPhoneNo);

        ContactsInfo currentItem = infoList.get(position);
        String name = currentItem.getName();
        String countrycode = currentItem.getCountrycode();
        String phone = currentItem.getPhone();

        tvCountryCode.setHint(countrycode);
        tvName.setText(name);
        tvPhone.setHint(phone);

        return rowView;
    }
}
