class Book{
    private String title;
    private String author;
    private String gender;
    private int year;
    private int id;
    private static int bookID = 0;
    private int recommendations;

    public Book(String title, String author, int year){
        id = bookID++;
        this.title = title;
        this.author = author;
        this.year = year;
        recommendations = 0;
    }

    //getters
    public String getTitle(){
        return title;
    }
    public int getId(int id){
        return id;
    }
    public String getAuthor (String author){
        return author;
    }
    public int getYear (int year){
        return year;
    }
    public int getRecommendations (int recommendations){
        return recommendations;
    }

    //setters
    public void setTittle(String title){
        this.title = title;
    }
    public void setAuthor (String author){
        this.author = author;
    }
    public void setYear (int year){
        this.year = year;
    }

    public void incrementRecommendation(){
        recommendations++
    }
}