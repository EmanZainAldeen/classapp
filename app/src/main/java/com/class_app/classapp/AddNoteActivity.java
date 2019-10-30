package com.class_app.classapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class AddNoteActivity extends AppCompatActivity {
    Button buttonAddLocation, buttonSave;
    ImageButton imageButton;
    EditText editTextNote, editTextAboutNote;
    TextView textViewTime;
    String textTitleNote, textAboutNote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);
        init();
        textTitleNote = stringInEditText(editTextNote);
        textAboutNote = stringInEditText(editTextAboutNote);







        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        buttonAddLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intentForOtherActivity(AddNoteActivity.this, MapsActivity.class);
            }
        });


    }


    void init() {
        buttonAddLocation = findViewById(R.id.buttonAddLocation);
        buttonSave = findViewById(R.id.buttonSave);
        imageButton = findViewById(R.id.imageButton);
        editTextNote = findViewById(R.id.editTextNote);
        editTextAboutNote = findViewById(R.id.editTextAboutNote);
        textViewTime = findViewById(R.id.textViewTime);

    }

    void intentForOtherActivity(Context context1, Class class1) {
        Intent intent = new Intent(context1, class1);
        startActivity(intent);
    }


    String stringInEditText(EditText editText) {
        if (!editText.getText().toString().equals(""))
            return editText.getText().toString();
        return "No Text Here";

    }

}
