package byui.cit260.mormonTrail.control;

/**
 *
 * @author ChristopherSellers
 */
public class ItemControl {
    
    public static int calcFoodDraw(double stamina, double pace) {
        
        if(stamina < 1 || stamina > 5) {
            return -1;
        }
        
        if(pace < 1 || pace > 2) {
            return -2;
        }
        
        int foodDraw = (int)Math.round((((stamina/2)*pace)+2)*2);
        return foodDraw;
    }
    
    public static void addItem(String item, int qty) {
        System.out.println("You just added " + qty + " " + item + "(s)");
    }
    public static void subtractMoney() {
        System.out.println("subractMoney()");
    }
    
    public static void subtractItem(String item, int qty){
        System.out.println("You just sold " + qty + " " + item + "(s)");
    }
    public static void addMoney(){
        System.out.println("addMoney()");
    }
}
