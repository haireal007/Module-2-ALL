package model;

import java.io.Serializable;
import java.util.Date;

public class Computer implements Serializable {
    private int id;
    private String name;
    private boolean status;
    private Invoice1 invoice;
    private Date timein;
    private Date timeout;
    private Account accountUser;
    private  double priceNet1h;

    public Computer()  {
    }

    public Computer(int id, String name, boolean status, Invoice1 invoice, Date timein, Date timeout, Account accountUser, double priceNet1h) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.invoice = invoice;
        this.timein = timein;
        this.timeout = timeout;
        this.accountUser = accountUser;
        this.priceNet1h = priceNet1h;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Invoice1 getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice1 invoice) {
        this.invoice = invoice;
    }

    public Date getTimein() {
        return timein;
    }

    public void setTimein(Date timein) {
        this.timein = timein;
    }

    public Date getTimeout() {
        return timeout;
    }

    public void setTimeout(Date timeout) {
        this.timeout = timeout;
    }

    public Account getAccountUser() {
        return accountUser;
    }

    public void setAccountUser(Account accountUser) {
        this.accountUser = accountUser;
    }

    public double getPriceNet1h() {
        return priceNet1h;
    }

    public void setPriceNet1h(double priceNet1h) {
        this.priceNet1h = priceNet1h;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", invoice=" + invoice +
                ", timein=" + timein +
                ", timeout=" + timeout +
                ", accountUser=" + accountUser +
                ", priceNet1h=" + priceNet1h +
                '}';
    }
}
