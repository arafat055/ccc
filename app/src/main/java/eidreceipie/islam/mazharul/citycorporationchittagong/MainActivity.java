package eidreceipie.islam.mazharul.citycorporationchittagong;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout t_s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
        int height = displayMetrics.heightPixels;
        int  width = displayMetrics.widthPixels;
        int densityDpi = (int)(displayMetrics.density * 160f);
        t_s=(LinearLayout)findViewById(R.id.t_s);

        Log.d("height","******"+height);
        Log.d("width","******"+width);
        Log.d("densityDpi","******"+densityDpi);


        t_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.facebook.com/troubleshootdigital/?fref=ts";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });



        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                                    /* start the activity */



                Intent a = new Intent(MainActivity.this, MenueButton.class);
                startActivity(a);

                finish();
            }
        }, 5000);
    }
}
