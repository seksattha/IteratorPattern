//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MenuComponent SizzlerMenu = new Menu("อาหารฝรั่ง");
        MenuComponent ZenMenu = new Menu("อาหารญี่ปุ่น");

        MenuComponent allMenus = new Menu("ALL MENUS");

        allMenus.add(SizzlerMenu);
        allMenus.add(ZenMenu);

        SizzlerMenu.add(new MenuItem("Steak", 399));
        SizzlerMenu.add(new MenuItem("Pork Shop", 299));


        ZenMenu.add(new MenuItem("Shushi set", 345));
        ZenMenu.add(new MenuItem("Curry Rice", 105));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();



    }
}