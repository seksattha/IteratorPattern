import java.util.ArrayList;
import java.util.List;
// A Composite class
public class Menu extends MenuComponent {
    List<MenuComponent> menuComponents =new ArrayList<MenuComponent>();
    String name;

    public Menu(String name) {
        this.name = name;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("\n" + getName());
        System.out.println("--------------");

        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }
}
