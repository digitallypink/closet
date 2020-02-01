package pink.digitally.learning.closet;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the closet class.
 * The characteristics of this class will simulate those of a standard wardrobe.
 */
public class Closet {
    //The primary aim would be to store clothes and retrieve them. So we need a variable to hold the collection of clothes.
    private List<String> clothes = new ArrayList<>();

    //We would need to be able to hang clothes
    public void hangCloth(String cloth) {
        clothes.add(cloth);
    }

    //For simplicity this method just returns the first item of clothing in the closet
    public String getCloth() {
        //This is to make sure that the closet is not empty before trying to get the item of clothing.
        if (!clothes.isEmpty()) {
            //This will remove the item of clothing from the wardrobe.
            return clothes.remove(0);
        }
        return "";
    }

    //It is nice to know the number of clothes in the closet
    public int getNumberOfClothes(){
        return clothes.size();
    }
}
