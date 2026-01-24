public class Library {
    private String libraryName;

    public Library(String libraryName) {
        this.libraryName = libraryName; 
    }

    public class Book {
        public String getLibraryName() {
            return libraryName;
        }
    }

    public static void main(String[] args) {
        Library myLibrary = new Library("Biblioteca");

        Library.Book myBook = myLibrary.new Book();

        System.out.println("Nome da biblioteca: " + myBook.getLibraryName());
    }
}