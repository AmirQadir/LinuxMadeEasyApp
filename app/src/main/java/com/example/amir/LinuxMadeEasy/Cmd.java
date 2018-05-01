package com.example.amir.LinuxMadeEasy;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cmd extends AppCompatActivity {
    Button button[] = new Button[4];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scripts);

        button[0] = (Button) findViewById(R.id.helloworld);
        button[1] = (Button) findViewById(R.id.clearcache);
        button[2] = (Button) findViewById(R.id.checkinternet);

    }

    public void Script1(View view)
    {
        sendIntent("echo 'hello world'");
    }


    public void Script2(View view)
    {
        sendIntent("rm -rf /cache  ");
    }

    public void Script3(View view)
    {
        sendIntent("ping google.com");
    }

    public void Script4(View view)
    {

    }

    void sendIntent(String sharedText){
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT,sharedText);
        sendIntent.setType("text/plain");
        startActivity(sendIntent);
    }





}
