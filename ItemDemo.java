class Item {
    // Code will go here
    static int objectCount = 0;
    String itemName;

    public Item(String itemName) {
        this.itemName = itemName;
        objectCount++;
    }

    public static void displayObjectCount() {
        System.out.println("Total objects created: " + objectCount);
    }

    public void displayItem() {
        System.out.println("Item: " + itemName);
    }

}
public class ItemDemo {
    public static void main(String[] args) {
        // Code will go here
        Item item1 = new Item("Laptop");
        Item item3 = new Item("Tablet");
        Item item2 = new Item("Smartphone");

        item1.displayItem();
        item3.displayItem();
        item2.displayItem();

        Item.displayObjectCount();
    }
}
