package eidreceipie.islam.mazharul.citycorporationchittagong;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ColomanActivity extends Activity {
    TextView text1,text2,text3;

    String textx1,textx2,textx3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coloman);

        text1=(TextView)findViewById(R.id.text1);
        text2=(TextView)findViewById(R.id.text2);
        text3=(TextView)findViewById(R.id.text3);


        textx1="Urban Primary Health Care";

        textx2="Health care is one of the multifarious programs undertaken for building a Healthy nation and ensuring medical services to the city dwellers. In order to taken these service-oriented programs to the doorsteps of the City dwellers, Chittagong City Corporation has been implementing programs to ensure maternal and child health care.\n" +
                "noneUnder the able leadership of present Mayor, Chittagong City Corporation already achieved tremendous success in the urban health service delivery activity. In order to provide Mother and child health care (MCH) service now there are five";

        textx3="prestigious maternity hospitals established by Chittagong City Corporation very recently. Among all of them 100 bedded Memon Maternity Hospital meanwhile became more familiar and earned good reputations for providing its wonderful services with nominal fees (minimum cost). Besides giving outdoor services to the patients, Chittagong City Corporation runs 22 no. Charitable dispensaries and primary heath care centers where qualified Doctors render their services to the poor people with medicine (free of cost).\n" +
                "Chittagong City also under the coverage of Healthy City project launched by WHO since 1993. Two ward areas primarily selected for the successful implementation of this project.";

        text1.setText(textx1);
        text2.setText(textx2);
        text3.setText(textx3);

    }
}
