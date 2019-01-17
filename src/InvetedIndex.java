import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.stream.Collectors;

public class InvetedIndex {
    private static String[] token;
    private static String[] tokens;
    private static ArrayList<String> text = new ArrayList<>();
    private static ArrayList<String> texts = new ArrayList<>();
    private static ArrayList<Token> tokenx = new ArrayList<>();
    private static LinkedList<String> keep = new LinkedList<>();
    private static String find;
    private static String address;
    private static String address2;

    public static void main(String[] args) throws Exception {
        Scanner kb = new Scanner(System.in);
        find = kb.next();
        System.out.println("Word : "+find);
        if (readFile()) {
            addTextToLinkedLists(token, tokens);
            Collections.sort(tokenx, Token.sortAllInfo);
            removeSameWordinTokenx();
            printDetail(find);
        } else {
            System.out.println("Not Found Folder");
        }


    }

    public static void printDetail(String find) {
//        for (Tokenx texts : tokenx) {
//            System.out.println(texts);
//
//
//        }
        boolean flag = false;
        for(int i=0;i<tokenx.size();i++){
            if(tokenx.get(i).getTerm().equals(find)){
                flag = true;
                if(tokenx.get(i).getDocID().equals("1")){
                    System.out.println(address);
                 }
                else if(tokenx.get(i).getDocID().equals("2")){
                    System.out.println(address2);
                 }else{
                    System.out.println(address + "\n" +address2);
                }
            }
        }
        if(!flag)
            System.out.println("No word on any Doc!!");
    }

    public static boolean readFile() {
        try {
            File file = new File("C:\\Users\\59161088\\Desktop\\Doc1.txt");
            File files = new File("C:\\Users\\59161088\\Desktop\\Doc2.txt");
            address = file.toString();
            address2 = files.toString();
            extractToToken(file, files);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void extractToToken(File file, File files) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(file));
        BufferedReader brs = new BufferedReader(new FileReader(files));
//        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
//        StringTokenizer stringTokenizers = new StringTokenizer(brs.readLine());
//        while(stringTokenizer.hasMoreElements()){
//            text.add(stringTokenizer.nextElement().toString());
//        }
//        while(stringTokenizers.hasMoreElements()){
//            texts.add(stringTokenizers.nextElement().toString());
//        }
        token = br.readLine().split(" ");
        tokens = brs.readLine().split(" ");
    }

    public static void addTextToLinkedLists(String[] token, String[] tokens) {
        for (String t : token) {
            text.add(t.toLowerCase().toString());
        }
        for (String t : tokens) {
            texts.add(t.toLowerCase().toString());
        }
        removeDuplicates();
        for (String t : text) {
            tokenx.add(new Token(t.toLowerCase(), "1"));
        }
        for (String t : texts) {
            tokenx.add(new Token(t.toLowerCase(), "2"));
        }
    }

    public static void removeDuplicates() {
        Set<String> set = new LinkedHashSet<>(text);
        text.clear();
        text.addAll(set);
        Set<String> sets = new LinkedHashSet<>(texts);
        texts.clear();
        texts.addAll(sets);

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

