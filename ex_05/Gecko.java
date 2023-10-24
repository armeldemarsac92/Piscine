// package ex_05;

public class Gecko {
    private String name;
    private Integer age;
    public Gecko(){
        name = "Unknown";
        System.out.println("Hello!");
    }
    public Gecko(String name, Integer age){
        this.name = name;
        this.age = age;
        System.out.println("Hello " + this.name + "!");
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void getStatus() {
        switch(age) {
            case 0 -> System.out.println("Unborn Gecko");
            case 1, 2 -> System.out.println("Baby Gecko");
            case 3,4,5,6,7,8,9,10 -> System.out.println("Adult Gecko");
            case 11,12,13 -> System.out.println("Old Gecko"); 
            default -> System.out.println("Impossible Gecko");
        }
    }

    public void Hello(String str) {
        System.out.println("Hello " + str + ", I'm " + this.getName());
    }
    public void Hello(Integer str) {
        for (Integer i = 0; i < str; i++) {
            System.out.println("Hello, I'm " + this.getName());
        }
    }
}
