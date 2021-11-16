package com.casestudies;

public class CaseStudy2 {

    public static double calculateTicket(int ticketNumber, Category category){
        double total;
        if(category == Category.SILVER){
            total = ticketNumber * 150;
        }else {
            total = ticketNumber * 200;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println( CaseStudy2.calculateTicket(2, Category.SILVER));
        System.out.println( CaseStudy2.calculateTicket(2, Category.GOLDEN));
    }
}
