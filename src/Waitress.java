public class Waitress {
    WesternHouseMenu westernHouseMenu;

    public Waitress(WesternHouseMenu westernHouseMenu) {
        this.westernHouseMenu = westernHouseMenu;
    }

    public void printMenu() {
        Iterator westernIterator = westernHouseMenu.createIterator();
        System.out.println("อาหารฝรั่ง");
        printMenu(westernIterator);

    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.println(menuItem.getName() + " ,");
            System.out.println(menuItem.getPrice() + " .-");
        }
    }
}
