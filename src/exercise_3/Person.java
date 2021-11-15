package exercise_3;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
        if (age < 0 || age > 100) {
            this.age = 0;
        }
    }

    public boolean isTeen() {
        return this.age > 12 && this.age < 20;
    }

    public String getFullName() {
        if (getFirstName().isEmpty() && getLastName().isEmpty()) {
            return "";
        } else if (this.firstName.isEmpty()) {
            return lastName;
        } else if (this.lastName.isEmpty()) {
            return firstName;
        }
        return firstName + " " + lastName;
    }
}
