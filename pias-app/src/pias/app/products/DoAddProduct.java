package pias.app.products;

import pias.EstablishmentManager;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;

public class DoAddProduct extends Command<EstablishmentManager> {
  DoAddProduct(EstablishmentManager receiver) {
    super(Label.ADD_PRODUCT, receiver);
  }

  @Override
  public final void execute() throws CommandException {
    
  }
}