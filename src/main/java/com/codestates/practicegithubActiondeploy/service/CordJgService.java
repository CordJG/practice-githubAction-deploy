package com.codestates.practicegithubActiondeploy.service;

import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class CordJgService {

    public String calculate(String str1, String str2) {

        String bigStr1 = str1.toUpperCase();
        String bigStr2 = str2.toUpperCase();

        String bigStr = bigStr1+bigStr2;

        return bigStr;


    }
}
