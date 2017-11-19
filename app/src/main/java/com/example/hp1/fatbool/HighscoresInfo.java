package com.example.hp1.fatbool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class HighscoresInfo extends AppCompatActivity {
    TextView tvInfo;
    ImageView teamImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highscores_info);
        tvInfo = (TextView) findViewById(R.id.tvHigh);
        teamImage = (ImageView) findViewById(R.id.img);

        Intent i = getIntent();
        int team = i.getIntExtra("highscores",0);
        updateInfo(team);
    }


    private void updateInfo(int highscores) {
        if(highscores == 0){
            tvInfo.setText("Founded in 1899 by a group of Swiss, English and Catalan footballers led by Joan Gamper, the club has become a symbol of Catalan culture and Catalanism, hence the motto \"Més que un club\" (English: \"More than a club\"). Unlike many other football clubs, the supporters own and operate Barcelona. It is the second most valuable sports team in the world, worth $3.56 billion, and the world's second richest football club in terms of revenue, with an annual turnover of €560.8 million.The official Barcelona anthem is the \"Cant del Barça\", written by Jaume Picas and Josep Maria Espinàs.");
            teamImage.setImageResource(R.drawable.barca);

        }
        if(highscores==1){
            teamImage.setImageResource(R.drawable.madrid);
            tvInfo.setText("Founded in 1902 as Madrid Football Club, the team has traditionally worn a white home kit since inception. The word Real is Spanish for Royal and was bestowed to the club by King Alfonso XIII in 1920 together with the royal crown in the emblem. The team has played its home matches in the 85,454-capacity Santiago Bernabéu Stadium in downtown Madrid since 1947. Unlike most European sporting entities, Real Madrid's members (socios) have owned and operated the club throughout its history.");
        }
        if(highscores==2){
            teamImage.setImageResource(R.drawable.bayren);
            tvInfo.setText("C Bayern was founded in 1900 by 11 football players, led by Franz John. Although Bayern won its first national championship in 1932,[6] the club was not selected for the Bundesliga at its inception in 1963.[7] The club had its period of greatest success in the middle of the 1970s when, under the captaincy of Franz Beckenbauer, it won the European Cup three times in a row (1974–1976). Overall, Bayern has reached ten European Cup/UEFA Champions League finals, most recently winning their fifth title in 2013 as part of a continental treble. Bayern has also won one UEFA Cup, one European Cup Winners' Cup, one UEFA Super Cup, one FIFA Club World Cup and two Intercontinental Cups, making it one of the most successful European clubs internationally");
        }
        if(highscores==3){
            teamImage.setImageResource(R.drawable.munn);
            tvInfo.setText("Manchester United Football Club is a professional football club based in Old Trafford, Greater Manchester, England, that competes in the Premier League, the top flight of English football. Nicknamed \"the Red Devils\", the club was founded as Newton Heath LYR Football Club in 1878, changed its name to Manchester United in 1902 and moved to its current stadium, Old Trafford, in 1910.\n" +
                    " " +
                    "Manchester United have won a record 20 League Titles, a joint-record 12 FA Cups, 5 League Cups and a record 21 FA Community Shields. The club has also won three European Cups, one UEFA Cup Winners' Cup, one UEFA Super Cup, one Intercontinental Cup and one FIFA Club World Cup. In 1998–99, the club became the first in the history of English football to achieve the treble of the Premier League, the FA Cup and the UEFA Champions League.[3]");
        }
        if(highscores==4){
            teamImage.setImageResource(R.drawable.bvbb);
            tvInfo.setText("Borussia Dortmund was founded in 1909 by eighteen football players from Dortmund. Borussia Dortmund have won eight German championships, three DFB-Pokals, five DFL-Supercups, one UEFA Champions League, one UEFA Cup Winners' Cup, and one Intercontinental Cup. Their Cup Winners' Cup win in 1966 made them the first German club to win a European title.\n" +
                    " " +
                    "Since 1974, Dortmund have played their home games at Westfalenstadion, named after its home region of Westphalia. The stadium is the largest in Germany and Dortmund has the highest average attendance of any association football club in the world.[6] Borussia Dortmund's colours are black and yellow, giving the club its nickname die Schwarzgelben.[7][8] Dortmund holds a long-standing rivalry with Ruhr neighbours Schalke 04, known as the Revierderby. In terms of Deloitte's annual Football Money League, Dortmund is the second biggest sports club in Germany and the 11th biggest football team in the world.[9]");
        }
    }
}
