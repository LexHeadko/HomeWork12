package HW12;

public class Main {
    public static void main(String[] args) {
        Author pelevin = new Author("Пелевин", "Виктор");
        Author dostoevski = new Author("Достоевский", "Федор");
        Book idiot = new Book("Идиот", dostoevski, 1869);
        Book generationP = new Book("Generation P", pelevin, 1999);
        System.out.print(idiot.getName() + " ");
        System.out.print(idiot.getAuthor() + " ");
        System.out.println(idiot.getPublishingYear());

        idiot.setPublishingYear(1870);
        generationP.setPublishingYear(2000);
        System.out.println("idiot.getPublishingYear() = " + idiot.getPublishingYear());
        System.out.println("generationP.getPublishingYear() = " + generationP.getPublishingYear());
    }
}
