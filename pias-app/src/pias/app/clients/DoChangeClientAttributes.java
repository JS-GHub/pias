package pias.app.clients;

import pias.EstablishmentManager;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;

public class DoChangeClientAttributes extends Command<EstablishmentManager> {
  DoChangeClientAttributes(EstablishmentManager receiver) {
    super(Label.CHANGE_CLIENT_ATTRIBUTES, receiver);
  }

  @Override
  public final void execute() throws CommandException {
    
  }
}