package ua.com.eventinfo;

public class Main {

    public static void main(String[] args) {
        System.out.println("Привіт :)");
        System.out.println("Це мої властивості:");
        System.out.println("Installation directory for Java Runtime Environment : "+System.getProperty("java.home"));
        System.out.println("JRE vendor URL: "+System.getProperty("java.vendor.url"));
        System.out.println("Java ver: "+System.getProperty("java.version"));
        System.out.println("Sequence used by operating system to separate lines in text files: "+System.getProperty("line.separator"));
        System.out.println("Operating system architecture: "+System.getProperty("os.arch"));
        System.out.println("Operating system name: "+System.getProperty("os.name"));
        System.out.println("Operating system version: "+System.getProperty("os.version"));
        System.out.println("User account name: "+System.getProperty("user.name"));

        String cyrillic = "Я людина";
        System.out.println(cyrillic);
    }
}
