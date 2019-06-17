package bean;

import java.util.Date;


/**
 *
 * @author Pc
 */
public class Report {
    private int Id, Quantity; //Id e quantidade
    private Date Date;
    private Sector Sector;
    private Product Product;

    public Report(int Id, int Quantity, Date Date, Sector Sector, Product Product) {
        this.Id = Id;
        this.Quantity = Quantity;
        this.Date = Date;
        this.Sector = Sector;
        this.Product = Product;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setAmount(int amount) {
        this.Quantity = amount;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public Sector getSector() {
        return Sector;
    }

    public void setSector(Sector Sector) {
        this.Sector = Sector;
    }
    
    public Product getProduct() {
        return Product;
    }

    public void setProduct(Product Product) {
        this.Product = Product;
    }

    
    
   
}
