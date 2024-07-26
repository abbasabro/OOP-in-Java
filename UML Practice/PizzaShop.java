package Model;
import java.util.*;

public class PizzaShop {

    PizzaShop() {
    }

    private String shopName;
   // private int phoneNo=911;
    private ArrayList<Pizza> flavoursOffered= new ArrayList<Pizza>();
    

   

    PizzaShop(String shopName, int phoneNo) {
        this.shopName=shopName;
        //this.phoneNo=phoneNo;
    }
    public void addFlavoursOffered(Pizza p){
        flavoursOffered.add(p);
    }
    public String getShopName(){
        return shopName;
    }

    public void displayFlavoursWithPrice() {
                // for(int i=0;i<flavoursOffered.size();i++) {
                // 	System.out.println(flavoursOffered.get(i).getFlavour());
                // }
                for(Pizza p: flavoursOffered){
                    System.out.println(p.getFlavour() +" : "+p.getPrice());
                    
                }
    }

    
    public short calculateAmount(String pizzas[]) {
        short amount=0;
        for(int i=0;i<flavoursOffered.size();i++){
        
        if(flavoursOffered.get(i).getFlavour()==pizzas[i]){
            amount+=flavoursOffered.get(i).getPrice();
        }
     }
             return amount;
    }

 
}