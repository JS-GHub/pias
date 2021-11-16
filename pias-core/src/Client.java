package pias;

import java.util.*;

public class Client {
  private int id;
  private String _name;
  private Map<Product, Integer> _orderHistory = new HashMap<>();
  private double _priceToPay;
  private Stack<Operation> _operationHistory = new Stack<>();
}