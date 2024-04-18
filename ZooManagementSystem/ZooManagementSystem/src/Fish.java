public class Fish extends Animal implements Swimmable {
    public Fish(String name, int age, double weight, int ability) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.ability = ability;

    }

    @Override
    public void checkAbility() {

        switch (ability) {
            case 0:

                System.out.println("This animal is a bird but it has no ability..");
                break;
            case 1:
                System.out.println("A fish but it has an ability to fly. Unfortunately, you can't make it fly.");
                break;
            case 2:
                System.out.println("Yes, it can swim.");
                break;
            case 3:
                System.out.println("A fish but it has an ability to climb. Unfortunately, you can't make it climb.");
                break;
            default:
                break;
        }

    }
}