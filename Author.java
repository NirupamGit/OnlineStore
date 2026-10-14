public class Author
{
    private String name;
    private String dateOfBirth;
    private int age;

    public Author (String name, String dateOfBirth, int age) {
        this.name=name;
        this.dateOfBirth=dateOfBirth;
        this.age=age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
}
    public int getAge() {
        return age;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public String getName() {
        return name;
    }
}
