package flexboxorderordersystem;
/**
 * @author UP687776
 */

import java.util.ArrayList;

public class FlexBoxOrderOrderSystem {

    private final PriceCalculation order = new PriceCalculation();
    private final ArrayList<BoxTypes> boxes = new ArrayList<>();
    
    /**
     * @param args the command line arguments
     * Initializing FlexBoxOrderOrderSystem
     */
    public static void main(String[] args) {
        new FlexBoxOrderOrderSystem();
    }
    
    /**
     * It holds and assign new method "Load Business Logic"
     * instantiation PresentationForm class by creating it to new object
     */
    public FlexBoxOrderOrderSystem()
    {
        loadBusinessLogic();
        
        PresentationFrame form = new PresentationFrame(boxes);
        form.setVisible(true);
    }
    
    /**
     * This method holds the business logic for box type
     * ArrayList has been used to define add the card grade and box Type
     * False, False, 0 holds the value of reinforced bottom, reinforced Corner and colourType
     * in each ArrayList defined
     */
    
    public void loadBusinessLogic () {
        
        ArrayList <Integer> box1CardGrade = new ArrayList<>();
        box1CardGrade.add(1);
        box1CardGrade.add(2);
        box1CardGrade.add(3);
        boxes.add(new Type1Box(box1CardGrade, false, false, 0));
        
        ArrayList <Integer> box2CardGrade  = new ArrayList<>();
        box2CardGrade.add(2);
        box2CardGrade.add(3);
        box2CardGrade.add(4);
        boxes.add(new Type2Box(box2CardGrade, false, false, 1));
        
        ArrayList <Integer> box3CardGrade  = new ArrayList<>();
        box3CardGrade.add(2);
        box3CardGrade.add(3);
        box3CardGrade.add(4);
        box3CardGrade.add(5);
        boxes.add(new Type3Box(box3CardGrade, false, false, 2));

        ArrayList <Integer> box4CardGrade  = new ArrayList<>();
        box4CardGrade.add(2);
        box4CardGrade.add(3);
        box4CardGrade.add(4);
        box4CardGrade.add(5);
        boxes.add(new Type3Box(box4CardGrade, true, false, 2));
        
        ArrayList <Integer> box5CardGrade  = new ArrayList<>();
        box5CardGrade.add(3);
        box5CardGrade.add(4);
        box5CardGrade.add(5);
        boxes.add(new Type5Box(box5CardGrade, true, true, 2));        
    }
}