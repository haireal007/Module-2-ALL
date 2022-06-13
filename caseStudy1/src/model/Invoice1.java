package model;

public class Invoice1 {
    Service service;
    double sum;

    public Invoice1() {
    }

    public Invoice1(Service service, double sum) {
        this.service = service;
        this.sum = sum;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Invoice1{" +
                "service=" + service +
                ", sum=" + sum +
                '}';
    }
}
