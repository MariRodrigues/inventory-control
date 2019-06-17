/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.Product;
import java.sql.SQLException;
import model.InventoryModel;

/**
 *
 * @author Pc
 */
public class InventoryController {
    
    public void InsertProduct (Product p) throws SQLException{
        InventoryModel ip = new InventoryModel();
        ip.InsertProduct(p);
    }
    
}
