package pias.app;

import pias.*;
import pt.tecnico.uilib.Dialog;
import pt.tecnico.uilib.menus.Menu;

public class App {
  public static void main(String[] args) {
    EstablishmentManager piasManager = new EstablishmentManager();

    String dataFile = System.getProperty("import");
    if (dataFile != null) {
      piasManager.importFile(dataFile);
    }

    Menu menu = new pias.app.main.Menu(piasManager);
    menu.open();
  }
}