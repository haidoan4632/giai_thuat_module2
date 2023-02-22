package ss4_class_object;

public class Doctor {
    private String nameDoctor;
    private String address;
    private String email;
    private String number;
    private String position;

    public Doctor() {
    }

    public Doctor(String nameDoctor, String address, String email, String number, String position) {
        this.nameDoctor = nameDoctor;
        this.address = address;
        this.email = email;
        this.number = number;
        this.position = position;
    }

    public String getNameDoctor() {
        return nameDoctor;
    }

    public void setNameDoctor(String nameDoctor) {
        this.nameDoctor = nameDoctor;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "nameDoctor='" + nameDoctor + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", number='" + number + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
