package javaapplication1.etb;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import javax.print.DocFlavor.INPUT_STREAM;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class fReadstring {
    public static String readFileAsString(String filePath)throws java.io.IOException{
        StringBuilder fileData = new StringBuilder();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));

        char[] buf = new char[1024];
        int numRead=0;
        while((numRead=reader.read(buf)) != -1){
            String readData = String.valueOf(buf, 0, numRead);
            fileData.append(readData);
            buf = new char[1024];
        }
        reader.close();
        return fileData.toString();
    }
    public static void writeFileAsString(String info,String path)throws java.io.IOException{
                File f=new File("src//1.txt");
    String Ss=f.getAbsolutePath().substring(0,f.getAbsolutePath().length()-9);
    System.out.println(Ss);
          RandomAccessFile input = new RandomAccessFile(path, "rw" );
    byte[] b=info.getBytes();
    input.write(b);
    }
}
