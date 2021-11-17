package pias.app.clients;

import pias.EstablishmentManager;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;

public class DoRemoveClient extends Command<EstablishmentManager> {
  DoRemoveClient(EstablishmentManager receiver) {
    super(Label.REMOVE_CLIENT, receiver);
  }

  @Override
  public final void execute() throws CommandException {
    
  }
}