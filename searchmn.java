package com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;


import com.example.eventplanner.R;

import java.util.ArrayList;
import java.util.List;

public class searchmn extends AppCompatActivity {
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchmn);
        ListView listView=findViewById(R.id.mylistt);
        List<String> mylist = new ArrayList<>();
        mylist.add("pencil");
        mylist.add("lahore");
        mylist.add("karachi");
        mylist.add("islamabad");
        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,mylist);
        listView.setAdapter(arrayAdapter);




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_search,menu);
        MenuItem menuItem=menu.findItem(R.id.search_icon);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setQueryHint("Search Here");
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                arrayAdapter.getFilter().filter(s);
                return true;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }
}