package pias.app.clients;

import pias.EstablishmentManager;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;

public class DoPaySomeOrders extends Command<EstablishmentManager> {
  DoPaySomeOrders(EstablishmentManager receiver) {
    super(Label.PAY_SOME_ORDERS, receiver);
  }

  @Override
  public final void execute() throws CommandException {
    
  }
}