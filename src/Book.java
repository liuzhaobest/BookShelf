/*
This is the class to hold each book. It holds the attributes of each book and
it can compare if two books are equal to each other.
 */
public class Book {
    private String name;
    private String isbn;
    private String author;
    private int version;
    private String address; // google drive address


    /*
    constructors
     */
    public Book(){
        this.name = "default name";
        this.isbn = "default ISBN";
        this.author = "default author";
        this.version = 0;
        this.address = "default address";
    }


    public Book(String in_name, String in_isbn, String in_author, int in_version, String in_address){
        this.name = in_name;
        this.isbn = in_isbn;
        this.author = in_author;
        this.version = in_version;
        this.address = in_address;
    }


    /*
    setters
     */

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /*
        getters
         */


    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getVersion() {
        return version;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object obj) {
        /*
        Two books are consider to be equal if the ISBN of two books are the same
        Or the book name and author and version are all the same.
         */
        if(obj instanceof Book){
            if(isbn == ((Book) obj).isbn){
                return true;
            }
            else if(name == ((Book) obj).name && author == ((Book) obj).author && version == ((Book) obj).version){
                return true;
            }
        }
        return false;
    }
}
