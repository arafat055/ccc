package eidreceipie.islam.mazharul.citycorporationchittagong;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends Activity {
    TextView first,second,third,fourth;
    String firstText,secondText,thirdText,fourthText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        first =(TextView)findViewById(R.id.first);
        second=(TextView)findViewById(R.id.second);
        third=(TextView)findViewById(R.id.third);
        fourth=(TextView)findViewById(R.id.fourth);


        firstText="History of Chittagong City Corporation";
        secondText=
                "Chittagong City Corporation descended from the name of Chittagong Municipality which was founded on June 22, 1863. The initial area of newly formed Municipality was only 6 Sq. Miles. There were 5 wards viz A, B, C, D and E. Mr. J. D. Ward was first appointed administrator. Late Khan Bahadur Abdus Sattar was the first elected Chairman of Chittagong Municipality. Late Nur Ahmed was the most significant Chairman in the life of Municipality who introduced the important Education System under Municipal supervision. He governed the organization for 30 years.\n" +
                "On June 27, 1977 Chittagong Municipality was renamed as Chittagong Paura-Shava and Late Fazal Karim became the first elected Chairman of Paura-Shava.\n" +
                "On September 16, 1982 the Paura-Shava was upgraded to Municipal Corporation and Brigadier Mofizur Rahman Chowdhury was appointed as the Administrator while Late Fazal Karim became the Sub-Administrator.\n" +
                "Later on July 31, 1990 it was renamed as Chittagong City Corporation and government appointed Mr. Mahmudul Islam Chowdhury as Mayor. Later Mr. Mir Mohammed Nasiruddin ascended as Mayor and continued until the first election in 1994. Mr. A.B.M. Mohiuddin Chowdhury became the first democratically elected Mayor in the history of Chittagong City Corporation. Alhaj M. Manjur Alam was elected as Mayor in the City Corporation election held in 2010. AJM Nasir Uddin was elected in the last City Corporation election held in 28 April 2015. Currently the City Corporation area is divided into 41 wards.";
        thirdText="Description based on manuscript deed";
        fourthText="\"Committee for the sanitary improvement of the town of Chittagong\" was formed, before the registration of the municipal board, for the development of public health and communication of the city. The first seminar of the committee was organist 14th may, 1856 in the office of divisional commissioner (Preceding: 1856: 5-6). Commissioner C. Stear was the president. The other members who were present in seminar were C. Chapman, W. Bitson, J. Spanki, H. J. Bember, W. H. Henderson, G.C. Flacher, Thakur Box Tiwari, and Haro Chandra Roy. The total member in the committee was 9 along with the president.\n" +
                "In the first seminar water drainage was the main subject of discussion. The water drainage was the serious problem in those areas where country people resided. A greater stress was implemented on the development of the natural canals. Before taking this job in hand, for comparative measurement of the lands and canals the responsibility was given to a survey company named m/s Jarvis & Rassel. For faster execution of secretarial job the power was given for approving fund to the survey company in advance. It was decided that the advance can be given from one thousand taka approval of Lt. Governor.\n" +
                "The other decision which was taken in the seminar was to make city forest fee and for the development of the water drainages system 5 sub committee based on different area was formed by the member of the committee. The name of Jervis and Rassel was also enlisted in the committee. A request was forwarded to the magistrate so that the prisoners can be appointed within the sub committee and their labor can be utilized in the development works. The members of the sub committee were provided with accommodations within the city so that they can look after and distribute the development work in a proper way. Without wasting any time and to start off with work from the next Monday, resolution for the appointment of the prisoners in the sub committee was again taken. Since there will be fund crisis after the starting of the development work, so the secretary was requested to make arrangement for funds from the Lt. Governors committed amount of ten thousand taka.\n" +
                "The work report of ‘the committee for the improvement of the town of Chittagong’ dated 14th May 1856 was sent to the secretary of the Bengal Government in fort William on the same day (Preceding: 1856: 7-8)\n" +
                "In the above report it was mentioned that m/s Jervis and Rassel has agreed to complete the survey work for the people. The water drainage plan can only be properly organized after the survey work. Every thing like construction of dams on the banks of the canal, prepare the plan of the roadways, creation of pools depended on the survey. Therefore the deposition of the fund of Lt. Governor was to be transferred as first as possible. The other things which was mentioned in the report was that, those where cleaning of water drainage system is most needed and in those parts where the garbage accumulation is more-there the committee will first start its work.\n" +
                "The second seminar of the committee on 15th July 1856 under the president ship of commission of C. Strear (Preceding: 1856: 8-9). Eight members were in the seminar. The under secretary informed commissioner that an order has been sent to the accounts for the transfer of found of ten thousand taka. But it was found that the accounts have not reported to the collector. In this situation to clear the confusion the commissioner was requester to write a letter to the accounts.\n" +
                "In the meanwhile Jervis and Rassel went way from Chittagong. So there rose instability in the survey work. An able surveyor named Munu was proposed to be appointed to complete the survey work for three hundred taka, since proper development work cannot be started without measuring land’s competitive height, in the seminar.\n" +
                "The members of sub committee who where appointed to supervise the aria wise development work in the meanwhile started to describe there work verbally. The decision was made about this that the development or the presiding of the work should be submitted to the committee in written documents for the monthly basis.\n" +
                "The third seminar of the committee was held 29th August (24 August) 1856 with ten committee members and under the president ship of C. Stear. In the meeting a letter from the Secretary of the government was read out stating that 800 ‘danger kuli’ will join the development work after reaching there. The other details which was found from the proceedings of the meeting was that a surveyor named Revet has been appointed .Before the entry of the ‘danger kuli’ in the town it was decided the practical survey work should be complete as soon as possible for the development work.\n" +
                "The next seminar of the committee was held in 27th September 1856 where seven members were present. Surveyor Revet presented the report regarding the approximate height of land of the city. It was proposed in the meeting that immediately the due amount of 300Tk. should be presented to Surveyor Revet. Based on this survey report the project of water drainage system was also given to Surveyor Revet.\n" +
                "The cost of the next project of Surveyor Revet was fixed as 300Tk.\n" +
                "In the plan it was also mentioned and proposed that if construction of 3 pools was possible within 600Tk. then the work should start immediately.\n" +
                "It was not possible for Revet to supervise all ‘danger kuli’ so he proposed to leave Avery also in this job and requested to approve this proposal to the committee member Russel. Next the subcommittee gave their report of development works in their individual areas .The committee was satisfied with the work, water draining and clearing of bushes and forests, of some subcommittee in certain areas. It was proposed to ask to the Deputy Surveyor General for two maps of Chittagong.";

        first.setText(firstText);
        second.setText(secondText);
        third.setText(thirdText);
        fourth.setText(fourthText);




    }
}
