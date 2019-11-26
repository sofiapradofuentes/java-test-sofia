package com.maxar.test;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

@RestController
public class FileController {
    static File file = new File("testFile.txt"); //Set file name
    static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.S");

    @RequestMapping("/")
    public String index() {
        String data = "Java integration test file example"; //Text data for the file
        return writeFile(data, 20); //Text data for the file and number of lines to write
    }
    private String writeFile(String data, int noOfLines) {

        FileWriter fr = null;
        BufferedWriter br = null;
        Date date;
        String result = null;
        try{
            fr = new FileWriter(file);
            br = new BufferedWriter(fr);
            for(int i = noOfLines; i>0; i--){
                date = new Date(); //Get the current date time
                String dataWithNewLine=formatter.format(date) + " " + data + System.getProperty("line.separator"); //Text data

                br.write(dataWithNewLine); //write the line
                TimeUnit.SECONDS.sleep(1); //Wait N seconds until the next record
            }
            result = "The file " + file.getName() + " was created successfully!";
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
        return result;
    }
}
