package pias;

import java.util.*;

public class ClientManager {
  private List<Client> _activeClients = new ArrayList<>();
  private List<Client> _inactiveClients = new LinkedList<>();
  private Map<Integer, Client> _archivedClients = new HashMap<>();
}