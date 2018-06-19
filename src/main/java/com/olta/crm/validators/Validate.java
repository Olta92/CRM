/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olta.crm.validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {

    private Pattern validator;

    public boolean validatePassword(String password) {
        validator = Pattern.compile("^(.{0,7}|[^0-9]*|[^A-Z]*|[^a-z]*|[a-zA-Z0-9]*)$");
        Matcher matcher = validator.matcher(password);
        return matcher.find();
    }

    public boolean validateEmail(String email) {
        validator = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = validator.matcher(email);
        return matcher.find();
    }

    public boolean validateId(String id) {
        validator = Pattern.compile("[A-Z][0-9]{8}[A-Z]");
        Matcher matcher = validator.matcher(id);
        return matcher.find();
    }

    public boolean validatePhone(String id) {
        validator = Pattern.compile("((((\\+|0{2})355)|0)6(7|8|9)(\\d{7}))");
        Matcher matcher = validator.matcher(id);
        return matcher.find();
    }

}
