package jp.ac.asojuku.st.asoretry2016no2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button googleBtn = (Button) findViewById(R.id.googleBtn);
        Button mailBtn = (Button) findViewById(R.id.mailBtn);

        googleBtn.setOnClickListener(this);
        mailBtn.setOnClickListener(this);
    }

    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.googleBtn:
                Uri uri = Uri.parse("http://google.com");
                intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                break;
            case R.id.mailBtn:
                intent = new Intent(this, Send_mail.class);
                startActivity(intent);
                break;
        }
    }


}