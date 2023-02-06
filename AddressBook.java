package Day9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

    public class AddressBook {
        public static void main(String[] agrs) {
            System.out.println("Address Book");
        }

        Contact person = new Contact();
        ArrayList<Contact> people = new ArrayList<Contact>();
        Scanner sc = new Scanner(System.in);

        public void addContact() {

            System.out.println("First Name :");
            person.firstName = sc.nextLine();

            System.out.println("Last Name :");
            person.LastName = sc.nextLine();

            System.out.println("Address :");
            person.address = sc.nextLine();

            System.out.println("City :");
            person.city = sc.nextLine();

            System.out.println("State :");
            person.state = sc.nextLine();

            System.out.println("Zip :");
            person.Zip = sc.nextLine();

            System.out.println("Phone Number :");
            person.phoneNumber = sc.nextLine();

            System.out.println("Email :");
            person.email = sc.nextLine();

            people.add(person);
        }

    }
