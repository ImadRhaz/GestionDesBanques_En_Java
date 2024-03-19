package com.xyz.comp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class Program {

    public static void main(String[] args) throws ParseException {
        Client client = new Client(1, "IMAD", "RHAZOUANI"); // Creer d'abord Client
        Compte compte = new Compte(1, "A1234", client);// Puis Creer Compte
        client.setCompte(compte); // Associer le compte au client

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Operation op1 = new Operation(sdf.parse("2024-03-18"), "VERS", 4000.0,compte);//Creer L'operation voulu
        compte.addOperation(op1); // Associer l'operation au compte 

        Operation op2 = new Operation(sdf.parse("2024-03-18"), "VERS", 5000.0,compte);
        compte.addOperation(op2);

        Operation op3 = new Operation(sdf.parse("2024-03-19"), "RET", 4000.0,compte);
        compte.addOperation(op3);

        Operation op4 = new Operation(sdf.parse("2024-03-19"), "VERS", 5000.0,compte);
        compte.addOperation(op4);
        System.out.println("Test");
        afficher(compte); // Faire Appel a la Methode afficher 
    }

    public static void afficher(Compte compte) { // Creer une methode statique => Afin de l'appeler sans creer un Objet de la class Program
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

