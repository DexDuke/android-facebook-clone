package com.example.facebookclone;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.facebookclone.Adapter.CustomAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.Arrays;

public class Home extends AppCompatActivity {

    private ListView listView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        String[] countryNames = getResources().getStringArray(R.array.country_name);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        listView = findViewById(R.id.mainListView);

        CustomAdapter adapter = new CustomAdapter(Home.this, Arrays.asList(countryNames));
        listView.setAdapter(adapter);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int itemId = menuItem.getItemId();
                if (itemId == R.id.home) {
                    // Handle Home button click
                    // Add your code here
                    return true;
                } else if (itemId == R.id.addFriend) {
                    // Handle Add Friend button click
                    // Add your code here
                    return true;
                } else if (itemId == R.id.profile) {
                    // Handle Profile button click
                    // Start the NewPageActivity when the Profile button is clicked
                    Intent intent = new Intent(Home.this, NewPageActivity.class);
                    startActivity(intent);
                    return true;
                } else if (itemId == R.id.notifications) {
                    // Handle Notifications button click
                    // Add your code here
                    return true;
                } else if (itemId == R.id.menu) {
                    // Handle Menu button click
                    // Add your code here
                    return true;
                }
                return false;
            }
        });
    }

        @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.fb_bottom_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        // Handle menu item clicks here
        int itemId = item.getItemId();
        if (itemId == R.id.home) {
            // Handle Home menu item click
            // Add your code here
            return true;
        } else if (itemId == R.id.addFriend) {
            // Handle Add Friend menu item click
            // Add your code here
            return true;
        } else if (itemId == R.id.profile) {
            // Handle Profile menu item click
            // Add your code here
            return true;
        } else if (itemId == R.id.notifications) {
            // Handle Notifications menu item click
            // Add your code here
            return true;
        } else if (itemId == R.id.menu) {
            // Handle Menu menu item click
            // Add your code here
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
