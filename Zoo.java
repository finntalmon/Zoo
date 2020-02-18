public class Zoo {



    public static void main(String[] args) {
        //make and run a main method
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.sleep();
        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");
        pooh.sleep();
        Unicorn Rarity = new Unicorn("Rarity");
        Rarity.eat("marshmallows");
        Rarity.sleep();
        Giraffe Gemma = new Giraffe("Gemma");
        Gemma.eat("meat");
        Gemma.eat("leaves");
        Bee Stinger = new Bee("Stinger");
        Stinger.eat("ice cream");
        Stinger.eat("pollen");
        Stinger.sleep();
        Animal[] a = {tigger, pooh, Rarity, Gemma, Stinger};
        Zookeeper Zoebot = new Zookeeper("Zoebot");
        Zoebot.feedAnimals(a, "pizza", Animal.population);
    }


    //String favoriteFood = "bacon";

//    public static void main(String[] an){
//        Zoo z = new Zoo();
//       // z.sleep("Tigger");
//        z.eat("Tigger", "meat ");
//        z.eat("Tigger", "bacon");
//        //z.eat("Tigger", "bacon");
//
//    }
//
//    public void sleep(String name ){
//        System.out.println(name + " sleeps for 8 hours" );
//    }
//
//    public void eat(String name, String food){
//        System.out.println(name + " eats " + food );
//        if(food.equals(favoriteFood)){
//            System.out.println("Yum!!! " + name + " wants more " + food );
//        }else{
//            sleep(name);
//        }
//
//    }
}
