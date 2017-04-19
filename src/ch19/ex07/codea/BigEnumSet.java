package ch19.ex07.codea;

import java.util.EnumSet;
import java.util.Iterator;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 19-Apr-17.
 */
public class BigEnumSet {
    private enum BigEnum {
        A0, A1, A2, A3, A4, A5, A6, A7, A8, A9,
        A10, A11, A12, A13, A14, A15, A16, A17, A18, A19,
        A20, A21, A22, A23, A24, A25, A26, A27, A28, A29,
        A30, A31, A32, A33, A34, A35, A36, A37, A38, A39,
        A40, A41, A42, A43, A44, A45, A46, A47, A48, A49,
        A50, A51, A52, A53, A54, A55, A56, A57, A58, A59,
        A60, A61, A62, A63, A64, A65, A66, A67, A68, A69,
        A70, A71, A72, A73, A74, A75, A76, A77, A78, A79;

        @Override
        public String toString() {
            return name();
        }
    }

    private static String toString(EnumSet<BigEnum> b) {
        StringBuilder sb = new StringBuilder();
        sb.append("[\n");
        int index = 1;

        for (Iterator<BigEnum> it = b.iterator(); it.hasNext(); ) {
            BigEnum bigEnum = it.next();
            sb.append(String.format("%3s, ",bigEnum.name()));
            if (index++ % 10 == 0) {
                sb.append("\n");
            }
        }
        if (sb.charAt(sb.length() - 1) == '\n') {
            sb.delete(sb.length() - 3, sb.length() );
        } else {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append("\n]");
        return sb.toString();
    }

    public static void check() {
        EnumSet<BigEnum> bigEnum = EnumSet.allOf(BigEnum.class);
        System.out.println(bigEnum);
        System.out.println(toString(bigEnum));
    }

}
