package service;

import dao.AuthorDao;
import utils.UtilMethods;

import java.util.Scanner;

public class AuthorService {

    private static final Scanner scanner = new Scanner(System.in);
    private static final AuthorDao authorDao = new AuthorDao();

    public void createAuthor(){
        System.out.println("Please insert author's first name:");
        String firstname = scanner.next() + scanner.nextLine();
        firstname = UtilMethods.firstLetterToUpperCase(firstname);
        System.out.println("Please insert veterinarian's last name:");
        String lastName = scanner.next() + scanner.nextLine();
        lastName = UtilMethods.firstLetterToUpperCase(lastName);
        System.out.println("Please insert veterinarian's address:");
        String address = scanner.next() + scanner.nextLine();
        System.out.println("Please insert veterinarian's speciality:");
        String speciality = scanner.next() + scanner.nextLine();
    }
}
