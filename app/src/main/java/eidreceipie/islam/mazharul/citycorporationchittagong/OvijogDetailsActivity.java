package eidreceipie.islam.mazharul.citycorporationchittagong;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OvijogDetailsActivity extends Activity {
    Button button1,button2;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ovijog_details);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertMessage.showMessage(OvijogDetailsActivity.this,"মতামত গৃহীত হয়েছে","মতামত প্রদান করার জন্য আপনাকে ধন্যবাদ");

            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(OvijogDetailsActivity.this,OvijogActivity.class);
                startActivity(intent);

            }
        });


    }
}
