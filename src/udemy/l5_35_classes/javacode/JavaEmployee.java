package udemy.l5_35_classes.javacode;

public class JavaEmployee {
    private final Boolean fullTime;
    private String firstName;

    public JavaEmployee(String f) {
        this.firstName = f;
        this.fullTime = true;
    }

    public JavaEmployee(String f, Boolean ft){
        this.firstName = f;
        this.fullTime = ft;
    }
}
