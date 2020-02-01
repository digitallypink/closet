package pink.digitally.learning.closet;

/*
    This class will house the main method.
    Within this method we will create a number of Closet instances.
 */
public class Main {

    // Main method
    public static void main(String[] args) {
        Closet mainCloset = new Closet();
        Closet guestRoomCloset = new Closet();

        //At the moment both closets are empty
        System.out.printf("There are %d clothes in the main closet%n", mainCloset.getNumberOfClothes());
        System.out.printf("There are %d clothes in the guest room closet%n", guestRoomCloset.getNumberOfClothes());

        //Hanging a red shirt in my mainClose.
        mainCloset.hangCloth("Red Shirt");

        //Hanging my Pink faux fur coat in the guest room closet
        guestRoomCloset.hangCloth("Pink Faux Fur Coat");

        //At the moment both closets have 1 item of clothing
        System.out.printf("There are %d clothes in the main closet%n", mainCloset.getNumberOfClothes());
        System.out.printf("There are %d clothes in the guest room closet%n", guestRoomCloset.getNumberOfClothes());

        //I am now ready to leave, and I want all my clothes.
        System.out.printf("Taking my '%s' from the main closet%n", mainCloset.getCloth());
        System.out.printf("Taking my '%s' from the guest room closet%n", guestRoomCloset.getCloth());

        //Both closets are empty again
        System.out.printf("There are %d clothes in the Main closet%n", mainCloset.getNumberOfClothes());
        System.out.printf("There are %d clothes in the Guest room closet%n", guestRoomCloset.getNumberOfClothes());

    }
}
