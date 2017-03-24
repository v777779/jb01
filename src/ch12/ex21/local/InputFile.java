package ch12.ex21.local;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by V1 on 03-Mar-17.
 */
public class InputFile {
    private BufferedReader inFile;
    private String fName;

    public InputFile(String fName) throws Exception {
        this.fName = fName;
        try {
            inFile = new BufferedReader(new FileReader(fName)); // открыли файл

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found:" + fName);
            throw e;                                // выбрасываемся на верхний уровень из программы
        } catch (Exception e) {                     // все остальные исключения выполняем закрытие файла
            try {
                inFile.close();                     // пытаемся закрыть файл
            } catch (IOException e2) {              // e2 потому что надо сохранить e
                System.out.println("File Close Error.Constructor");
            }
            throw e;                                // после закрытия файла выбрасываемся
        } finally {
            System.out.println("Finally: No Close File Here");
        }
    }

    public String getName() {
        return this.fName;
    }
    public String getLine() {
        String s;

        try {
            s = inFile.readLine();
        } catch (IOException e) {
            throw new RuntimeException("Read File Error.readline()");
        }
        return s;
    }
    public void dispose() {

        try {
            inFile.close();
            System.out.println("File Closed");
        } catch (IOException e) {
            throw new RuntimeException("File Close Error.dispose()");
        }
    }

}
