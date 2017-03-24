package ch13.ex01.integra;

import lib.utils.Range;

/**
 * Created by V1 on 04-Mar-17.
 */
public class UsingStringBuilder {
    StringBuilder sb;
    public UsingStringBuilder() {
        sb = new StringBuilder("[");
        for (int i = 0; i < 25 ; i++) {
            sb.append(Range.getInt(25)); // добавляем стрку
            sb.append(", ");
        }
        sb.delete(sb.length()-2,sb.length()); // подрезаем строку
        sb.append("]");
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}
