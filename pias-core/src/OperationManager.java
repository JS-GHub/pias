package pias;

import java.util.*;

public class OperationManager {
  private double _income = 0;
  private Map<Product, Integer> _outcome = new TreeMap<>();
  private List<Operation> _operationQueue = new LinkedList<>(); //TODO: figure out how to implement a queue (to receive messages from other devices)
  private Stack<Operation> _operationStack = new Stack<>();
  private List<Operation> _operationHistory = new LinkedList<>();
}