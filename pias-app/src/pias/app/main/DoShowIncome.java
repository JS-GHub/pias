package pias.app.main;

import pias.EstablishmentManager;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;

public class DoShowIncome extends Command<EstablishmentManager> {
  DoShowIncome(EstablishmentManager receiver) {
    super(Label.SEE_INCOME, receiver);
  }

  @Override
  public final void execute() throws CommandException {
    
  }
}