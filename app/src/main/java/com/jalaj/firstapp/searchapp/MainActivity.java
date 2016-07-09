package com.jalaj.firstapp.searchapp;

import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnB1;
    EditText edTxtEd1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnB1 = (Button)findViewById(R.id.btnSearch);
        edTxtEd1 = (EditText)findViewById(R.id.edTxtEd1);
        btnB1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent iSearch = new Intent(Intent.ACTION_PICK,  ContactsContract.Contacts.CONTENT_URI);
        startActivity(iSearch);
    }
}
