package com.example.labo4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class NewActivity extends AppCompatActivity {

    private TextView mTextView, mTextView2;
    private String name, email;
    private Button mButton;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newactivity);
        this.mTextView = findViewById(R.id.tv_nameG);
        this.mTextView3 = findViewById(R.id.tv_emailG);
        this.mTextView4 = findViewById(R.id.tv_generoG);
        this.mButton = findViewById(R.id.btn_share);

        Intent mIntent = getIntent();

        if(mIntent!=null){
            this.name = mIntent.getStringExtra(AppConstants.TEXT_NAME);
            this.email = mIntent.getStringExtra(AppConstants.TEXT_MAIL);
            this.gender = mIntent.getStringExtra(AppConstants.TEXT_GENDER);
            this.mTextView.setText(String.valueOf(this.name));
            this.mTextView3.setText(String.valueOf(this.email));




        }



        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent mIntentShare = new Intent();

                mIntentShare.setAction(Intent.ACTION_SEND);

                mIntentShare.setType("text/plain");

                mIntentShare.putExtra(Intent.EXTRA_TEXT, "Nombre: " + NewActivity.this.mTextView.getText().toString() + " " + "Contraseña: " + NewActivity.this.mTextView2.getText().toString()

                        + " " + "Email: " + NewActivity.this.mTextView3.getText().toString() + " " + "Genero: " + NewActivity.this.mTextView4.getText().toString());

                NewActivity.this.startActivity(mIntentShare);

            }
        });







    }





}

