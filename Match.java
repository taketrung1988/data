public class Match {
 String homeTeam;
 String awayTeam;
double goalsHomeTeam;
double goalsAwayTeam;
double epithimito;

 Match(String ht, String at,double gHT, double gAT ){
 this.homeTeam=ht;
 this.awayTeam=at;
 this.goalsHomeTeam=gHT;
 this.goalsAwayTeam=gAT;
 this.epithimito=this.goalsHomeTeam+this.goalsAwayTeam;

 }


} 
