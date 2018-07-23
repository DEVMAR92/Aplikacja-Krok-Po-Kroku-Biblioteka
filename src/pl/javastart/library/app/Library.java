package pl.javastart.library.app;

import pl.javastart.library.model.Book;

public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.5";

        Book[] books = new Book[1000];

        books[0] = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz",
                2008, 450, "Nowa era", "3241324234423");
        books[1] = new Book("Dziady cz.III", "Adam Mickiewicz",
                2004, 48, "Horyzont", "324324123123");
        books[2] = new Book("Ferdydurke", "Witold Gombrowicz",
                2010, 255, "Johanes", "443455643234");


        System.out.println(appName);
        System.out.println("Książki dostępne w bibliotece:");
        books[0].printInfo();
        books[1].printInfo();
        books[2].printInfo();
        System.out.println("System może przechowywać " + books.length + " książek");

    }
}

