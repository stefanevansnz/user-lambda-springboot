package com.lambdaspringboot.user.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class UserData {
    private static List<String> names = new ArrayList<>();
    static {
        names.add("tennisskis125");
        names.add("cricketbat314");
        names.add("surfingnet112");
        names.add("karatekick114");
        names.add("helmethead544");
        names.add("gogglesbat422");
        names.add("bowlingnet822");
        names.add("runningbat326");
        names.add("cyclingnet221");
        names.add("trailyoga234");
    } 
    
    public static List<String> getNames() {
        return names;
    }

    public static String getRandomName() {
        return names.get(ThreadLocalRandom.current().nextInt(0, names.size() - 1));
    }
    
}
