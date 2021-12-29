package com.example.gestion_des_notes;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;
import com.example.gestion_des_notes.Resultat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayList<Resultat> bulletinList = new ArrayList<Resultat>();
    ArrayAdapter<Resultat> adapter;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bulletinList.add(new Resultat(20, "math"));
        bulletinList.add(new Resultat(20, "math"));

        EditText nt = findViewById(R.id.id_note);
        Spinner mdl = (Spinner) findViewById(R.id.spinner);
        ListView list = (ListView)  findViewById(R.id.bulletin);
        Button saisir = (Button) findViewById(R.id.button);
        adapter = new ArrayAdapter<Resultat>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                bulletinList);
        ArrayAdapter<Resultat> adapter1 = new ArrayAdapter<Resultat>(this, android.R.layout.simple_list_item_1,bulletinList);

        list.setAdapter(adapter);

        saisir.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Resultat r = new Resultat();
                String module = mdl.getSelectedItem().toString();
                Double note = Double.valueOf(nt.getText().toString());

                r.setNote(note);
                r.setModule(module);

                bulletinList.add(r);

                list.setAdapter(adapter1);
               // adapter.notifyDataSetChanged();

               // Toast.makeText(getApplicationContext(), msg , Toast.LENGTH_SHORT).show();

            }
        });

    }
}