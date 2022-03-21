public class Person {
    String firstname; //Instance method
    String lastname;  //Instance method
    int age; // instance method

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName(""); // firstName is set to empty string
        person.setLastName(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFirstName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());

    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public String setFirstName(String fname) {
        firstname = fname;
        return fname;
    }

    public String setLastName(String lname) {
        lastname = lname;
        return lname;
    }

    public int setAge(int age1) {
        if (age1 >= 0 && age <= 100) {
            return age = age1;
        } else
            return age;
    }

    public boolean isTeen() {
        if (age > 12 && age < 20) {
            return true;
        } else
            return false;
    }
    public String getFullName() {


        if (firstname.isEmpty()) {
            return firstname;
        } else if (lastname.isEmpty()) {
            return lastname;

        }
        String fullname = (firstname + " " + lastname);
        return fullname;
    }

}


