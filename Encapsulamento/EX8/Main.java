public class Main {
    public static void main(String[] args) {
        Book book = new Book();

        book.setTitle("Se nao eu, quem vai fazer voce feliz?");
        book.setAuthor("Grazi");
        book.setPrice(100);

        book.applyDiscount(10);

        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Price: $" + book.getPrice());
    }
}