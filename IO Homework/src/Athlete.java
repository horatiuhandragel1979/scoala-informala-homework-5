import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Athlete {
    private int athleteNumber;
    private String athleteName;
    private String countryCode;
    private String skiTimeResult;
    private String firstShootingRange;
    private String secondShootingRange;
    private String thirdShootingRange;
    private String finalTimeResult;

    Athlete(int athleteNumber, String athleteName, String countryCode, String skiTimeResult, String firstShootingRange, String secondShootingRange, String thirdShootingRange) {
        this.athleteNumber = athleteNumber;
        this.athleteName = athleteName;
        this.countryCode = countryCode;
        this.skiTimeResult = skiTimeResult;
        this.firstShootingRange = firstShootingRange;
        this.secondShootingRange = secondShootingRange;
        this.thirdShootingRange = thirdShootingRange;
        this.finalTimeResult = addPenalties(skiTimeResult, calculatePenalty());
    }

    private String addPenalties(String time, int penalty) {
        SimpleDateFormat df = new SimpleDateFormat("mm:ss");
        try {
            Date date = df.parse(time);
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            cal.add(Calendar.SECOND, penalty);
            return df.format(cal.getTime());

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "0";
    }

    /**
     * this method add 10 seconds for every missed shoot
     * @return missedShots *10
     */
    private int calculatePenalty() {
        List<String> shootingResults = new ArrayList<>();
        int missedShots = 0;

        shootingResults.add(firstShootingRange);
        shootingResults.add(secondShootingRange);
        shootingResults.add(thirdShootingRange);

        for (String result : shootingResults) {
            for (int i = 0; i < result.length(); i++) {
                if (result.charAt(i) == 'o') {
                    missedShots++;
                }
            }
        }
        return missedShots *10;
    }

    @Override
    public String toString() {
        if (finalTimeResult != null)
            return athleteName + " " + finalTimeResult + " (" +
                    skiTimeResult + " + " + calculatePenalty() + ")";
        else
            return athleteNumber + " " + athleteName + " " + countryCode + " " + skiTimeResult + "\n" +
                    "Shooting Ranges: " + firstShootingRange + "," + secondShootingRange + "," + thirdShootingRange;
    }


    String getFinalTimeResult() {
        return finalTimeResult;
    }

}
