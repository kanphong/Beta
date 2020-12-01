
import ticketmachine.TicketMachine;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NATWORPONGLOYSWAI
 */
public class TicketMachineDrvier {
    public static void main(String[] args) {
        TicketMachine tm = new TicketMachine(5.5, 2); 
        tm.receiveTicketsFromAdmin(3);
        tm.receiveTicketsFromAdmin(4);
        System.out.println(tm);
        tm.receiveCoinsFromCustomer(25);
        tm.receiveCoinsFromCustomer(12);
        System.out.println(tm);
        System.out.println(tm.sellTicketsToCustomer(5));
        System.out.println(tm);
        System.out.println(tm.giveAllCoinsToAdmin());
        System.out.println(tm); 
    }
}
