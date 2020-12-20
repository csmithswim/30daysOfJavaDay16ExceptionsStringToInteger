package com.csmithswim;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try {
            int intS = Integer.parseInt(S);
            System.out.println(intS);
        } catch(Exception e){
            System.out.println("Bad String");
        }
    }
}