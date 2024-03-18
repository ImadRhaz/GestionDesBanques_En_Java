package com.xyz.comp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class Program {

    public static void main(String[] args) throws ParseException {
        Client client = new Client(1, "IMAD", "RHAZOUANI");
        Compte compte = new Compte(1, "A1234", client);
        client.setCompte(compte);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Operation op1 = new Operation(sdf.parse("2024-03-18"), "VERS", 4000.0,compte);
        compte.addOperation(op1);

        Operation op2 = new Operation(sdf.parse("2024-03-18"), "VERS", 5000.0,compte);
        compte.addOperation(op2);

        Operation op3 = new Operation(sdf.parse("2024-03-19"), "RET", 4000.0,compte);
        compte.addOperation(op3);

        Operation op4 = new Operation(sdf.parse("2024-03-19"), "VERS", 5000.0,compte);
        compte.addOperation(op4);
        System.out.println("Test");
        afficher(compte);
    }

    public static void afficher(Compte compte) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Client " + compte.getClient().getNom() + " " + compte.getClient().getPrenom());
        System.out.println("Compte " + compte.getNumero());
        System.out.println("Opérations:");
        System.out.println("Date\tType\tMontant");

        List<Operation> operations = compte.getOperations();
        for (Operation op : operations) {
            System.out.println(sdf.format(op.getDate()) + "\t" + op.getType() + "\t" + op.getMontant());
        }
    }

        
        
    }

