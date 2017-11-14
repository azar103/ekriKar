package com.anis.zarrouk.ekrikar.controler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.anis.zarrouk.ekrikar.R;


public class MainActivity extends AppCompatActivity {
    private EditText mUserEdit;
    private EditText mPasswordEdit;
    private CheckBox mRememberCheck;
    private Button mButtonConnexion;
    private Button mButtonInscription;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //identifer les elements
        mUserEdit = (EditText)findViewById(R.id.activity_main_username_edit);
        mPasswordEdit=(EditText)findViewById(R.id.activity_main_password_edit);
        mRememberCheck=(CheckBox)findViewById(R.id.activity_main_remember_check);
        mButtonConnexion=(Button)findViewById(R.id.activity_main_connexion_btn);
        mButtonInscription=(Button)findViewById(R.id.activity_main_inscription_btn);
        //ajouter un listener au bouton d'inscription
        mButtonInscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }




}
