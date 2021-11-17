package pias.app.products;

import pias.EstablishmentManager;

public class Menu extends pt.tecnico.uilib.menus.Menu{
  public Menu(EstablishmentManager receiver) {
    super(Label.TITLE, //
        new DoAddProduct(receiver), //
        new DoChangeProductAttributes(receiver), //
        new DoChangeProductCategory(receiver), //
        new DoRemoveProduct(receiver)
        );
  }
}