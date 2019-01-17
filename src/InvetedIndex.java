import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class InvetedIndex {
    public static String[] token;
    public static String[] tokens;
    public static String[] token3;
    public static String[] token4;
    public static String[] token5;
    public static String[] token6;
    public static String[] token7;
    public static String[] token8;
    public static String[] token9;
    public static String[] token10;
    public static String[] token11;
    public static String[] token12;
    public static String[] token13;
    public static String[] token14;
    public static String[] token15;
    public static String[] token16;
    public static String[] token17;
    public static String[] token18;
    public static String[] token19;
    public static String[] token20;
    public static String[] token21;
    public static String[] token22;
    public static String[] token23;
    public static String[] token24;
    public static String[] token25;
    public static String[] token26;
    public static String[] token27;
    public static String[] token28;
    public static String[] token29;
    public static String[] token30;
    private static ArrayList<String> text = new ArrayList<>();
    private static ArrayList<String> texts = new ArrayList<>();
    private static ArrayList<String> text3 = new ArrayList<>();
    private static ArrayList<String> text4 = new ArrayList<>();
    private static ArrayList<String> text5 = new ArrayList<>();
    private static ArrayList<String> text6 = new ArrayList<>();
    private static ArrayList<String> text7 = new ArrayList<>();
    private static ArrayList<String> text8 = new ArrayList<>();
    private static ArrayList<String> text9 = new ArrayList<>();
    private static ArrayList<String> text10= new ArrayList<>();
    private static ArrayList<String> text11 = new ArrayList<>();
    private static ArrayList<String> text12 = new ArrayList<>();
    private static ArrayList<String> text13 = new ArrayList<>();
    private static ArrayList<String> text14 = new ArrayList<>();
    private static ArrayList<String> text15 = new ArrayList<>();
    private static ArrayList<String> text16 = new ArrayList<>();
    private static ArrayList<String> text17 = new ArrayList<>();
    private static ArrayList<String> text18 = new ArrayList<>();
    private static ArrayList<String> text19 = new ArrayList<>();
    private static ArrayList<String> text20 = new ArrayList<>();
    private static ArrayList<String> text21 = new ArrayList<>();
    private static ArrayList<String> text22 = new ArrayList<>();
    private static ArrayList<String> text23 = new ArrayList<>();
    private static ArrayList<String> text24 = new ArrayList<>();
    private static ArrayList<String> text25 = new ArrayList<>();
    private static ArrayList<String> text26 = new ArrayList<>();
    private static ArrayList<String> text27 = new ArrayList<>();
    private static ArrayList<String> text28 = new ArrayList<>();
    private static ArrayList<String> text29 = new ArrayList<>();
    private static LinkedList<String> text30 = new LinkedList<>();
    private static LinkedList<Token> tokenx = new LinkedList<>();
    private static LinkedList<String> keep = new LinkedList<>();
    private static String find;

    public static String delim = "\\ |\\:|\\,|\\-";
    public static void main(String[] args) throws Exception {
        Scanner kb = new Scanner(System.in);

        if (StorePath.readFile()) {
//            find = kb.next();
//            System.out.println("Word : "+find);
            addTextToLinkedLists();
            //addTextToLinkedListss();
            Collections.sort(tokenx, Token.sortAllInfo);
            //removeSameWordinTokenx();
            printDetail(find);
        } else {
            System.out.println("Not Found Folder");
        }


    }

    public static void printDetail(String find) {


        for(int i=0;i<9;i++){
            tokenx.pop();
        }


        for (Token texts : tokenx)
            System.out.println(texts);




        boolean flag = false;
//        for(int i=0;i<tokenx.size();i++){
//            if(tokenx.get(i).getTerm().equals(find)){
//                flag = true;
//                if(tokenx.get(i).getDocID().equals("1")){
//                    System.out.println(address);
//                 }
//                else if(tokenx.get(i).getDocID().equals("2")){
//                    System.out.println(address2);
//                 }else{
//                    System.out.println(address + "\n" +address2);
//                }
//            }
//        }
//        if(!flag)
//            System.out.println("No word on any Doc!!");
    }



    public static void addTextToLinkedLists() {
        for (String t : token) {
            text.add(t.toLowerCase());
        }
        for (String t : tokens) {
            texts.add(t.toLowerCase());
        }
        for (String t : token3) {
            text3.add(t.toLowerCase());
        }
        for (String t : token4) {
            text4.add(t.toLowerCase());
        }
        for (String t : token5) {
            text5.add(t.toLowerCase());
        }
        for (String t : token6) {
            text6.add(t.toLowerCase());
        }
        for (String t : token7) {
            text7.add(t.toLowerCase());
        }
        for (String t : token8) {
            text8.add(t.toLowerCase());
        }
        for (String t : token9) {
            text9.add(t.toLowerCase());
        }
        for (String t : token10) {
            text10.add(t.toLowerCase());
        }
        removeDuplicates();
        for (String t : text) {
            tokenx.add(new Token(t, "1"));
        }
        for (String t : texts) {
            tokenx.add(new Token(t, "2"));
        }
        for (String t : text3) {
            tokenx.add(new Token(t, "3"));
        }
        for (String t : text4) {
            tokenx.add(new Token(t, "4"));
        }
        for (String t : text5) {
            tokenx.add(new Token(t, "5"));
        }
        for (String t : text6) {
            tokenx.add(new Token(t, "6"));
        }
        for (String t : text7) {
            tokenx.add(new Token(t, "7"));
        }
        for (String t : text8) {
            tokenx.add(new Token(t, "8"));
        }
        for (String t : text9) {
            tokenx.add(new Token(t, "9"));
        }
        for (String t : text10) {
            tokenx.add(new Token(t, "10"));
        }

    }

    public static void removeDuplicates() {
        Set<String> set = new LinkedHashSet<>(text);
        text.clear();
        text.addAll(set);
        Set<String> sets = new LinkedHashSet<>(texts);
        texts.clear();
        texts.addAll(sets);

        sets = new LinkedHashSet<>(text3);
        text3.clear();
        text3.addAll(sets);

        sets = new LinkedHashSet<>(text4);
        text4.clear();
        text4.addAll(sets);

        sets = new LinkedHashSet<>(text5);
        text5.clear();
        text5.addAll(sets);

        sets = new LinkedHashSet<>(text6);
        text6.clear();
        text6.addAll(sets);

        sets = new LinkedHashSet<>(text7);
        text7.clear();
        text7.addAll(sets);

        sets = new LinkedHashSet<>(text8);
        text8.clear();
        text8.addAll(sets);

        sets = new LinkedHashSet<>(text9);
        text9.clear();
        text9.addAll(sets);

        sets = new LinkedHashSet<>(text10);
        text10.clear();
        text10.addAll(sets);

    }
    public static void removeSameWordinTokenx(){
        for(int i=0;i<tokenx.size();i++){
            for(int j=i+1;j<tokenx.size();j++){
                if(tokenx.get(i).getTerm().equals(tokenx.get(j).getTerm())){
                    tokenx.get(i).setDocID("1 2");
                    tokenx.remove(j);
                    j--;
                }
            }
        }

    }

}

