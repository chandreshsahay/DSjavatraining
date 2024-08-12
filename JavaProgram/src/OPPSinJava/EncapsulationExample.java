package OPPSinJava;

//to print the student info
public class EncapsulationExample {
    public static void main(String[] args) {
        //add the student info
        StudentProfile s= new StudentProfile();
        s.setName("Chandresh");
        s.setEmail("cssahay@gmail.com");
        s.setAddress("Varanasi");
        s.setMobile(String.valueOf(965193588));
        //get and print the student info
        System.out.println(s.getName() + " "+ s.getEmail() + " "+ s.getAddress() + " "+s.getMobile());
    }
}


class StudentProfile{
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    String name;
    String email;
    String address;
    String mobile;
}
