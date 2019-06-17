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
public class Output extends Report {

    private Store Store;

    public Output(Store Store, int Id, int Quantity, java.util.Date Date, bean.Sector Sector, bean.Product Product) {
        super(Id, Quantity, Date, Sector, Product);
        this.Store = Store;
    }
    
    

    public Store getStore() {
        return Store;
    }

    public void setStore(Store Store) {
        this.Store = Store;
    }
}
