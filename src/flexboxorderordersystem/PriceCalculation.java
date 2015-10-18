package flexboxorderordersystem;
/**
 * @author UP687776
 */


/**
 * The PriceCalculation Class hold all of the base price, additional price and area method
 * to calculate the total cost of a selected box
 * 
 */
public class PriceCalculation {
    
    /**
     * @param area
     * @param cardGrade
     * Initial Box Base Price start from 0
     * @return Box Base Price
     */
    public double calculateBoxBasePrice (double area, int cardGrade) {
        double boxBasePrice = 0; 
        
        switch (cardGrade){
            case 1:
                boxBasePrice = 0.50 * area;
            break;
            case 2:
                boxBasePrice = 0.59 * area;
            break;
            case 3:
                boxBasePrice = 0.70 * area;
            break;
            case 4:
                boxBasePrice = 0.92 * area;
            break;
            case 5:
                boxBasePrice = 1.35 * area;
            break;       
        }
        return boxBasePrice;
    }
    
    /**
     * @param width
     * @param length
     * @param height
     * @return area
     * It Calculates the cost of the box
     * Length * width * height
     * Area is divided by 10000 to get the area in meter squared
     */
    public double area(int width, int length, int height) {
        
        double area = 2*((width * length) + (width * height) + (length * height));
        return area / 10000;
    }

    /**
     * @param boxBasePrice
     * @param colourPrint
     * @param reinBottom
     * @param reinCorner
     * @param sealTop
     * @return Total Cost 
     * It calculates all the additional Prices of the Box
     * If statements are used to sort out if correct box is selected
     */

    public double calculatBoxAdditionalsPrice(double boxBasePrice, int colourPrint, 
            boolean reinBottom, boolean reinCorner, boolean sealTop) {
        double totalCost = boxBasePrice;

        if(colourPrint == 1)
             totalCost += boxBasePrice * 0.12;
        else if(colourPrint == 2)
             totalCost += boxBasePrice * 0.15;
         
        if(reinBottom)
             totalCost += boxBasePrice * 0.12;

        if(reinCorner)
             totalCost += boxBasePrice * 0.08;
         
        if(sealTop)
             totalCost += boxBasePrice * 0.06;

        return totalCost;
    }
}
