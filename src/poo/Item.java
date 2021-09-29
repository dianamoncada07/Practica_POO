package src.poo;

import java.util.Date;

public class Item {
    public Double price;
    public Double tax;
    public String name;
    public Date expirationDate;

    public Double getTotalToPay() {
        return price + tax;

    }

    public void calculateTax() {
        tax = price * 19.0;
    }

        public Boolean canItBeSold() {
            Date today = new Date();
            return ! this.expirationDate.after(today);
        }
    }
