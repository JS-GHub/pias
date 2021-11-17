package pias.app.products;

import pias.EstablishmentManager;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;

public class DoChangeProductAttributes extends Command<EstablishmentManager> {
  DoChangeProductAttributes(EstablishmentManager receiver) {
    super(Label.CHANGE_PRODUCT_ATTRIBUTES, receiver);
  }

  @Override
  public final void execute() throws CommandException {
    
  }
}