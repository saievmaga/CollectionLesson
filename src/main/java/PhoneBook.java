
import java.util.HashSet;
import java.util.Set;

public class PhoneBook {

    Set<Contact> contactList;

    public PhoneBook() {
        this.contactList = new HashSet<>();
    }

    public void add(String name, String phoneNumber) {
        contactList.add(new Contact(name, phoneNumber));
    }

    public String get(String name) {

        StringBuilder sb = new StringBuilder(name);
        for (Contact c : contactList) {
            if (c.getName().equals(name)) {
                sb.append(" - ").append(c.getPhoneNumber());
            }
        }
        return sb.toString();
    }
}