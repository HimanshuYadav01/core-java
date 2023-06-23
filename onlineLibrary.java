class Library{
    int no_of_books;
    String[] books;
    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }
    public void addBooks(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been added to the Library");
    }

    public void issueBooks(String book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].equals(book)) {
                System.out.println(book + " has been issued to you.");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book does not exist");
    }

    public void showAvailableBooks(){
        System.out.println("The available books in the library are: ");
        for(String book : this.books){
            if(book == null) {
                continue;
            }
            System.out.println("-->" + book);
        }
    }
    public void returnBooks(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+ " has been returned successfully.");
    }
}

public class onlineLibrary {
    public static void main(String[] args) {
        Library centralLibrary = new Library();
        centralLibrary.addBooks("C by Yashwant Kanetkar");
        centralLibrary.addBooks("Morris Mano");
        centralLibrary.addBooks("hasne ke 1000 Tareeke by Ayush Tripathi - 69th Edition");
        centralLibrary.showAvailableBooks();
        centralLibrary.issueBooks("hasne ke 1000 Tareeke by Ayush Tripathi - 69th Edition");
        centralLibrary.showAvailableBooks();
        centralLibrary.returnBooks("hasne ke 1000 Tareeke by Ayush Tripathi - 69th Edition");
        centralLibrary.showAvailableBooks();

        // rating
        // Person name
        // no of issue
    }
}
