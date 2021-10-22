/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
        

/**
 *
 * @author ariel
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

        SessionFactory sesFact = HibernateUtil.getSessionFactory();
        Session ses = sesFact.openSession();
        Transaction tra = ses.beginTransaction();
        
        Datosempleados datos = new Datosempleados();
        datos.setId(4);
        datos.setNombres("Ricardo");
        datos.setApellidos("Castillo");
        datos.setEdad(45);
        datos.setTelefono("61557674");
        datos.setDireccion("Soyapango");
        
        ses.delete(datos);
        tra.commit();
        ses.close();
        sesFact.close();
        
        
        
        
        
    }
    
}
