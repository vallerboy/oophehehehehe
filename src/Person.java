public class Person {
    private String name;
    private int age;
    private String eyesColor;
    private int cash;

    public Person(String name, int age, String eyesColor){
        this.name = name;
        this.age = age;
        this.eyesColor = eyesColor;
        System.out.println("Konstruktor 1");
    }

    public Person(String name, int age, String eyesColor, int cash){
        this(name, age, eyesColor);
        this.cash = cash;
        System.out.println("Konstruktor 2");

    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age + 2;
    }

    public String getEyesColor(){
        return eyesColor;
    }

    public void setName(String name){
        this.name = name;
    }


    public void setAge(int age){
        this.age = age;
    }

    public void setEyesColor(String eyesColor){
        this.eyesColor = eyesColor;
    }

    public void eat(){
        System.out.println("amamam jem");
    }

    public void eat(String what){
        System.out.println("Aamamam " + what);
    }

}
