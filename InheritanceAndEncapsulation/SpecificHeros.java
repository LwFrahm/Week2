public class SpecificHeros extends Superheroes{

    int cars;
    int age;
    String ColorSuit;
    int Height;
    public SpecificHeros(int cars, int age) {
        super(5);
        this.cars = cars;
        this.age = age;
        System.out.print("Number of cars: " + cars + ". Superhero's age: " + age);

    }
    public void Attributes(int Height) {
        this.Height = Height;
        System.out.println("Superhero's height in feet: " + Height);
    }
    public void Attributes(int Height, String ColorSuit) {
        this.Height = Height;
        this.ColorSuit = ColorSuit;
        System.out.println("Superhero's height in feet: " + Height + "\nSuperhero's suit color: " + ColorSuit);
    }
    @Override
    public void SuperheroAge() {
        if (age >= 25) {
            System.out.println(" The superhero is or is older than 25.");
        } else {
            System.out.println(" The superhero is younger than 25.");
        }
    }

    public static void main(String[] args) {
        SpecificHeros Hulk = new SpecificHeros(10, 35);
        Hulk.SuperheroAge();
        Hulk.setName("Bruce Banner");
        Hulk.setPower("Incredibly Strong");
        Hulk.setEyes(2);
        Hulk.setFly(false);
        Hulk.getName();
        Hulk.getPower();
        Hulk.getEyes();
        Hulk.isFly();
        Hulk.Attributes(6);
        Hulk.Attributes(10, "Green");
        System.out.println();
        SpecificHeros Batman = new SpecificHeros(20, 30);
        Batman.SuperheroAge();
        Batman.setName("Bruce Wayne");
        Batman.setPower("Super rich");
        Batman.setEyes(2);
        Batman.setFly(true);
        Batman.getName();
        Batman.getPower();
        Batman.getEyes();
        Batman.isFly();
        Batman.Attributes(6);
        
    }
}
