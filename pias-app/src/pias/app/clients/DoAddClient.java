package pias.app.clients;

import pias.EstablishmentManager;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;

public class DoAddClient extends Command<EstablishmentManager> {
  DoAddClient(EstablishmentManager receiver) {
    super(Label.ADD_CLIENT, receiver);
  }

  @Override
  public final void execute() throws CommandException {
    
  }
}