package ch19.ex10.codea.vm;

import lib.utils.IGenerator;
import lib.utils.TextFile;

import java.util.Iterator;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 19-Apr-17.
 */
public class FileInputGenerator implements IGenerator<Input> {
    private Iterator<String> it;

    public FileInputGenerator(String fileName) {
        it = new TextFile(fileName, ";").iterator(); // список ArrayList из String
    }

    @Override
    public Input next() {
        if (!it.hasNext()) {
            return null;
        }
        return Enum.valueOf(Input.class, it.next().trim()); // trim() отрезает пробелы и \n
    }
}
