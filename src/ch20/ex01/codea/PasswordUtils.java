package ch20.ex01.codea;

import java.util.List;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 20-Apr-17.
 */
public class PasswordUtils {
    @UseCase(id = 47, description = "Passwords must contain at least one numeric")  // именно перед методом
    public boolean validatePassword(String password) {
        return (password.matches("\\w*\\d\\w*"));
    }
    @UseCase(id = 48)
    public String encryptPassword(String password) {
        return new StringBuilder(password).reverse().toString(); // ну типа зашифровать, просто переворачивает
    }

    @UseCase(id = 49, description = "New passwords can't equal previously use ones")
    public boolean checkForNewPassword(List<String> prevPasswords, String password) {
        return !prevPasswords.contains(password);
    }

}
