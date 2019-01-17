import java.util.*;

public class InvetedIndex {
    private static ArrayList<String> text = new ArrayList<>();
    private static LinkedList<Token> tokenx = new LinkedList<>();
    private static LinkedList<Token> doc = new LinkedList<>();
    private static String find;
    public static String delim = "\\ |\\(|\\)||\\:|\\,|\\-|\\[|\\]|\\+|\\-|\\;|\\=|\\.|\\\"|\\\"|\\“|\\“|\\“|\\”";

    public static void main(String[] args) throws Exception {
        Scanner kb = new Scanner(System.in);

        if (StorePath.readFile()) {
            find = kb.next();
            System.out.println("Word : "+find);


            Collections.sort(tokenx, Token.sortAllInfo);
            //removeSameWordinTokenx();
            printDetail(find);
        } else {
            System.out.println("Not Found Folder");
        }


    }

    public static void printDetail(String find) {
//        for (Token texts : tokenx)
//            System.out.println(texts);

       // System.out.println("Finish");

        boolean flag = false;
        System.out.println("Finding ----Start----");
        for(int i=0;i<tokenx.size();i++){

            if(tokenx.get(i).getTerm().equals(find)){
                //System.out.println(tokenx.get(i).getTerm()+ " "+tokenx.get(i).getDocID());
                System.out.println("C:\\\\Doc\\\\Doc (" + tokenx.get(i).getDocID() + ").txt |");
                flag = true;

            }
        }
        if(!flag)
            System.out.println("No word on any Doc!!");
        System.out.println("Finding ----Stop----");
    }



    public static void addTextToLinkedLists(StringTokenizer s, int i) {
        while (s.hasMoreElements()) {
            text.add(s.nextToken());
        }
        removeDuplicates();
        for (String t : text)
            tokenx.add(new Token(t,i+""));
        text.clear();
//        for(int k=0;k<text.size();k++) {
//            for (int j = 0; j < tokenx.size(); j++) {
//                if (!tokenx.get(j).getTerm().equals(text.get(k))) {
//                    tokenx.add(new Token(text.get(k), i + ""));
//                    text.clear();
//                } else {
//                    tokenx.get(j).setDocID(tokenx.get(j).getDocID() + " " + tokenx.get(i).getDocID());
//                }
//
//            }
//        }





    }

    public static void removeDuplicates() {
        Set<String> set = new LinkedHashSet<>(text);
        text.clear();
        text.addAll(set);


    }

    public static void removeSameWordinTokenx() {
        for (int i = 0; i < tokenx.size(); i++) {
            for (int j = i + 1; j < tokenx.size(); j++) {
                if (tokenx.get(i).getTerm().equals(tokenx.get(j).getTerm())) {
                    tokenx.get(i).setDocID(tokenx.get(i).getDocID() + " " + tokenx.get(j).getDocID());
                    tokenx.remove(j);
                    j--;
                }
            }
        }

    }


}

