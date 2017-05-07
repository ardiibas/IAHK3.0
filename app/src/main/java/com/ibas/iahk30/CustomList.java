package com.ibas.iahk30;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class CustomList extends AppCompatActivity {

    String[] itemName = {
            "Nama 1",
            "Nama 2",
            "Nama 3",
            "Nama 4",
            "Nama 5",
            "Nama 6",
            "Nama 7",
            "Nama 8",
            "Nama 9",
            "Nama 10"
    };

    Integer[] itemImage = {
            R.drawable.gb1,
            R.drawable.gb2,
            R.drawable.gb3,
            R.drawable.gb4,
            R.drawable.gb5,
            R.drawable.gb6,
            R.drawable.gb7,
            R.drawable.gb8,
            R.drawable.gb9,
            R.drawable.gb10
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);

        getSupportActionBar().setTitle("Custom List");

        CustomAdapter adapter = new CustomAdapter(
                this, itemName, itemImage
        );

        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String select = itemName[+position];
                Toast.makeText(getApplicationContext(), select,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}