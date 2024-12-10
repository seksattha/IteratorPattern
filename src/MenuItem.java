public class MenuItem extends MenuComponent {
//    Leaf Class
    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }


    public double getPrice() {
        return price;
    }

    @Override
    public void print() {

        System.out.println(", " + getName());
        System.out.println(".- "+ getPrice());
    }



}
