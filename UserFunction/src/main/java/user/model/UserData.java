package main.java.user.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class UserData {
    private static List<String> names = new ArrayList<>();
    static {
        names.add("Bailey");
        names.add("Bella");
        names.add("Max");
        names.add("Lucy");
        names.add("Charlie");
        names.add("Molly");
        names.add("Buddy");
        names.add("Daisy");
        names.add("Rocky");
        names.add("Maggie");
        names.add("Jake");
        names.add("Sophie");
        names.add("Jack");
        names.add("Sadie");
        names.add("Toby");
        names.add("Chloe");
        names.add("Cody");
        names.add("Bailey");
        names.add("Buster");
        names.add("Lola");
        names.add("Duke");
        names.add("Zoe");
        names.add("Cooper");
        names.add("Abby");
        names.add("Riley");
        names.add("Ginger");
        names.add("Harley");
        names.add("Roxy");
        names.add("Bear");
        names.add("Gracie");
        names.add("Tucker");
        names.add("Coco");
        names.add("Murphy");
        names.add("Sasha");
        names.add("Lucky");
        names.add("Lily");
        names.add("Oliver");
        names.add("Angel");
        names.add("Sam");
        names.add("Princess");
        names.add("Oscar");
        names.add("Emma");
        names.add("Teddy");
        names.add("Annie");
        names.add("Winston");
        names.add("Rosie");
    } 
    
    public static List<String> getNames() {
        return names;
    }

    public static String getRandomName() {
        return names.get(ThreadLocalRandom.current().nextInt(0, names.size() - 1));
    }
    
}
