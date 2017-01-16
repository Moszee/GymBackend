package org.szpax.brothers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CoachesFileReader {

    public static void main(String[] args) throws FileNotFoundException {
        String filePath = "C:\\Mateusz\\gitRepos\\GymBackend\\src\\main\\resources\\coaches.csv";

        Scanner scanner = new Scanner(new File(filePath));

        while(scanner.hasNext()) {
            String coachData = scanner.nextLine();
            System.out.println(coachData);
            String[] tokens = coachData.split(";");
            for(String s : tokens) {
                System.out.println("====> " + s);
            }
            // :DD dla kazdej linijki stworz coacha!
        }
    }

}
