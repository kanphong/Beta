/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketmachine;

import java.text.DecimalFormat;

/**
 *
 * @author NATWORPONGLOYSWAI
 */
public class TicketMachine {
    
    private double ticketPrice;
    private int numberOfTickets;
    private int numberOfCoins;
    private int customerCoins;
    
    public TicketMachine(int numberOfTickets){
        this.numberOfTickets = numberOfTickets;
    }
    public TicketMachine(double ticketPrice){
        this.ticketPrice = ticketPrice;
    }
    public TicketMachine(double ticketPrice, int numberOfTickets){
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    public double getTicketPrice() {
        return this.ticketPrice;
    }
    public void setTicketPrice(double ticketPrice){
        this.ticketPrice = ticketPrice;
    }
    
    public int getNumberOfTickets() {
        return this.numberOfTickets;
    }
    public int getNumberOfCoins() {
        return this.numberOfCoins;
    }
    public int getCustomerCoins() {
        return this.customerCoins;
    }
    
    public void receiveTicketsFromAdmin(int tickets){
        this.numberOfTickets += tickets;
    }
    public int giveAllCoinsToAdmin(){
        int machineCoins = this.numberOfCoins;
        this.numberOfCoins = 0;
        return machineCoins;
    }
    public void receiveCoinsFromCustomer(int coins){
        this.customerCoins += coins;
    }
    public int sellTicketsToCustomer(int tickets){
        double ticketsPrice = Math.ceil(this.ticketPrice * tickets);
        if (numberOfTickets < tickets){
            return -1;
        } else if (customerCoins < ticketsPrice){
            return -2;
        }
        this.customerCoins -= ticketsPrice;
        this.numberOfCoins += ticketsPrice;
        this.numberOfTickets -= tickets;
        
        return this.returnCoinsToCustomer();
    }
    public int returnCoinsToCustomer(){
        int returnedCustomerCoins = this.customerCoins;
        this.customerCoins = 0;
        return returnedCustomerCoins;
    }
    
    
    @Override
    public String toString() {
        DecimalFormat ticketPriceFormat = new DecimalFormat("#.00");
        return "TicketMachine{" + "ticket price=" +
                ticketPriceFormat.format(this.ticketPrice) + ", " +
                this.numberOfTickets + " tickets" + ", " +
                this.numberOfCoins + " coins" + ", " +
                "customer " + this.customerCoins + " coins}";
    }
}
