package com.example.tutorial3;
import android.os.Bundle;
import android.widget.Toast;

public class after_login extends MainActivity
{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.after_login);

        Toast.makeText(getApplicationContext(), "Welcome",Toast.LENGTH_LONG).show();
    }

}
