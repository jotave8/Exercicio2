class Book{
    private String title;
    private String author;
    private String gender;
    private int year;
    private int id;
    private static int bookID = 0;

    public Book(int id){
        this.id = bookID++;
    }

    public getTitle(){
        return title;
    }

    public setNome(String title){
        this.title = title;
    }

    public getId(int id){
        return id;
    }

    public getAuthor (String author){
        return author;
    }

    public setAuthor (String author){
        this.author = author;
    }

    public getYear (int year){
        return year;
    }

    public setYear (int year){
        this.year = year;
}