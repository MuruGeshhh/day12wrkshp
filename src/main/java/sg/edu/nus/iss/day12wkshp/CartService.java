package sg.edu.nus.iss.day12wkshp;

import java.util.List;
import java.util.ArrayList;;

public class CartService {


    public List<item> getShoppingItems(){

        List<item> lstItems = new ArrayList<>();

        item itm = new item();
        itm.setItemName("Prada bag");
        itm.setQuantity(5);
        lstItems.add(itm);

        itm = new item();
        itm.setItemName("Chanel wallet");
        itm.setQuantity(2);
        lstItems.add(itm);
       
        itm = new item();
        itm.setItemName("Macbook Pro");
        itm.setQuantity(10);
        lstItems.add(itm);

        itm = new item();
        itm.setItemName("LV TOT BAG");
        itm.setQuantity(8);
        lstItems.add(itm);

        return lstItems;




        
    }
    
}
