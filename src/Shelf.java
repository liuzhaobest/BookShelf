/*
How should I store the information of this book?
In an array or a LinkedList or a HashSet?
 */
import java.util.HashSet;
import java.util.Iterator;

public class Shelf {
    private HashSet<Book> bookShelf;

    public Shelf(){
        bookShelf = new HashSet<>();
    }

    public void add(Book a){
        bookShelf.add(a);
    }

    /*
    need to be careful about this remove process.
    some book does not have a valid ISBN
    they should not share a ISBN
    if it is a share ISBN, no remove possible
     */
    public void remove(Book a){
        bookShelf.remove(a);
    }

    /*
    has book a means either has the object book a
    or it has the book which is equal to a
     */
    public boolean has(Book a){
        if(bookShelf.isEmpty()) return false;
        else if(bookShelf.contains(a)){
            return true;
        }
        else{
            Iterator<Book> it = bookShelf.iterator();
            while(it.hasNext()){
                if(a.equals(it.next())){
                    return true;
                }
            }
        }
        return false;
    }
}
