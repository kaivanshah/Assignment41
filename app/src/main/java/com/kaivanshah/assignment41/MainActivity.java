package com.kaivanshah.assignment41;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    ListView lv_List;
    String[] Months= new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September",
            "October", "November", "December"};

    Button btn_Asc, btn_Dsc;
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv_List= (ListView)findViewById(R.id.lv_List);
        btn_Asc = (Button) (this.findViewById(R.id.btn_Asc));
        btn_Dsc = (Button) (this.findViewById(R.id.btn_Dsc));
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Months);
        lv_List.setAdapter(adapter);
        btn_Asc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Arrays.sort(Months);
                    adapter.notifyDataSetChanged();
            }
        });
        btn_Dsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Arrays.sort(Months, Collections.<String>reverseOrder());
                adapter.notifyDataSetChanged();
            }
        });
    }


}
