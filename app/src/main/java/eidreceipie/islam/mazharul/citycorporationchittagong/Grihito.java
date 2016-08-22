package eidreceipie.islam.mazharul.citycorporationchittagong;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Grihito extends Activity {

    TextView firstHead,secondHead,thirdHead,fourthHead,fifthHead,firstbody,secondbody,thirdbody,fourthbody,fifthbody;
    ImageView firstimage,secondimage,thirdimage,fourthimage,fifthimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grihito);

        firstHead=(TextView)findViewById(R.id.firsthead);
        secondHead=(TextView)findViewById(R.id.secondhead);
        thirdHead=(TextView)findViewById(R.id.thirdhead);
        fourthHead=(TextView)findViewById(R.id.fourthhead);
        fifthHead=(TextView)findViewById(R.id.fifthhead);
        firstbody=(TextView)findViewById(R.id.firstbody);
        secondbody=(TextView)findViewById(R.id.secondbody);
        thirdbody=(TextView)findViewById(R.id.thirdbody);
        fourthbody=(TextView)findViewById(R.id.fourthbody);
        fifthbody=(TextView)findViewById(R.id.fifthbody);

        firstimage=(ImageView)findViewById(R.id.firstimage);
        secondimage=(ImageView)findViewById(R.id.secondimage);
        thirdimage=(ImageView)findViewById(R.id.thirdimage);
        fourthimage=(ImageView)findViewById(R.id.fourthimage);
        fifthimage=(ImageView)findViewById(R.id.fifthimage);

        firstimage.setBackgroundResource(R.drawable.elevated);
        secondimage.setBackgroundResource(R.drawable.marine);
        thirdimage.setBackgroundResource(R.drawable.satellite);

        String firsth="Elevated Expressway";
        firstHead.setText(firsth);
        String firstb="Title of The Project: Development of Elevated Expressway from Dewnhat to CEPZ of Chittagong City. Estimated Cost: TK. 256 Crore(approx.) US $ 44 million\n" +
                "Brief Description: Development of Elevated Expressway/Fly-Over from Dewanhat to CEPZ (Chittagong Export Processing Zone) of the city aimed at mitigating traffic congestion in the main arteries of the city. The cost recovery of the project would be made from toll/tax collected from the vehicles using the Fly-Over/Expressway facility developed for the same.\n" +
                "Length: 8 km. (approx.)\n" +
                "Width: 48 ft. (4 lane)\n" +
                "Cost/km: TK. 32 crore(approx.)\n";
        firstbody.setText(firstb);

        String secondh= "Marine Driveway";
        secondHead.setText(secondh);
        String secondb="Title of The Project: Development of Marine Driveway along the coastal Embankment of Chittagong City.\n" +
                "Estimated Cost: TK. 935 Crore(approx.) US $ 161 million\n" +
                "Brief Description: Development of 17 km. long Marine Driveway along the coastal Embankment of Chittagong City (having Mono-Rail Track at the country side).\n" +
                "Length: 17 km. (approx.)\n" +
                "Width: 6 lane roadway.\n" +
                "Cost/km: TK. 32 crore(approx.)\n";
        secondbody.setText(secondb);

        String thirdh= "Satellite Town Project";
        thirdHead.setText(thirdh);
        String thirdb="Title of The Project: Satellite Town Project at Kalurghat.\n" +
                "Estimated Cost: Tk. 550 Crore(approx.) US $ 95 million\n";
         thirdbody.setText(thirdb);
        String fourth="City Health Development Program";
        fourthHead.setText(fourth);
        String fourtb="Title of The Project: Implementation of \"Chittagong City Health Development Program\" with 1000 bed Hospital.\n" +
                "Estimated Cost: TK. 630 Crore(approx.) US $ 108.5 million\n" +
                "Brief Description: Implementation of \"Chittagong City Health Development Program\" with 1000 bed Modern Hospital along with necessary health academic facility.\n" +
                "Area: 20 Acre (Approx.)\n";

        fourthbody.setText(fourtb);

        String fifthh="10 MW Power Generation Projects";

        fifthHead.setText(fifthh);
        String fifthb ="Title of The Project: Implementation of 10 MW Power Generation Projects in the city.\n" +
                "Estimated Cost: TK. 580 Crore(approx.) US $ 100 million\n" +
                "Brief Description: Implementation of 10 MW Power Generation Projects at different locations of the city on BOT basis to over come the prevailing \"Load Shedding\" problem in the city.\n" +
                "10 units Power Plant.\n";

        fifthbody.setText(fifthb);








    }
}
