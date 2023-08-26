package MobilePhoneList;

import java.util.Objects;

public class Contact {
    private String name ;
    private String phoneNumber ;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static Contact createContact (String name,String phoneNumber) {
        return new Contact(name,phoneNumber);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == null) {
            return true ;
        }
        if (obj == null || getClass() != obj.getClass())
            return false ;
        Contact contact = (Contact) obj;
        return phoneNumber.equals(contact.phoneNumber);

    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber);
    }

    public String toString() {
        return  "Contact {" + " name ='" + name + '\''+ ", phoneNumber = ' " + phoneNumber + '\'' + "}" ;
    }


}
