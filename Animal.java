public class Animal {

    static int population = 0;
    public String name;
    public String favoriteFood;


    public Animal(String name, String favFood) {
        this.name = name;
        this.favoriteFood = favFood;
        population++;
    }

    public void sleep() {
        System.out.println(name + " sleeps for 8 hours" );

    }

    public void eat(String food) {
        System.out.println(name + " eats " + food);
        if (food.equals(favoriteFood)) {
            System.out.println("Yum!!! " + name + " wants more " + food);
        }
    }

}
