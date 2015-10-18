package flexboxorderordersystem;
/**
 * @author UP687776
 */

import java.util.ArrayList;

public class Type4Box extends BoxTypes {
    
    /**
     * @param cardGrade
     * @param reinBottom
     * @param reinCorner
     * @param colourType 
     * This class is inherited by Box Class which contains business logic for the box type 4.
     * ArrayList of integer is used to store card grade, as list has been defined
     */
    public Type4Box(ArrayList<Integer> cardGrade, boolean reinBottom, 
            boolean reinCorner, int colourType) {
    
        super (cardGrade, reinBottom, reinCorner, colourType, 4);
    } 
}
    

