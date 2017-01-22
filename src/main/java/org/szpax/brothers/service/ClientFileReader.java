package org.szpax.brothers.service;


/**
 * Created by Marcin on 21.01.2017.
 */

import org.szpax.brothers.model.Client;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ClientFileReader {
    public static void mian (String[] args) throws FileNotFoundException{
        String filePath = "C:\\Mateusz\\gitRepos\\GyymBackend\\src\\main\\resources\\clients.csv";

        Scanner scanner = new Scanner(new File(filePath));

        while(scanner.hasNext()) {
            String clientData = scanner.nextLine();
            System.out.println(clientData);
            String[] tokens = clientData.split(";");
            for(String s : tokens){
                System.out.println("====>" + s);
            }
        }
    }
}

