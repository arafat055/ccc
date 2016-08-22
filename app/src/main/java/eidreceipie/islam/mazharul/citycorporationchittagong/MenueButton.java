package eidreceipie.islam.mazharul.citycorporationchittagong;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.text.method.ScrollingMovementMethod;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.TextView;

public class MenueButton extends AppCompatActivity {
    private Button button,button2,button3,button4,button5,button6;
    MediaPlayer mediaPlayer;
    TextView banner_ctg;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menue_button);


        DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
        int height = displayMetrics.heightPixels;
        int  width = displayMetrics.widthPixels;


        mediaPlayer= MediaPlayer.create(MenueButton.this,R.raw.slide_click);
        banner_ctg=(TextView)findViewById(R.id.banner_ctg);
        toolbar = (Toolbar) findViewById(R.id.categorytoolbar);
        int v=45;

//        button.getLayoutParams().width=(width/2)-v;
//        button.getLayoutParams().height=(width/2)-v;
//
//        button2.getLayoutParams().width=(width/2)-v;
//        button2.getLayoutParams().height=(width/2)-v;
//
//        button3.getLayoutParams().width=(width/2)-v;
//        button3.getLayoutParams().height=(width/2)-v;
//
//        button4.getLayoutParams().width=(width/2)-v;
//        button4.getLayoutParams().height=(width/2)-v;
//
//        button5.getLayoutParams().width=(width/2)-v;
//        button5.getLayoutParams().height=(width/2)-v;
//
//        button6.getLayoutParams().width=(width/2)-v;
//        button6.getLayoutParams().height=(width/2)-v;


        setSupportActionBar(toolbar);
        ActionBar ab = getSupportActionBar();
        ab.setHomeAsUpIndicator(R.drawable.mayor_ctg);
        ab.setDisplayHomeAsUpEnabled(false);

//        String spp="আসুন আমরা চট্টগ্রামকে একটি আধুনিক, ডিজিটাল, উন্নত এবং সর্বোপরি আদর্শ সিটি কর্পোরেশনে পরিনত করি।";
//        banner_ctg.setMovementMethod(new ScrollingMovementMethod());
//        appendTextAndScroll(spp);


//
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mediaPlayer.start();
//                Intent intent= new Intent(MenueButton.this,HomeActivity.class);
//                startActivity(intent);
//            }
//        });
//
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mediaPlayer.start();
//                Intent intent2= new Intent(MenueButton.this,SamprotikActivity.class);
//                startActivity(intent2);
//
//            }
//        });
//
//
//        button3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mediaPlayer.start();
//
//                Intent intent3= new Intent(MenueButton.this,ColomanActivity.class);
//                startActivity(intent3);
//            }
//        });
//
//
//        button4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mediaPlayer.start();
//                Intent intent4= new Intent(MenueButton.this,Grihito.class);
//                startActivity(intent4);
//            }
//        });
//
//
//        button5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mediaPlayer.start();
//                Intent intent5= new Intent(MenueButton.this,SebaActivity.class);
//                startActivity(intent5);
//
//            }
//        });
//
//
//        button6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mediaPlayer.start();
//
//                Intent intent6= new Intent(MenueButton.this,OvijogDetailsActivity.class);
//                startActivity(intent6);
//            }
//        });

        Handler handler = new Handler();




//        Handler handler1 = new Handler();
//        handler1.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//
//                button.setVisibility(View.VISIBLE);
//                button.startAnimation(slideOutFromLeftAnim());
//            }
//        }, 500);
//
//
//
//        Handler handler2 = new Handler();
//        handler2.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                                    /* start the activity */
//                button2.setVisibility(View.VISIBLE);
//                button2.startAnimation(slideInFromRightAnim());
//            }
//        }, 1000);
//
//
//        Handler handler3 = new Handler();
//        handler3.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                                    /* start the activity */
//
//
//                button3.setVisibility(View.VISIBLE);
//                button3.startAnimation(slideOutFromLeftAnim());
//
//            }
//        }, 1500);
//
//
//        Handler handler4 = new Handler();
//        handler4.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                                    /* start the activity */
//                button4.setVisibility(View.VISIBLE);
//                button4.startAnimation(slideInFromRightAnim());
//            }
//        }, 2000);
//
//
//
//        Handler handler5 = new Handler();
//        handler5.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                                    /* start the activity */
//                button5.setVisibility(View.VISIBLE);
//                button5.startAnimation(slideOutFromLeftAnim());
//            }
//        }, 2500);
//
//        Handler handler6 = new Handler();
//        handler6.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                                    /* start the activity */
//
//                button6.setVisibility(View.VISIBLE);
//                button6.startAnimation(slideInFromRightAnim());
//            }
//        }, 3000);








    }




    private Animation slideInFromRightAnim() {

        Animation inFromRight = new TranslateAnimation(
                Animation.RELATIVE_TO_PARENT, +1.0f,
                Animation.RELATIVE_TO_PARENT, 0.0f,
                Animation.RELATIVE_TO_PARENT, 0.0f,
                Animation.RELATIVE_TO_PARENT, 0.0f
        );
        inFromRight.setDuration(100 *
                (int) (200 *
                        (0.15
                                - 0.11)
                )
        );
        inFromRight.setInterpolator(new AccelerateInterpolator());
        return inFromRight;
    }

    private Animation slideOutFromLeftAnim() {
        Animation outToLeft = new TranslateAnimation(
                Animation.RELATIVE_TO_PARENT, -1.0f,
                Animation.RELATIVE_TO_PARENT, 0.0f,
                Animation.RELATIVE_TO_PARENT, 0.0f,
                Animation.RELATIVE_TO_PARENT, 0.0f);
        outToLeft.setDuration(100 *
                (int) (200 *
                        (0.15
                                - 0.11)
                )
        );
        outToLeft.setInterpolator(new AccelerateInterpolator());
        return outToLeft;
    }

    private void appendTextAndScroll(String text)
    {
        if(banner_ctg != null){
            banner_ctg.append(text + "\n");
            final Layout layout = banner_ctg.getLayout();
            if(layout != null){
                int scrollDelta = layout.getLineBottom(banner_ctg.getLineCount() - 1)
                        - banner_ctg.getScrollY() - banner_ctg.getHeight();
                if(scrollDelta > 0)
                    banner_ctg.scrollBy(0, scrollDelta);
            }
        }
    }



}
