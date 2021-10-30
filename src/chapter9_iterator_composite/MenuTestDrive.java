package chapter9_iterator_composite;

public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu  pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }
}
