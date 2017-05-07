package com.ibas.iahk30;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class SimpleList extends AppCompatActivity {

    // Array of data
    String[] osArray = {
            "Android",
            "Iphone",
            "Mac Os",
            "Windows Phone",
            "Ubuntu"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_list);

        getSupportActionBar().setTitle("Simple List");

        ArrayAdapter adapter = new ArrayAdapter<String>(
                this, R.layout.simplelist, osArray
        );

        ListView listView = (ListView)findViewById(
                R.id.list_item
        );
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String select = osArray[+position];
                Toast.makeText(getApplicationContext(), select,
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}
