package Driver;

import Model.Aplikasi;
import Console.Console;


public class Driver {

    public static void main(String[] args) {
     
        Aplikasi app = new Aplikasi();
        
        Console view = new Console(app);
        view.mainMenu();
    }
}
