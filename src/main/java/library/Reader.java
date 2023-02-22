package library;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Reader {
    private String firstName;
    private String middleName;
    private String lastName;
    private int libraryCardNumber;
    private String faculty;
    private LocalDate dateOfBirth;
    private String phoneNumber;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getLibraryCardNumber() {
        return libraryCardNumber;
    }

    public void setLibraryCardNumber(int libraryCardNumber) {
        this.libraryCardNumber = libraryCardNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Reader(String firstName, String middleName, String lastName, int libraryCardNumber, String faculty,
                  LocalDate dateOfBirth, String phoneNumber) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook() {

    }

    public void returnBook() {

    }

    public Reader() {
    }

    //takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги"
    public void takeBook(int countOfTakenBooks) {
        System.out.println("Петров В. В. взял " + countOfTakenBooks + " книги.");
    }

    //takeBook, который будет принимать переменное количество названий книг. Выводит на консоль сообщение
    // "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия"
    public void takeBook(String... namesOfBooks) {
        System.out.println("Петров В. В. взял книги: " + Arrays.toString(namesOfBooks)
                .replace("[", "")
                .replace("]", ""));
    }

    //takeBook, который будет принимать переменное количество объектов класса Book (создать новый класс, содержащий
    // имя и автора книги). Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия"
    public void takeBook(Book[] books) {
        String str = "";
        for (Book book : books) {
            str += book.getNameOfBook() + ", ";
        }
        str = str.substring(0, str.length() - 2);
        System.out.println("Петров В. В. взял книги: " + str);
    }

    public void returnBook(int countOfReturnedBooks) {
        System.out.println("Петров В. В. вернул " + countOfReturnedBooks + " книги.");
    }
}
