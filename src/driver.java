public class driver {
    public static void main(String[] args) {
        Shelf bookShelf = new Shelf();
        Book a = new Book("asd","123a","das",2,"Http://");
        Book b = new Book("asd","123a","das",2,"Http://");
        System.out.println(bookShelf.has(a));
        bookShelf.add(a);
        System.out.println(bookShelf.has(a));
        System.out.println(bookShelf.has(b));
    }
}
