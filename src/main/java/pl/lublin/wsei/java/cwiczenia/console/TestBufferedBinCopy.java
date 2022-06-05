package pl.lublin.wsei.java.cwiczenia.console;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

public class TestBufferedBinCopy {

    long startTime = System.nanoTime();

    public static void main(String[] args) throws IOException {
        BufferedInputStream in = null;
        BufferedOutputStream out = null;

        try {
            in = new BufferedInputStream("sample_1920x1280.tiff");
            out = new BufferedOutputStream("img_copy.tiff");
            int c;


            while ((c = in.read()) !=-1) {
                out.write(c);
            }
        }
        catch(IOException e) {
            System.out.println("IOException: " + e.getMessage());
            e.printStackTrace();
        }
        finally {
            if (in !=null) {
                in.close();
            }
            if (out !=null){
                out.close();
            }
        }
    }
    long endTime = System.nanoTime();
    long timeElapsed = endTime - startTime;

}


