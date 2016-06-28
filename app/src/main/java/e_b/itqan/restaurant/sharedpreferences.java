package e_b.itqan.restaurant;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Essam_Goda on 6/28/2016.
 */
public class sharedpreferences {
    public static final String MyPREFERENCES = "MyPrefs";
    public static final String Name = "name";
    public static final String Phone = "phone";
    public static final String address = "address";
    SharedPreferences sharedpreferences;

    sharedpreferences(Context con) {

        sharedpreferences = con.getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
    }

    void setPrefs(String n, String ph, String a) {
        SharedPreferences.Editor editor = sharedpreferences.edit();

        editor.putString(Name, n);
        editor.putString(Phone, ph);
        editor.putString(address, a);
        editor.commit();
    }

    String getPrefs() {
        return sharedpreferences.getString(Name, "null");
    }


}
