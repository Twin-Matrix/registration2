package com.example.registrationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.backup.FileBackupHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;

public class todo extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemClickListener {
    EditText etID20;
    Button btn20;
    ListView listv;
    private ArrayList<String> item;
    private ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo);
        etID20 = findViewById(R.id.etID20);
        btn20 = findViewById(R.id.btn20);
        listv = findViewById(R.id.listv);
        item=need.readData(this);
        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,item);
        listv.setAdapter(adapter);
        btn20.setOnClickListener(this);
        listv.setOnItemClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn20:
              String Listenterd=etID20.getText().toString();
              adapter.add(Listenterd);
              etID20.setText("");
              need.writeData(item,this);


                Toast.makeText(this, "List enterd", Toast.LENGTH_SHORT).show();

            break;
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        item.remove(position);
        adapter.notifyDataSetChanged();
        Toast.makeText(this, "Deleted", Toast.LENGTH_SHORT).show();
    }
}