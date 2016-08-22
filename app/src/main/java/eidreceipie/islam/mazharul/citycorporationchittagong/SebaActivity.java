package eidreceipie.islam.mazharul.citycorporationchittagong;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SebaActivity extends Activity {

    TextView edutext,edubody,healthtext,healthbody1,healthbody2;
    ImageView eduimage,healthimage1,healthimage2,logo_cc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seba);

        edutext=(TextView)findViewById(R.id.eduText);
        edubody=(TextView)findViewById(R.id.edubody);
        healthtext=(TextView)findViewById(R.id.healthtext);
        healthbody1=(TextView)findViewById(R.id.healthbody1);
        healthbody2=(TextView)findViewById(R.id.healthbody2);

        eduimage=(ImageView)findViewById(R.id.eduimage);
        eduimage.setBackgroundResource(R.drawable.education);
        healthimage1=(ImageView)findViewById(R.id.healthimage1);
        healthimage1.setBackgroundResource(R.drawable.health);
        healthimage2=(ImageView)findViewById(R.id.healthimage2);
        healthimage2.setBackgroundResource(R.drawable.health1);
        logo_cc=(ImageView)findViewById(R.id.logo_cc);

        String edut="Education";
        edutext.setText(edut);
        String edub="University Managed by City Corporation: With a view to the demand of time and ensure people’s participation to realize the goal of right to education Chittagong City Corporation has taken- the basic and exceptional program of expansion and qualitative improvement of the education. As early as in the thirties of the last century Chairman of Chittagong Municipality Mr. Noor Ahmed introduced for the first time in the sub – continent free primary education with municipal funding. Although the continuity of the educational expansion has been interrupted at different times since then, the worth successor of late Noor Ahmed Chairman, the incumbent City Mayor has stressed on the expansion of education and its qualitative improvement and taken short, medium and long term plans.\n" +
                "Premier University\n" +
                "1/A, O.R.Nizam Road, Chittagong. Phone:+880 (0)31 656917, +880 (0)1199 738363, +880 (0)1711 374969, +880 (0)1711 199839 E-mail:puc@spctnet.com\n" +
                "Services & Facilities\n" +
                "High quality faculty\n" +
                "Linkage with Industry\n" +
                "Global Vision\n" +
                "Excellence in all areas\n" +
                "Visiting faculty from business houses\n" +
                "Computer Lab with Internet facilities\n" +
                "Day-night Library facilities\n" +
                "Fully air-conditioned campus\n" +
                "Modern Teaching aid and methods\n" +
                "Credit Transfer\n" +
                "New Brunswick ( UNB )\n" +
                "Saint John, Canada & also with\n" +
                "SUI & AWU affiliates";
        edubody.setText(edub);
        String healthh="Health Care\n";
        healthtext.setText(healthh);

        String healthb1="Health care is one of the multifarious programs undertaken for building a Healthy nation and ensuring medical services to the city dwellers. In order to taken these service-oriented programs to the doorsteps of the City dwellers, Chittagong City Corporation has been implementing programs to ensure maternal and child health care.";
        healthbody1.setText(healthb1);

        String healthb2="In order to provide Mother and child health care (MCH) service now there are five prestigious maternity hospitals established by Chittagong City Corporation very recently. Among all of them 100 bedded Memon Maternity Hospital meanwhile became more familiar and earned good reputations for providing its wonderful services with nominal fees (minimum cost). Besides giving outdoor services to the patients, Chittagong City Corporation runs 22 no. Charitable dispensaries and primary heath care centers where qualified Doctors render their services to the poor people with medicine (free of cost).\n" +
                "Chittagong City also under the coverage of Healthy";
        healthbody2.setText(healthb2);



    }
}
