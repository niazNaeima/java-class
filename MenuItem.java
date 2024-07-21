public class MenuItem {
    String foodName;
    double price;
    int rate;

    public MenuItem(String foodName, int price, int rate) {
        this.foodName = foodName;
        this.price = price;
        this.rate = rate;
    }
}

class Resturant {
    MenuItem [] menuItem;
    int index;

    public Resturant (int menuCapacity){
        this.menuItem=new MenuItem[menuCapacity];
        this.index =0;
    }
    public  void addItem(MenuItem item){
        for (int i = 0; i< index; i++){
            if (menuItem[i].equals(item)){
                System.out.println("Item Already Exists In Menu");
                return;
            }
        } if (index <menuItem.length){
            menuItem[index]=item;
            index++;
            System.out.println("Item Is Added To Menu");
        } else {
            System.out.println("Menu Is Full And Can Not Added more Items");
        }
    } public void removeItem(String name){
        for (int i = 0; i< index; i++){
            if (menuItem[i].foodName.equals(name)){
                menuItem[i]=menuItem[index]=null;
                index--;
                System.out.println("Item Of "+name+" Removed From Menu");
                return;
            }
        }
        System.out.println("No Item Exist for "+name+" In The Menu");
    }
    public void displayMenu(){
        for (int i = 0; i< index; i++){
            System.out.println(menuItem[i].foodName);
        }
    }

}