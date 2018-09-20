/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackagePdh;

import java.util.List;
import model.Barang;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Yurike
 */
public class ProductHelper {
    Session sess;
    Transaction trx;
    
    public void disconnect(){
        trx.commit();
    }
    public int runQuery(String query){
        SQLQuery q = sess.createSQLQuery(query);
        return q.executeUpdate();
    }
    public List getData(){
        SQLQuery q = sess.createSQLQuery("select * from masterbarang");
        q.addEntity(Barang.class);
        return (List<Barang>)q.list();
    }
}
