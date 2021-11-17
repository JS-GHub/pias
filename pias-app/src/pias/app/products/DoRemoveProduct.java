package pias.app.products;

import pias.EstablishmentManager;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;

public class DoRemoveProduct extends Command<EstablishmentManager> {
  DoRemoveProduct(EstablishmentManager receiver) {
    super(Label.REMOVE_PRODUCT, receiver);
  }

  @Override
  public final void execute() throws CommandException {
    
  }
}