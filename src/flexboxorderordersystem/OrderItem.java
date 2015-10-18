package flexboxorderordersystem;
/**
 * @author UP687776
 */
public class OrderItem {
    
    private int width;
    private int length;
    private int height;
    private int cardGrade;
    private int colourType;
    private boolean reinBottom;
    private boolean reinCorner;
    private boolean sealTop;
    private int quantity;
    
    /**
     * Default Constructor
     */
    public OrderItem() {
    }
    
    /**
     * @return width of box order
     */
    public int getWidth () {
        
        return width;
    }
    
    /**
     * @return length of box order
     */
    public int getLength () {
        
        return length;
    }
    
    /**
     * @return height of box order
     */
    public int getHeight () {
        
        return height;
    }
    
    /**
     * @return cardGrade of box order
     */
    public int getCardGrade () {
        
        return cardGrade;
    }
    
    /**
     * @return colourType of box order
     * This checks if colourType has been selected
     */
    public int hasColourType () {
        
        return colourType;
    }
    
    /**
     * @return reinforced bottom of box order
     * check if it has reinforced bottom
     */
    public boolean hasReinBottom () {
        
        return reinBottom;
    }
    
    /**
     * @return reinforced corner of box order
     * check if it has reinforced corner
     */
    public boolean hasReinCorner () {
        
        return reinCorner;
    }
    
    /**
     * @return 
     */
    public boolean getSealTop () {
        
        return sealTop;
    }
    
    /**
     * @return quantity
     * Check the quantity of the box
     */
    public int getQuantity() {
        
        return quantity;
    }
    
    /**
     * Here it will include all the set methods, where it will 
     * store the method will be assigned to its parameter
     */
    
    /**
     * @param width 
     */
    public void setWidth (int width) {
        
        this.width = width;
    }
    
    /**
     * @param length 
     */
    public void setLength (int length) {
        
        this.length = length;
    }
    
    /**
     * @param height 
     */
    public void setHeight (int height) {
        
        this.height = height;
    }
    
    /**
     * @param cardGrade 
     */
    public void setCardGrade (int cardGrade) {
        
        this.cardGrade = cardGrade;
    }
    
    /**
     * @param colourType 
     */
    public void setColourType (int colourType) {
        
        this.colourType = colourType;
    }
    
    /**
     * @param reinBottom 
     */
    public void setReinBottom (boolean reinBottom) {
        
        this.reinBottom = reinBottom;
    }
    
    /**
     * @param reinCorner 
     */
    public void setReinCorner (boolean reinCorner) {
        
        this.reinCorner = reinCorner;
    }
    
    /**
     * @param sealTop 
     */
    public void setSealTop (boolean sealTop) {
        
        this.sealTop = sealTop;
    }
    
    /**
     * @param quantity 
     */
    public void setQuantity(int quantity) {
        
        this.quantity = quantity;
    }    
}
