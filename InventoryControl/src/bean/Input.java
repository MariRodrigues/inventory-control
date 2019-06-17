/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Pc
 */
public class Input extends Report {
    private Provider Provider;

    public Input(Store Store, int Id, int Quantity, java.util.Date Date, bean.Sector Sector, bean.Product Product) {
        super(Id, Quantity, Date, Sector, Product);
        this.Provider = Provider;
    } 

    public Provider getProvider() {
        return Provider;
    }

    public void setProvider(Provider Provider) {
        this.Provider = Provider;
    }
    
    
}
