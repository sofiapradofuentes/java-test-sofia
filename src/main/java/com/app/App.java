package com.app;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/*
    Description: Java test application that will be deployed as part of an integration test. It will create a txt file with N
    number of lines every N number of seconds.
    Author: Sofia Prado
 */
public class App 
{
    static File file = new File("testFile.txt"); //Set file name
    static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.S");

    public static void main( String[] args )
    {
        String data = "Java integration test file example"; //Text data for the file
        writeFile(data, 20); //Text data for the file and number of lines to write
    }

    private static void writeFile(String data, int noOfLines) {

        FileWriter fr = null;
        BufferedWriter br = null;
        Date date;
        try{
            fr = new FileWriter(file);
            br = new BufferedWriter(fr);
            for(int i = noOfLines; i>0; i--){
                date = new Date(); //Get the current date time
                String dataWithNewLine=formatter.format(date) + " " + data + System.getProperty("line.separator"); //Text data

                br.write(dataWithNewLine); //write the line
                TimeUnit.SECONDS.sleep(1); //Wait N seconds until the next record
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally{
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
