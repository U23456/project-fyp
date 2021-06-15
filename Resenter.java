package com;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.eventplanner.R;

import java.util.ArrayList;

public class Resenter extends AppCompatActivity {
    private ListView listView ,listview1;
    private ArrayList<String> arrayList;
    private ArrayAdapter adapter;
    private Button addItem;
    EditText GetValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resenter);
        listView=(ListView)findViewById(R.id.list_item1);

        addItem=(Button)findViewById(R.id.add_item);
        GetValue = (EditText) findViewById(R.id.editvalue);
        arrayList = new ArrayList<String>();
       



        adapter = new ArrayAdapter(com.Resenter.this, android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(adapter);
        addItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count = arrayList.size()+1;
                arrayList.add("Item :"+count);
                adapter.notifyDataSetChanged();

            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"your clicked item here"+adapter.getItem(position),Toast.LENGTH_LONG).show();




            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final int which_items = position;
                new AlertDialog.Builder(com.Resenter.this)
                        .setIcon(android.R.drawable.ic_delete)
                        .setTitle("Are you sure")
                        .setMessage("Do you want to delete this item")
                        .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                arrayList.remove(which_items);
                                adapter.notifyDataSetChanged();
                            }
                        })
                        .setNegativeButton("No",null)
                        .show();
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        if (position == 0){
                            Intent intent= new Intent(view.getContext(),com.dhuntry.class);
                            startActivity(intent);
                        }
                        if (position == 1){
                            Intent intent= new Intent(view.getContext(),com.dmeraki.class);
                            startActivity(intent);
                        }
                        if (position == 2){
                            Intent intent= new Intent(view.getContext(),com.dokara.class);
                            startActivity(intent);
                        }
                        if (position == 3){
                            Intent intent= new Intent(view.getContext(),com.dcocochan.class);
                            startActivity(intent);
                        }
                        if (position == 4){
                            Intent intent= new Intent(view.getContext(),com.dhavelirestrutrant.class);
                            startActivity(intent);
                        }
                        if (position == 5){
                            Intent intent= new Intent(view.getContext(),com.dshiraz.class);
                            startActivity(intent);
                        }
                        if (position == 6){
                            Intent intent= new Intent(view.getContext(),com.dkeyani.class);
                            startActivity(intent);
                        }

                    }
                });




            }
        });

    }
}