package com.bank.util;

import java.util.Random;

public class AccountUtil {

    private static final Random random = new Random();

    // 12-digit account number starting with 10
    public static String generateAccountNumber() {
        // Generates account number like: 10XXXXXXXXXX (12 digits total)
        long number = 1000000000L + (long)(random.nextDouble() * 9000000000L);
        return "10" + number;
    }

    // Simple temp password
    public static String generateTempPassword() {
        return "TMP" + (1000 + random.nextInt(9000));
    }
}

//random.nextInt(9000) --> 0-9000 --> 500, 1000, 1200, 8999
// ex: 500 --> 1000+500 -> 1500
//1000 - 9999
//9989--> 1000 ->
// TMP3456


//Acc number : 12 digits --> starts with "10" + "1234567890"
// 0 -> 1
//ex: 0.345678, 0.1086822, 0.999999 , 0.00000001 

// 0.5 * 9000000000

//0 -> 90000000000
//100000000000 --> 99999999999999
// 45678 + 1000000000 = 1000045678
