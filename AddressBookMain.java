package Day9;

public class AddressBookMain {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        addressBook.addContact();
        addressBook.editContact();
        addressBook.deleteContact();
        addressBook.checkDuplicateContact();
        addressBook.searchByCityOrState();
        addressBook.NoOfContactPersons();
    }
}
