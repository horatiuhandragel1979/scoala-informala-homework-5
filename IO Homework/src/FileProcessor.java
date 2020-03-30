import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessor {
    private Standings athletesStandings = new Standings();

    public void parseAthletes() {
        readAthletesFromFile();
        athletesStandings.sort();
        athletesStandings.printStandings();
    }

    /**
     * method that reads data from the file
     */
    private void readAthletesFromFile() {

        String csvFile = "C:\\Users\\bery\\IdeaProjects\\scoala-informala-homework-5\\IO Homework\\src\\Resources\\athlete.csv";
        String line;
        int numberOfColumns = 7;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null && !line.isEmpty()) {
                String[] tokens = line.split(",");
                if (tokens.length == numberOfColumns) {
                    Athlete a = new Athlete(Integer.parseInt(tokens[0]), tokens[1], tokens[2], tokens[3], tokens[4], tokens[5], tokens[6]);

                    athletesStandings.add(a);
                } else {
                    System.out.println("Line '" + line + "' is not formatted correctly");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
