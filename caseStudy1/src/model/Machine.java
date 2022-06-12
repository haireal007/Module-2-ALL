package model;

public class Machine {
    private int id;
    private String name;
    private boolean status;
    private Service Service;
    private Invoice invoice;
    private double timein;
    private double timeout;
    private Account accountUser;

    public Machine() {
    }

    public Machine(int id, String name, boolean status, model.Service service, Invoice invoice, double timein, double timeout, Account accountUser) {
        this.id = id;
        this.name = name;
        this.status = status;
        Service = service;
        this.invoice = invoice;
        this.timein = timein;
        this.timeout = timeout;
        this.accountUser = accountUser;
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

    public model.Service getService() {
        return Service;
    }

    public void setService(model.Service service) {
        Service = service;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public double getTimein() {
        return timein;
    }

    public void setTimein(double timein) {
        this.timein = timein;
    }

    public double getTimeout() {
        return timeout;
    }

    public void setTimeout(double timeout) {
        this.timeout = timeout;
    }

    public Account getAccountUser() {
        return accountUser;
    }

    public void setAccountUser(Account accountUser) {
        this.accountUser = accountUser;
    }
}
