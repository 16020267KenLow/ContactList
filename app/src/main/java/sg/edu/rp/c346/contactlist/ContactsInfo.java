package sg.edu.rp.c346.contactlist;

/**
 * Created by 16020267 on 23/7/2018.
 */

public class ContactsInfo  {
    public String name;
    public String countrycode;
    public String phone;

    public ContactsInfo(String name, String countrycode, String phone) {
        this.name = name;
        this.countrycode = countrycode;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "ContactsInfo{" +
                "name='" + name + '\'' +
                ", countrycode='" + countrycode + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
