package lesson8;

public class Contact {
    // 1. ����
    String name;
    private String email;
    private String phoneNumber;

    // 2. ������������

    public Contact() {
    }

    public Contact(String name) {
        this.name = name;
    }

    public Contact(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Contact(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }



    // 3. ������
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
