package pias.app.clients;

import pias.EstablishmentManager;

public class Menu extends pt.tecnico.uilib.menus.Menu{
  public Menu(EstablishmentManager receiver) {
    super(Label.TITLE, //
        new DoAddClient(receiver), //
        new DoChangeClientAttributes(receiver), //
        new DoRemoveClient(receiver), //
        new DoShowClientOrders(receiver), //
        new DoPaySomeOrders(receiver), //
        new DoPayAllOrders(receiver)
        );
  }
}