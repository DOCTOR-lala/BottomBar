package com.example.alienware.bottombar;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;


//Add dependency com.android.support:design:25.0.0 in gradle first

public class MainActivity extends AppCompatActivity {
TextView demo_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialising
        BottomNavigationView bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottom_nav);
        demo_text = (TextView)findViewById(R.id.demo);


        //Setting Listener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            //We use switch case since we get Id which is int value from listener
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){

                    case R.id.notification:
                        demo_text.setText(R.string.notifications);
                        return true;

                    case R.id.profile:
                        demo_text.setText(R.string.profile);
                        return true;

                    case R.id.favourites:
                        demo_text.setText(R.string.favourites);
                        return true;

                    case R.id.explore:
                        demo_text.setText(R.string.explore);
                        return true;

                    case R.id.home:
                        demo_text.setText(R.string.home);
                        return true;
                }

                return false;
            }
        });
    }
}
