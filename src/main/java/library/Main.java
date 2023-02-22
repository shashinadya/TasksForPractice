package library;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Reader[] readers = new Reader[5];
        readers[0] = new Reader("Mikhail", "Ivalovich", "Petrov", 7687
                , "Astronomy faculty", LocalDate.of(1998, 12, 30), "89034565434");
        readers[1] = new Reader("Oleg", "Petrovich", "Ivanov", 856
                , "Biology faculty", LocalDate.of(1997, 01, 21), "89166549876");
        readers[2] = new Reader("Pavel", "Nikolaevich", "Smirnov", 234
                , "Mathematic faculty", LocalDate.of(1999, 9, 3), "89038763456");
        readers[3] = new Reader("Maxim", "Pavlovich", "Sidorov", 1903
                , "Computer Science faculty", LocalDate.of(2000, 11, 15), "89290877634");
        readers[4] = new Reader("Ivan", "Mikhailovich", "Vanin", 78
                , "Economy faculty", LocalDate.of(1996, 6, 22), "89155670987");

        Book[] books = {new Book("Энциклопедия", "Иванов"),
                new Book("Математика", "Петров"),
                new Book("Экология", "Михайлов")};

        readers[0].takeBook(2);
        readers[2].takeBook("Астрономия", "Информатика", "Математика");
        readers[1].takeBook(books);
        readers[1].returnBook(3);
    }


}
