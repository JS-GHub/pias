package pias.app.clients;

import pias.EstablishmentManager;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;

public class DoPayAllOrders extends Command<EstablishmentManager> {
  DoPayAllOrders(EstablishmentManager receiver) {
    super(Label.PAY_ALL_ORDERS, receiver);
  }

  @Override
  public final void execute() throws CommandException {
    
  }
}