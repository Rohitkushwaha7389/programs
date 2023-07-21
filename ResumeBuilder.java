import java.util.Scanner;

public class ResumeBuilder {
    private String name;
    private int age;
    private String email;
    private String phoneNumber;
    private String address;

    public ResumeBuilder() {
        this.name = "";
        this.age = 0;
        this.email = "";
        this.phoneNumber = "";
        this.address = "";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void buildResume() {
        System.out.println("Resume");
        System.out.println("------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ResumeBuilder resumeBuilder = new ResumeBuilder();

        System.out.println("Welcome to the Online Resume Builder!");
        System.out.println("Please enter your details:");

        System.out.print("Name: ");
        String name = scanner.nextLine();
        resumeBuilder.setName(name);

        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        resumeBuilder.setAge(age);

        System.out.print("Email: ");
        String email = scanner.nextLine();
        resumeBuilder.setEmail(email);

        System.out.print("Phone Number: ");
        String phoneNumber = scanner.nextLine();
        resumeBuilder.setPhoneNumber(phoneNumber);

        System.out.print("Address: ");
        String address = scanner.nextLine();
        resumeBuilder.setAddress(address);

        System.out.println("Thank you for providing your details!");
        System.out.println("Generating your resume...");
        System.out.println();

        resumeBuilder.buildResume();

        scanner.close();
    }
}
