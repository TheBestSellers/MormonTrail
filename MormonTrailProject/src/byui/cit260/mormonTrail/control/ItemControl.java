package byui.cit260.mormonTrail.control;

import byui.cit260.mormonTrail.exceptions.ItemControlException;
import byui.cit260.mormonTrail.model.Item;


/**
 *
 * @author ChristopherSellers, Sariah and Alyssa
 */
public class ItemControl {

    
    public static void calcFoodDraw(double stamina, double pace)
            throws ItemControlException {

        
        if(stamina < 1 || stamina > 5) {
            throw new ItemControlException("Stamina needs to be between 1 and 5");
        }
        
        if(pace < 1 || pace > 2) {
            throw new ItemControlException("Pace needs to be between 1 and 2");
        }
        
        int foodDraw = (int)Math.round((((stamina/2)*pace)+2)*2);
    }
    
    
    public static void addItem(String item, int qty)
            throws ItemControlException{
        
        if(qty < 1){
            throw new ItemControlException("Qty needs to be greater than 0");
        }
        
        if(item == null){
            throw new ItemControlException("You muse selet an item");
        }
        
        System.out.println("You just added " + qty + " " + item + "(s)");
    }
        
    
    public static void subtractMoney(String item, int qty) 
            throws ItemControlException {
        
        if(qty < 1){
            throw new ItemControlException("Qty needs to be greater than 0");
        }
        
        if(item == null){
            throw new ItemControlException("You muse selet an item");
        }
        
        Item[] items = GameControl.createItems();
        int total = 0;
        
        for(int iCount = 0; iCount < items.length; iCount++){
            if(items[iCount].getName() == item){
                total = total + ((items[iCount].getCost()) * (items[iCount].getQty()));
            }
            System.out.println(total);
        }
    }
    
    public static void subtractItem(String item, int qty)
            throws ItemControlException{
        
        if(qty < 1){
            throw new ItemControlException("Qty needs to be greater than 0");
        }
        
        if(item == null){
            throw new ItemControlException("You muse selet an item");
        }
        
        System.out.println("You just removed " + qty + " " + item + "(s)");
    }

    
    public static void subtractRiverItem(String item, int qty)
            throws ItemControlException{
        
        if(qty < 1){
            throw new ItemControlException("Qty needs to be greater than 0");
        }
        
        if(item == null){
            throw new ItemControlException("You muse selet an item");
        }
        System.out.println("You just dropped " + qty + " " + item + "(s)");
    }

    public static void addMoney(String item, int qty)
            throws ItemControlException{
        
        if(qty < 1){
            throw new ItemControlException("Qty needs to be greater than 0");
        }
        
        if(item == null){
            throw new ItemControlException("You muse selet an item");
        }
        System.out.println("addMoney()");
    }
// public static int sumWagonWeight(ItemControl.addItem() {
//           if(item == null) {
//            return -1;
//        }
//            int qty = 0;
//            int totalWeight = 0;
//           
//            for (Item[] item : item) {
//                    totalWeight += items.getTotalWeight();
//                  
//                } return totalWeight;
                
            //BEGIN
            //total = 0
            //FOR index = 0 TO list.length -1
            // total = total + list[index]
            //ENDFOR
            //RETURN total
            //END 
    //}
        
  
}
