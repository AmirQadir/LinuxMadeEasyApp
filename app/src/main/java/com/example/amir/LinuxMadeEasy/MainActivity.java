package com.example.amir.LinuxMadeEasy;



import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.File;
import java.io.IOException;


public class MainActivity extends AppCompatActivity {

    public static int count = 0;
    Button Commandb;


    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        Commandb = (Button) findViewById(R.id.btn2);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void List(View view)
    {
        Intent i =  new Intent(this,Lists.class);
        startActivity(i);
    }



   public void Command(View view)
   {
       Intent i = new Intent(this,Cmd.class);
       startActivity(i);
   }

   public void termux(View view)
   {
       Intent j = getPackageManager().getLaunchIntentForPackage("com.termux");
       //  j.putExtra("key","echo hi");
       startActivity(j);
   }

    void sendIntent(String sharedText){
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT,sharedText);
        sendIntent.setType("text/plain");
        startActivity(sendIntent);
    }

    public void about(View view)
    {

    }

}