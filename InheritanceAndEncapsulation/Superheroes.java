public class Superheroes {


    private String Power;
    private String Name;
    private int Eyes;
    private boolean Fly;
    public int EnemiesDefeated;

    public void setPower(String Power) {
        this.Power = Power;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setEyes(int Eyes) {
        this.Eyes = Eyes;
    }

    public void setFly(boolean Fly) {
        this.Fly = Fly;
    }
    public String getPower() {
        System.out.println("The superhero's power: " + Power);
        return Power;
    }
    public String getName() {
        System.out.println("The superhero's name: " + Name);
        return Name;
    }
    public int getEyes() {
        System.out.println("Number of eyes the superhero has: " + Eyes);
        return Eyes;
    }
    public boolean isFly() {
        System.out.println("Can the superhero fly: " + Fly);
        return Fly;
    }

    public void SuperheroAge() {
        System.out.println("The superhero's age is : unknown.");
    }
    public Superheroes(int EnemiesDefeated) {
        this.EnemiesDefeated=EnemiesDefeated;
        System.out.println("Enemies defeated: " + EnemiesDefeated);
    }
}
