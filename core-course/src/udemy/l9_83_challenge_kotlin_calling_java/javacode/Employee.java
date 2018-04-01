package udemy.l9_83_challenge_kotlin_calling_java.javacode;

public class Employee {
    private String firstName;
    private String lastName;
    private int startYear;
    private float[] salaryLast3Years;

    public Employee(String f, String l, int sy) {
        this.firstName = f;
        this.lastName = l;
        this.startYear = sy;
        this.salaryLast3Years = new float[3];
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public float[] getSalaryLast3Years() {
        return salaryLast3Years;
    }

    public void setSalaryLast3Years(float[] salaryLast3Years) {
        this.salaryLast3Years = salaryLast3Years;
    }
}
