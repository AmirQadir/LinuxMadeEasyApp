package com.example.amir.LinuxMadeEasy;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lists extends AppCompatActivity {
    Button button[] = new Button[15];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lists);
        button[0] = (Button) findViewById(R.id.btnlsa);
        button[1] = (Button) findViewById(R.id.btnlscolor);
        button[2] = (Button) findViewById(R.id.btnlsd);
        button[3] = (Button) findViewById(R.id.btnlsF);
        button[4] = (Button) findViewById(R.id.btnlsi);
        button[5] = (Button) findViewById(R.id.btnlsl);
        button[6] = (Button) findViewById(R.id.btnlsla);
        button[7] = (Button) findViewById(R.id.btnlslh);
        button[8] = (Button) findViewById(R.id.btnlsls);
        button[9] = (Button) findViewById(R.id.btnlsr);
        button[10] = (Button) findViewById(R.id.btnlsR);
        button[11] = (Button) findViewById(R.id.btnlss);
        button[12] = (Button) findViewById(R.id.btnlsS);
        button[13] = (Button) findViewById(R.id.btnlst);
        button[14] = (Button) findViewById(R.id.btnlsX);

    }


    public void button1(View view)
    {

        sendIntent("cd / && ls -a");
    }


    public void button2(View view)
    {
        sendIntent("ls --color");
    }


    public void button3(View view)
    {
        sendIntent("ls -d");
    }


    public void button4(View view)
    {
        sendIntent("ls -F");
    }

    public void button5(View view)
    {
        sendIntent("ls -i");
    }


    public void button6(View view)
    {
        sendIntent("ls -l");
    }

    public void button7(View view)
    {
        sendIntent("ls -la");
    }

    public void button8(View view)
    {
        sendIntent("ls -lh");
    }

    public void button9(View view)
    {
        sendIntent("ls -ls");
    }

    public void button10(View view)
    {
        sendIntent("ls -r");
    }

    public void button11(View view)
    {
        sendIntent("ls -R");
    }


    public void button12(View view)
    {
        sendIntent("ls -s");
    }


    public void button13(View view)
    {
        sendIntent("ls -S");
    }


    public void button14(View view)
    {
        sendIntent("ls -T");
    }

    public void button15(View view)
    {
        sendIntent("ls -X");
    }

    void sendIntent(String sharedText){
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT,sharedText);
        sendIntent.setType("text/plain");
        startActivity(sendIntent);
    }


}
