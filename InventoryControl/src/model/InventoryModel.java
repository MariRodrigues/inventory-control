package model;

import bean.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import utils.ConnectionFactory;

/**
 *
 * @author Pc
 */
public class InventoryModel {
    
    private Connection conexao;
    
    public InventoryModel () throws SQLException {
        this.conexao = ConnectionFactory.getInstance().getConnection();
    }
    
    public void InsertProduct (Product p) throws SQLException{
        String sql0 = "Select * from Sector where ID_SECTOR = 3";
        
        PreparedStatement ps0 = conexao.prepareStatement(sql0);
        ResultSet rs = ps0.executeQuery();
        
        String sql = "INSERT INTO product (NAME_PRODUCT, PRICE, ID_SECTOR) "
                + "values (?,?,?)";
        try (PreparedStatement ps = conexao.prepareStatement(sql)){
          ps.setString(1, p.getName());
          ps.setFloat(2, p.getPrice());
          ps.setInt(3, 3);
          ps.execute();
          ps.close();
          conexao.close();
        }
    }
    
    
}
