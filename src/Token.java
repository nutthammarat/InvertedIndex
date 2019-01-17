import java.util.Comparator;

public class Token {
    private String term;
    private String docID;

    Token(String term, String docID) {
        this.term = term;
        this.docID = docID;
    }

    public String getTerm() {

        return term;
    }

    public void setTerm(String term) {

        this.term = term;
    }

    public String getDocID() {
        return docID;
    }

    public void setDocID(String docID) {

        this.docID = docID;
    }

    public String toString() {
        return term + " " + docID;
    }

    public int lengthTerm() {

        return term.length();
    }

    public static Comparator<Token> sortAllInfo = new Comparator<Token>() {

        public int compare(Token s1, Token s2) {
            String Name1 = s1.getTerm().toLowerCase();
            String Name2 = s2.getTerm().toLowerCase();
            return Name1.compareTo(Name2);


        }
    };
}