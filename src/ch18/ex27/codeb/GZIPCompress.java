package ch18.ex27.codeb;  // проверка

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 15-Apr-17.
 */
public class GZIPCompress {


    private static void byteGzip(String fileIn) {
        try {
            String fileOut = fileIn.replace(".zip", "_byte.zip.gz");
            String fileOut2 = fileIn.replace(".zip", "_byte2.zip.gz");
            fileOut = fileOut.replace("/check", "");
            fileOut2 = fileOut2.replace("/check", "");

            new File(fileOut).delete();
            new File(fileOut2).delete();

//ВНИМАНИЕ. По символам  читать и писать  без кодировки НО строго через OutputStreamWriter
            System.out.println("\nChar Method:");
            System.out.println("Read text Write compressed file:" + fileIn);
            BufferedInputStream br = new BufferedInputStream(new FileInputStream(fileIn));
            BufferedOutputStream bw = new BufferedOutputStream(
                    new GZIPOutputStream(new FileOutputStream(fileOut)));
//            BufferedOutputStream bw = new BufferedOutputStream(new GZIPOutputStream(new FileOutputStream(fileOut)));

            int c;
            while ((c = br.read()) != -1) {
                bw.write(c);
            }
            br.close();
            bw.close();

            System.out.println("Read and Write compressed file:" + fileOut);
            br = new BufferedInputStream(new GZIPInputStream(new FileInputStream(fileOut)));
            bw = new BufferedOutputStream(new GZIPOutputStream(new FileOutputStream(fileOut2)));

            while ((c = br.read()) != -1) {
                bw.write(c);
            }
            bw.close();
            System.out.println("Read compressed file" + fileOut2);
            System.out.println("--------------------------------");
            br.close();
            br = new BufferedInputStream(new GZIPInputStream(new FileInputStream(fileOut2)));

            int count = 0;
            while ((c = br.read()) != -1) {
                System.out.print((char) c);
                if (count++ > 96) {
                    break;
                }
            }
            System.out.println();
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    private static void charGzip(String fileIn) {
        try {

            String fileOut = fileIn.replace(".java", "_ch.java.gz");
            String fileOut2 = fileIn.replace(".java", "_ch2.java.gz");

            new File(fileOut).delete();
            new File(fileOut2).delete();

//ВНИМАНИЕ. По символам  читать и писать  без кодировки НО строго через OutputStreamWriter
            System.out.println("\nChar Method:");
            System.out.println("Read text Write compressed file:" + fileIn);
            BufferedReader br = new BufferedReader(new FileReader(fileIn));
            BufferedWriter bw = new BufferedWriter(         // писать можно без кодировки да
                    new OutputStreamWriter(new GZIPOutputStream(new FileOutputStream(fileOut)), "utf-8"));
//            BufferedOutputStream bw = new BufferedOutputStream(new GZIPOutputStream(new FileOutputStream(fileOut)));

            int c;
            while ((c = br.read()) != -1) {
                bw.write(c);
            }
            br.close();
            bw.close();

            System.out.println("Read and Write compressed file:" + fileOut);
            br = new BufferedReader(new InputStreamReader(  // читать GZIP без кодировки да
                    new GZIPInputStream(new FileInputStream(fileOut)), "utf-8"));
            bw = new BufferedWriter(                        // запись без кодировки
                    new OutputStreamWriter(new GZIPOutputStream(new FileOutputStream(fileOut2)), "utf-8"));

            while ((c = br.read()) != -1) {
                bw.write(c);
            }
            bw.close();
            System.out.println("Read compressed file" + fileOut2);
            System.out.println("--------------------------------");
            br.close();
            br = new BufferedReader(  // читать можно без кодировки да
                    new InputStreamReader(new GZIPInputStream(new FileInputStream(fileOut2)), "utf-8"));

            int count = 0;
            while ((c = br.read()) != -1) {
                System.out.print((char) c);
                if (count++ > 96) {
                    break;
                }
            }
            System.out.println();
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void stringGzip(String fileIn) {
        try {

            String fileOut = fileIn.replace(".java", "_str.java.gz");
            String fileOut2 = fileIn.replace(".java", "_str2.java.gz");

            new File(fileOut).delete();
            new File(fileOut2).delete();

//ВНИМАНИЕ. По строкам можно читать и писать без указания кодировки
            System.out.println("\nString Method:");
            System.out.println("Read text Write compressed file:" + fileIn);
            BufferedReader br = new BufferedReader(new FileReader(fileIn));
            BufferedWriter bw = new BufferedWriter(         // писать можно без кодировки
                    new OutputStreamWriter(new GZIPOutputStream(new FileOutputStream(fileOut))));

            String s;
            while ((s = br.readLine()) != null) {
                bw.write(s + "\r\n");
            }
            br.close();
            bw.close();

            System.out.println("Read and Write compressed file:" + fileOut);
            br = new BufferedReader(new InputStreamReader(  // читать GZIP без кодировки ???
                    new GZIPInputStream(new FileInputStream(fileOut))));
            bw = new BufferedWriter(                        // запись без кодировки
                    new OutputStreamWriter(new GZIPOutputStream(new FileOutputStream(fileOut2))));

            while ((s = br.readLine()) != null) {
                bw.write(s + "\r\n");
            }
            bw.close();
            System.out.println("Read compressed file" + fileOut2);
            System.out.println("--------------------------------");
            br.close();
            br = new BufferedReader(  // читать можно без кодировки
                    new InputStreamReader(new GZIPInputStream(new FileInputStream(fileOut2))));
            int count = 0;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
                if (count++ > 2) {
                    break;
                }
            }
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void check(String[] args) {
        String fileIn = "./src/ch18/ex27/codeb/GZIPCompress.java";
        String fileOut = "./src/ch18/ex27/codeb/GZIPCompress.java.gz";
        String fileByte = "./src/ch18/ex27/codeb/check/ZipCompress.zip";
        new File(fileOut).delete();

        if (args.length != 2 || !args[1].endsWith(".gz")) {
            System.out.println("Usage: fileIn  fileOut.gz");
            if (!fileOut.endsWith("gz")) {
                return;
            }
        }
        charGzip(fileIn);
        stringGzip(fileIn);
        byteGzip(fileByte);

    }


    // создание GZip архива
    public static void replaceGZIP(String fileRead) {
        String fileWrite = fileRead + ".gz";
        new File(fileWrite).delete();
        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(new FileInputStream(fileRead), "utf-8"));
            OutputStreamWriter fw = new OutputStreamWriter(
                    new GZIPOutputStream(new FileOutputStream(fileWrite)), "utf-8");
            BufferedWriter bw = new BufferedWriter(
                    new OutputStreamWriter(new GZIPOutputStream(new FileOutputStream(fileWrite)), "utf-8"));

            int c;
            while ((c = br.read()) != -1) {  //символ не может быть -1
                bw.write(c);
            }

            br.close();
            bw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
