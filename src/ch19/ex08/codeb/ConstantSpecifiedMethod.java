package ch19.ex08.codeb;

import java.text.DateFormat;
import java.util.Date;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 19-Apr-17.
 */
public enum ConstantSpecifiedMethod {  // допускает абстрактные методы
    DATE_TIME{
        String getInfo() {
            return "Current Date Time: "+DateFormat.getInstance().format(new Date());
        }
    },
    CLASSPATH {
        String getInfo() {
            return "$CLASSPATH       : "+System.getenv("CLASSPATH");
        }
    },
    VERSION {
        String getInfo() {
            return "Java version     : "+System.getProperty("java.version");
        }
    };
    abstract String getInfo();  // каждый экземпляр реализует абстрактный метод

    public static void check() {  // это статический метод общий для всех
        for (ConstantSpecifiedMethod constMethod : values()) {
            System.out.println(constMethod.getInfo());
        }
    }



}
