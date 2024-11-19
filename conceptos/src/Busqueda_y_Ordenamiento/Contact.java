package Busqueda_y_Ordenamiento;

public class Contact implements Comparable<Contact> {
    private String firstName, lastName, phone;

    public Contact(String firstName, String lastName, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    @Override
    public int compareTo(Contact other) {
        return this.firstName.compareTo(other.firstName);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + phone + " " ;
    }
}
