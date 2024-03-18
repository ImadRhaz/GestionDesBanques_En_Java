package com.xyz.comp;

import java.util.ArrayList;
import java.util.List;

public class Compte {
	 private int id;
	 private String numero;
	private double solde;
    private Client client;


	private List<Operation> operations = new ArrayList<Operation>();

    public List<Operation> getOperations() {
		return operations;
	}
    public void addOperation(Operation operation) {
    	operations.add(operation);
    	if (operation.getType().equals("VERS")) 
    		solde+=operation.getMontant();
    	if (operation.getType().equals("VERS")) 
    		solde -= operation.getMontant();    		
    	
    }


    
  public Compte() {
	  solde=0;
  }

public Compte(int id, String numero, Client client) {
	super();
	this.id = id;
	this.numero = numero;
	this.solde = 0;
	this.client = client;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getNumero() {
	return numero;
}

public void setNumero(String numero) {
	this.numero = numero;
}

public double getSolde() {
	return solde;
}

public void setSolde(double solde) {
	this.solde = solde;
}

public Client getClient() {
	return client;
}

public void setClient(Client client) {
	this.client = client;
}
  
  
    
}
