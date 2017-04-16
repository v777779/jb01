package ch18.ex27.codeb.check;  // проверка

import lib.files.Catalog;

import java.io.*;
import java.util.zip.Adler32;
import java.util.zip.CheckedOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 15-Apr-17.
 */
public class ZipCompress2 {


//ВНИМАНИЕ точно работает с Zip архивами
    private static void byteZip(String fileIn, String fileOut) {
        if (fileIn == null || fileOut == null ||
                fileIn.length() == 1 || fileOut.length() == 0 || !fileOut.endsWith(".zip")) {
            return;
        }

        fileOut = fileOut.replace(".zip","_byte.zip");
        new File(fileOut).delete();
        try {
            FileOutputStream fw = new FileOutputStream(fileOut);
            CheckedOutputStream cSumW = new CheckedOutputStream(fw, new Adler32()); // поток контрольной суммы
            ZipOutputStream zipW = new ZipOutputStream(cSumW);
            BufferedOutputStream bw = new BufferedOutputStream(zipW);  // байтовая запись  ВНИМАНИЕ ВАЛИТ UTF8

            File[] files;
            File filePath = new File(fileIn);
            if (filePath.isDirectory()) {
                files = Catalog.walk(filePath).getListFiles().toArray(new File[0]);
            } else {
                files = new File[]{filePath};
            }

            zipW.setComment("Zip File Compress Test for " + fileIn + " to " + fileOut);

            for (File file : files) {
                System.out.println("Compress file:" + file.getName());
                BufferedInputStream br = new BufferedInputStream(new FileInputStream(file));
                zipW.putNextEntry(new ZipEntry(file.getName()));  // разместили entry для файла
                int c;
                while ((c = br.read()) != -1) {  //
                    bw.write(c); // запись BufferedOutputStream
                }
                br.close();
                bw.flush(); // дозапись файла полная очистка очереди вывода
            }
            bw.close(); // закрыли файл ZIP
// csum действительна только после закрытия zip файла
            System.out.println("Checksum:" + cSumW.getChecksum().getValue());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


//ВНИМАНИЕ нормально работает с UTF8
    private static void charZip(String fileIn, String fileOut) {
        if (fileIn == null || fileOut == null ||
                fileIn.length() == 1 || fileOut.length() == 0 || !fileOut.endsWith(".zip")) {
            return;
        }

        fileOut = fileOut.replace(".zip","_ch.zip");
        new File(fileOut).delete();

        try {
            FileOutputStream fw = new FileOutputStream(fileOut);
            CheckedOutputStream cSumW = new CheckedOutputStream(fw, new Adler32()); // поток контрольной суммы
            ZipOutputStream zipW = new ZipOutputStream(cSumW);
//ВНИМАНИЕ нормально работает с UTF8
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(zipW)); // символьная запись

            File[] files;
            File filePath = new File(fileIn);
            if (filePath.isDirectory()) {
                files = Catalog.walk(filePath).getListFiles().toArray(new File[0]);
            } else {
                files = new File[]{filePath};
            }

            zipW.setComment("Zip File Compress Test for " + fileIn + " to " + fileOut);

            for (File file : files) {
                System.out.println("Compress file:" + file.getName());
                BufferedReader br = new BufferedReader(new FileReader(file));
                zipW.putNextEntry(new ZipEntry(file.getName()));  // разместили entry для файла
                int c;
                while ((c = br.read()) != -1) {  //
                    bw.write(c); // запись BufferedOutputStream
                }
                br.close();
                bw.flush(); // дозапись файла полная очистка очереди вывода
            }
            bw.close(); // закрыли файл ZIP
// csum действительна только после закрытия zip файла
            System.out.println("Checksum:" + cSumW.getChecksum().getValue());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    //ВНИМАНИЕ ВАЛИТ UTF8
    private static void ansiZip(String fileIn, String fileOut) {
        if (fileIn == null || fileOut == null ||
                fileIn.length() == 1 || fileOut.length() == 0 || !fileOut.endsWith(".zip")) {
            return;
        }

        fileOut = fileOut.replace(".zip","_byte.zip");
        new File(fileOut).delete();
        try {
            FileOutputStream fw = new FileOutputStream(fileOut);
            CheckedOutputStream cSumW = new CheckedOutputStream(fw, new Adler32()); // поток контрольной суммы
            ZipOutputStream zipW = new ZipOutputStream(cSumW);
            BufferedOutputStream bw = new BufferedOutputStream(zipW);  // байтовая запись  ВНИМАНИЕ ВАЛИТ UTF8

            File[] files;
            File filePath = new File(fileIn);
            if (filePath.isDirectory()) {
                files = Catalog.walk(filePath).getListFiles().toArray(new File[0]);
            } else {
                files = new File[]{filePath};
            }

            zipW.setComment("Zip File Compress Test for " + fileIn + " to " + fileOut);

            for (File file : files) {
                System.out.println("Compress file:" + file.getName());
                BufferedReader br = new BufferedReader(new FileReader(file));
                zipW.putNextEntry(new ZipEntry(file.getName()));  // разместили entry для файла
                int c;
                while ((c = br.read()) != -1) {  //
                    bw.write(c); // запись BufferedOutputStream
                }
                br.close();
                bw.flush(); // дозапись файла полная очистка очереди вывода
            }
            bw.close(); // закрыли файл ZIP
// csum действительна только после закрытия zip файла
            System.out.println("Checksum:" + cSumW.getChecksum().getValue());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //ВНИМАНИЕ нормально работает с UTF8
    private static void stringZip(String fileIn, String fileOut) {
        if (fileIn == null || fileOut == null ||
                fileIn.length() == 1 || fileOut.length() == 0 || !fileOut.endsWith(".zip")) {
            return;
        }
        fileOut = fileOut.replace(".zip","_str.zip");

        new File(fileOut).delete();

        try {
            FileOutputStream fw = new FileOutputStream(fileOut);
            CheckedOutputStream cSumW = new CheckedOutputStream(fw, new Adler32()); // поток контрольной суммы
            ZipOutputStream zipW = new ZipOutputStream(cSumW);
//ВНИМАНИЕ нормально работает с UTF8
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(zipW)); // символьная запись

            File[] files;
            File filePath = new File(fileIn);
            if (filePath.isDirectory()) {
                files = Catalog.walk(filePath).getListFiles().toArray(new File[0]);
            } else {
                files = new File[]{filePath};
            }

            zipW.setComment("Zip File Compress Test for " + fileIn + " to " + fileOut);

            for (File file : files) {
                System.out.println("Compress file:" + file.getName());
                BufferedReader br = new BufferedReader(new FileReader(file));
                zipW.putNextEntry(new ZipEntry(file.getName()));  // разместили entry для файла
                String s;
                while ((s = br.readLine()) != null) {  //
                    bw.write(s+"\r\n"); // запись BufferedOutputStream
                }
                br.close();
                bw.flush(); // дозапись файла полная очистка очереди вывода
            }
            bw.close(); // закрыли файл ZIP
// csum действительна только после закрытия zip файла
            System.out.println("Checksum:" + cSumW.getChecksum().getValue());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void check(String[] args) {
        String fileIn = "./src/ch18/ex27/codeb/ZipCompress2.java";
        String fileOut = "./src/ch18/ex27/codeb/ZipCompress2.zip";
        String pathIn = "./src/ch18/ex27/codeb/check";
        String pathOut = "./src/ch18/ex27/codeb/check.zip";

        new File(fileOut).delete();
        new File(pathOut).delete();


        if (args.length < 2 || !args[args.length - 1].endsWith(".zip")) {
            args = new String[]{fileIn, fileOut, pathIn, pathOut};
            System.out.println("Usage: fileIn  fileOut.zip");
        }

        fileIn = args[0];
        fileOut = args[1];
//        byteZip(fileIn, fileOut); // запись одного файла
//        charZip(fileIn, fileOut); // запись одного файла
//        stringZip(fileIn, fileOut); // запись одного файла

        if (args.length < 4) {
            return;
        }
        pathIn = args[2];
        pathOut = args[3];

        byteZip(pathIn,pathOut);

    }

}
