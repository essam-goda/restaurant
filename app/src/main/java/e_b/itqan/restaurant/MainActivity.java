package e_b.itqan.restaurant;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    sharedpreferences Pref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Pref = new sharedpreferences(this);
        if (Pref.getPrefs().equals("null")) {
            Intent lo = new Intent(MainActivity.this, Login_activity.class);
            startActivity(lo);
        }
    }

}