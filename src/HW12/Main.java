package HW12;

public class Main {
    public static void main(String[] args) {
        Author pelevin = new Author("Пелевин", "Виктор");
        Author dostoevski = new Author("Достоевский", "Федор");
        Book idiot = new Book("Идиот", dostoevski, 1869);
        Book generationP = new Book("Generation P", pelevin, 1999);
        System.out.print(idiot.getName() + " ");
        System.out.print(idiot.getAuthor().getFirstName() + " ");
        System.out.print(idiot.getAuthor().getSecondName() + " ");
        System.out.println(idiot.getPublishingYear());
        System.out.printf(
                "'%s' Автор: %s %s, год %d%n",
                generationP.getName(),
                generationP.getAuthor().getFirstName(),
                generationP.getAuthor().getSecondName(),
                generationP.getPublishingYear());
        idiot.setPublishingYear(1870);
        generationP.setPublishingYear(2000);
        System.out.println("idiot.getPublishingYear() = " + idiot.getPublishingYear());
        System.out.println("generationP.getPublishingYear() = " + generationP.getPublishingYear());
        System.out.println(pelevin.equals(pelevin));
        System.out.println(idiot.equals(generationP));
        System.out.println(generationP.hashCode());
        System.out.println(idiot.hashCode());
        System.out.println(pelevin.hashCode());
        System.out.println(dostoevski.hashCode());
    }
}
