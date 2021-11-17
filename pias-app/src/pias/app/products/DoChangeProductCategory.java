package pias.app.products;

import pias.EstablishmentManager;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;

public class DoChangeProductCategory extends Command<EstablishmentManager> {
  DoChangeProductCategory(EstablishmentManager receiver) {
    super(Label.CHANGE_PRODUCT_CATEGORY, receiver);
  }

  @Override
  public final void execute() throws CommandException {
    
  }
}