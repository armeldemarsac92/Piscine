// package ex_08;

public class Gecko {
    private String name;
    private Integer age;
    private Integer energy = 100;

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

    public void hello(String str) {
        System.out.println("Hello " + str + ", I'm " + this.getName());
    }

    public void hello(Integer str) {
        for (Integer i = 0; i < str; i++) {
            System.out.println("Hello, I'm " + this.getName());
        }
    }

    public void eat(String food) {
        switch(food) {
            case "Meat" -> {
                System.out.println("Yummy!");
                this.setEnergy(10);
            }
            case "Vegetable" -> {
                System.out.println("Erk!");
                this.setEnergy(-10);
            }
            default -> {
                System.out.println("I can't eat this!");
            }
        }
    }

    public void setEnergy(int newEnergy) {
        if (this.energy + newEnergy <= 0) {
            System.out.println("Guecko is empty!");
        } else if (this.energy + newEnergy > 100) {
            System.out.println("Guecko is full!");
        } else {
            this.energy = newEnergy + this.energy;
        }
    }

    public Integer getEnergy() {
        return energy;
    }

    public void work() {
        if (this.energy >= 25) {
            this.setEnergy(-9);
            System.out.println("I'm workit T.T");
        } else {
            this.setEnergy(50);
            System.out.println("Heyyy I'm too sleepy, better take a nap!");
        }
    }

    public void fraternize(Gecko Gecko2) {
        if (this.energy >= 31 && Gecko2.energy >= 31){
            System.out.println("I'm going to drink with " + Gecko2.name + "!");
            System.out.println("I'm going to drink with " + this.name + "!");
            this.setEnergy(-30);
            Gecko2.setEnergy(-30);
        } else if (this.energy < 31 && Gecko2.energy >= 31 ) {
            System.out.println("Sorry " + Gecko2.name + ", I'm too tired to go out tonight.");
            System.out.println("Oh! That's too bad, another time then !");
        } else if (this.energy >= 31 && Gecko2.energy < 31 ) {
            System.out.println("Sorry " + this.name + ", I'm too tired to go out tonight.");
            System.out.println("Oh! That's too bad, another time then !");
        } else {
            System.out.println("Not today!");
        }
        
    }

    public void fraternize(String Snake) {
        switch(Snake) {
            case "Snake" -> {
                if (this.energy > 10) {
                    System.out.println("LET'S RUN AWAY!!!");
                    this.energy = 0;
                } else {
                    System.out.print("...");
                }
            }

            default -> {}
        }
        
    }

}
