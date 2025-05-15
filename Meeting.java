import java.util.ArrayList;

class Meeting(){
    private String date;
    private String theme;
    
    private ArrayList<Member> members;
    private ArrayList<Book> discussedBooks;

    public Meeting (String date, String theme){
        this.date = date;
        this.theme = theme;
        this.members = new ArrayList <>();
        this.discussedBooks = new ArrayList <>();
    }

    public void registerMember (Member member){
        members.add(member);
    }

    public void addBook (Book book){
        discussedBooks.add(book);
    }

    public String getDate(String date){ 
        return date; 
    }
    public String getTheme(String theme){ 
        return theme;
    }
    public ArrayList<Member> getParticipants(){
        return participants;
    }
    public ArrayList<Book> getDiscussedBooks(){
        return discussedBooks;
    }
}