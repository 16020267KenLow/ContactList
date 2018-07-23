package sg.edu.rp.c346.contactlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvContact;
    ArrayList<ContactsInfo> alContactInfo;
    CustomAdapter caContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContact = findViewById(R.id.ListViewContacts);
        alContactInfo = new ArrayList<>();
        ContactsInfo contact1 = new ContactsInfo("Ken", "+65", "91775365");
        ContactsInfo contact2 = new ContactsInfo("Xiao Ding Dong", "+65", "83844838");

        alContactInfo.add(contact1);
        alContactInfo.add(contact2);

        caContact = new CustomAdapter(this, R.layout.contact_list, alContactInfo);
        lvContact.setAdapter(caContact);
    }
}
