package dockerValidation;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;

public class startDocker {

    @Test
    public void startFile() throws IOException, InterruptedException {

        boolean flag = false;
        int count = 0;

        // to run a .bat file
        Runtime runtime = Runtime.getRuntime();
        runtime.exec("cmd /c start dockerup.bat");
        String logFile = "output.txt";


        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.SECOND, 45);
        long stopNow = cal.getTimeInMillis();

        while (System.currentTimeMillis() < stopNow) {
            if (flag){
                break;
            }
            BufferedReader reader = new BufferedReader(new FileReader(logFile));
            String currentLine = reader.readLine();
            while (currentLine != null) {
                if (currentLine.contains("Node has been added")) {
                    count++;
                    System.out.println(count);
                    if (count == 4) {
                        System.out.println("Found my text");
                        flag = true;
                        break;
                    }
                }
                currentLine = reader.readLine();
            }
            reader.close();
        }
        Assert.assertTrue(flag);
        Thread.sleep(3000);

    }
}
