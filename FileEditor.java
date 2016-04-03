import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StreamTokenizer;
public class FileEditor {
public static void main(String[] args) throws IOException
 String Currentteam = "MIDDLESBROUGH";
 int numberOfGames = 37;
 String team1 = "";
 String team2 = "";
 String s3 = "";
 int score1 = 0;
 int score2 = 0;
 String seasonYear = "2009";
 try {
 s3 = new java.io.File(".").getCanonicalPath();
 } catch (IOException e) {
 e.printStackTrace();
 }
 s3 = s3 + "\\data\\" + seasonYear + "\\TEMPSEASON.txt";
 Reader r = new BufferedReader(new FileReader(s3));
 StreamTokenizer stok = new StreamTokenizer(r);
 stok.parseNumbers();
 stok.nextToken();
 FileWriter fstream = new FileWriter(Currentteam + ".txt");
 BufferedWriter out = new BufferedWriter(fstream);
 for (int i = 0; i < numberOfGames * 12; i++) {
 team1 = stok.sval;
 stok.nextToken();
 team2 = stok.sval;
 stok.nextToken();
 score1 = (int) stok.nval;
 stok.nextToken();
 score2 = (int) stok.nval;
 stok.nextToken();
 if (Currentteam.equals(team1) ||
Currentteam.equals(team2)) {
 out.write(team1 + " " + team2 + " " + score1 +
" " + score2
 + " " + " \n");
 }
 }
out.close();
}
} 
