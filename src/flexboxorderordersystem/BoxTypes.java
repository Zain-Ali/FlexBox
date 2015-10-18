package flexboxorderordersystem;
/**
 * @author UP687776
 */

/**
 * The Box Type Class inherit the Type1Box, Type2Box, Type3Box, Type4Box and Type5Box
 */
import java.util.ArrayList;

public class BoxTypes {
    
    private final boolean reinBottom, reinCorner;
    private final int colourType, boxType;
    private final ArrayList <Integer> cardGrades;
    
    /**
     * @param cardGrade
     * @param reinBottom
     * @param reinCorner
     * @param colourType
     * @param boxType 
     */
    
    public BoxTypes(ArrayList<Integer> cardGrade, boolean reinBottom, 
            boolean reinCorner, int colourType, int boxType) {
        
        this.cardGrades = cardGrade;
        this.reinBottom = reinBottom;
        this.reinCorner = reinCorner;
        this.colourType = colourType; //0, 1, 2
        this.boxType = boxType;
        
    }
    
    /**
    * @return Reinforced Bottom
    */
    public boolean hasReinBottom() {
        
        return reinBottom;
    }
    /**
    * @return Reinforced Corner
    */
    public boolean hasReinCorner() {
        
        return reinCorner;
    }

    /**
     * @return ColourType
     */
    public int getColourType() {
        
        return colourType;
    }
    
    /**
     * @param cardGrade
     * @return cardGrade and ArrayList is used to figure out which card grade has been selected
     */
    public boolean hasCardGrade(int cardGrade) {
        
        return cardGrades.contains (cardGrade);
    }
    
    /**
     * @return box type
     */
    public int getBoxType () {
        
        return boxType;
    }
}
