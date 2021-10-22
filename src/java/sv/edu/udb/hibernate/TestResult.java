/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.hibernate;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
/**
 *
 * @author ariel
 */
public class TestResult {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// TODO code application logic here
SessionFactory sesFact=HibernateUtil.getSessionFactory();
Session ses=sesFact.openSession();
ArrayList<Datosempleados> listaEmpleado= new ArrayList<Datosempleados>();
String sql="from Datosempleados";
listaEmpleado= (ArrayList<Datosempleados>) ses.createQuery(sql).list();
for(int i=0;i<listaEmpleado.size();i++){
Datosempleados empleado=(Datosempleados)listaEmpleado.get(i);
System.out.println(empleado.getId() + " " + empleado.getNombres() + " " + empleado.getApellidos() );
ses.close();
sesFact.close();
}
        
        
        
    }
    
}
