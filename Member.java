
import java.util.ArrayList;

class Member{
    private String name;
    private int id;
    private String address;
    private static userID =0;
    
    private ArrayList<Book> readBooks;
    private ArrayList<Book> recommendedBooks;

    public Membro(String name, String address, String birthdate, int id){
        this.id = userID++;
        this.readBooks = new ArrayList<>();
        this.recommendedBooks = new ArrayList<>();
        this.name = name;
        this.address = address;
        this.birthdate = birthdate;
    }

    public getName(){
        return name;
    }
    public getId(int id){
        return id;
    }
    public getAddress (String address){
        return address;
    }
    public getBirthdate (String birthdate){
        return birthdate;
    }
    public ArrayList<Book> getReadBooks(){ 
        return readBooks;
    }
    public ArrayList<Book> getRecommendedBooks(){ 
        return recommendedBooks; 
    }

    public void setAddress (String address){
        this.address = address;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setBirthdate(String birthdate){
        this.birthdate = birthdate;
    }
}