package pias.app.main;

import pias.EstablishmentManager;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;

public class DoShowOutcome extends Command<EstablishmentManager> {
  DoShowOutcome(EstablishmentManager receiver) {
    super(Label.SEE_OUTCOME, receiver);
  }

  @Override
  public final void execute() throws CommandException {
    
  }
}