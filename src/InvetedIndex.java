import java.util.*;

public class InvetedIndex {
    private static ArrayList<String> text = new ArrayList<>();
    private static LinkedList<Token> tokenx = new LinkedList<>();
    private static LinkedList<Token> doc = new LinkedList<>();
    private static String[] doc1;
    private static String find;


    public static void main(String[] args) throws Exception {
        Scanner kb = new Scanner(System.in);

        if (StorePath.readFile()) {
            find = kb.next();
            System.out.println("Word : " + find);

            removeSameWordinTokenx();
            Collections.sort(tokenx, Token.sortAllInfo);

            printDetail(find);
        } else {
            System.out.println("Not Found Folder");
        }


    }

    public static void printDetail(String find) {
//        for (Token texts : tokenx)
//            System.out.println(texts);
        boolean flag = false;
        System.out.println("Finding ----Start----");
        for (int i = 0; i < tokenx.size(); i++) {

            if (tokenx.get(i).getTerm().equals(find)) {
                doc1 = tokenx.get(i).getDocID().split(" ");

                for (String a : doc1)
                    System.out.println("C:\\\\Doc\\\\Doc (" + a + ").txt |");
                flag = true;

            }
        }
        if (!flag)
            System.out.println("No word on any Doc!!");
        System.out.println("Finding ----Stop----");
    }


    public static void addTextToLinkedLists(StringTokenizer s, int i) {
        removeDuplicates(s);

            for (String t : text)
           tokenx.add(new Token(t, i + ""));




        text.clear();

    }

    public static void removeDuplicates(StringTokenizer s) {
        while (s.hasMoreTokens())
            text.add(s.nextToken().toLowerCase());
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

