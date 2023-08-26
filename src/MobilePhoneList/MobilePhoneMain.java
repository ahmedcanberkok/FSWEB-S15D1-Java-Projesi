package MobilePhoneList;

public class MobilePhoneMain {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("33060126");
        Contact person = new Contact("Can","16180332");
        phone.addNewContact(person);
        phone.addNewContact(new Contact("Bob","31415926"));
        phone.addNewContact(new Contact("Alice ","16180339"));
        phone.addNewContact(new Contact("Tom ","11235813"));
        phone.addNewContact(new Contact("Jane ","23571113"));

        phone.printContact();

        System.out.println("index:" + phone.findContact(person));
        System.out.println("index String : " + phone.findContact(person.getName()));
        System.out.println("Q ->>" + phone.queryContact(person.getName()));
        phone.removeContact(person);
        phone.printContact();
    }
}
