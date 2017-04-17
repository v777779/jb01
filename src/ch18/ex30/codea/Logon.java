package ch18.ex30.codea;

import java.io.Serializable;
import java.util.Date;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 16-Apr-17.
 */
public class Logon implements Serializable {
    private Date date = new Date();
    private String userName;
    private transient String password;

    public Logon() {
    }

    public Logon(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public String toString() {
        return "login info:\n" +
                "userName:" + userName + "\n" +
                "date    :" + date + "\n" +
                "password:" + password ;
    }
}
