import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.StringTokenizer;


public class Exercitiul3 {

    public static void main(String[] args) {
        Path p = Paths.get("candidati.txt");
        try {
            List<String> candidatijob = Files.readAllLines(p);
            for(String linie:candidatijob){
                StringTokenizer st = new StringTokenizer(linie, "-");
                while(st.hasMoreTokens()){
                    String currentToken= st.nextToken();
                    System.out.println(currentToken);
                }
                System.out.println("----Urmatorul candidat---");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Path j = Paths.get("joburi.txt");
        try {
            List<String> joburipentrucandidati = Files.readAllLines(j);
            for(String linie:joburipentrucandidati){
                StringTokenizer st = new StringTokenizer(linie,"-");
                while(st.hasMoreTokens()){
                    String currentToken = st.nextToken();
                    System.out.println(currentToken);
                }
                System.out.println("---------Urmatorul job-------");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
