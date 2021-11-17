package pias.app.clients;

import pias.EstablishmentManager;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;

public class DoShowClientOrders extends Command<EstablishmentManager> {
  DoShowClientOrders(EstablishmentManager receiver) {
    super(Label.SEE_CLIENT_ORDERS, receiver);
  }

  @Override
  public final void execute() throws CommandException {
    
  }
}