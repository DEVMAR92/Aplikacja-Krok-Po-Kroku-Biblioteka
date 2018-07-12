public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.3";

        Book book1 = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz",
                2008, 450, "Nowa era", "3241324234423");
        Book book2 = new Book("Dziady cz.III", "Adam Mickiewicz",
                2004, 48, "Horyzont", "324324123123");
        Book book3 = new Book("Ferdydurke", "Witold Gombrowicz",
                2010, 255, "Johanes", "443455643234");


        System.out.println(appName);
        System.out.println("Książki dostępne w bibliotece:");
        book1.printInfo();
        book2.printInfo();
        book3.printInfo();

    }
}

