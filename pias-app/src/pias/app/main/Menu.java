package pias.app.main;

import pias.EstablishmentManager;
import pt.tecnico.uilib.menus.DoOpenMenu;

public class Menu extends pt.tecnico.uilib.menus.Menu {
  public Menu(EstablishmentManager receiver) {
    super(Label.TITLE, //
        new DoShowIncome(receiver), //
        new DoShowOutcome(receiver), //
        new DoOpenMenu(Label.OPEN_MENU_PRODUCTS, new pias.app.products.Menu(receiver)), //
        new DoOpenMenu(Label.OPEN_MENU_CLIENTS, new pias.app.clients.Menu(receiver)) //
        );
  }
}