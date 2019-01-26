package main.java;

public class LastChars {

    public String lastChars(String a, String b) {

        if(a.length()>=1 && b.length()>=1){
            return String.valueOf(a.charAt(0) + b.charAt(b.length()-1));

        } else if(a.length()==0  &&  b.length()>=1){
            return "@" + b.charAt(b.length()-1);
        } else if(a.length()>=1  &&  b.length()==0){
            return String.valueOf(a.charAt(0)) + "@";
        }else
            return "@@";


    }


    public static void main(String[] args){
LastChars lastChars = new LastChars();
String lastCharsOne = lastChars.lastChars("asd", "fghj");
System.out.println(lastCharsOne);
    }
}
