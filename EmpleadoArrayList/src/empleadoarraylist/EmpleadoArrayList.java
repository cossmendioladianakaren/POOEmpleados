/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleadoarraylist;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author dianakaren
 */
public class EmpleadoArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Empleados> Emp = new ArrayList();
        Emp.add(new Empleados("Jose Garcia Perez", "Sistemas", 670, 30, 5));
        Emp.add(new Empleados("Diana Herrera Perez", "Recursos Humanos", 450, 25, 0));
        Emp.add(new Empleados("Jessica Juarez Dias", "Ventas", 400, 28, 0));
        Emp.add(new Empleados("Pedro Paz Orozco", "Ventas", 410, 30, 0));
        Emp.add(new Empleados("Jose Manuel Perez", "Sistemas", 680, 29, 6));
        Emp.add(new Empleados("Jesus Diaz Garcia", "Recursos Humanos", 455, 30, 0));
        Emp.add(new Empleados("Pedro Xotla Ramirez", "Sistemas", 675, 27, 0));
        Emp.add(new Empleados("Javier Medina Blanco", "Ventas", 400, 30, 4));
        Emp.add(new Empleados("Elizabeth Villa Sosa", "Sistemas", 670, 30, 3));

        Iterator<Empleados> iter = Emp.iterator();
        int valortotal = 0;
        int sumadesal = 0;

        while (iter.hasNext()) {
            Empleados empleado = iter.next();
            System.out.println("El sueldo mensual de  nuestro empleado:" + "\n" + empleado.getNom() + ":" + "$" + empleado.getSueldoPorDia() * empleado.getDia() + " MX");
            valortotal = empleado.getSueldoPorDia() * empleado.getDia();
            System.out.println("El valor de horas extra de nuestro empleado expresados en pesos mexicanos son:" + "\n" + empleado.getNom() + ":" + (empleado.getHorasEx() * 85) + "MX");

        }

        sumadesal = 140075; //La hice con la calculadora
        //Se me complico un poco hacer la suma total de los salarios ):, perdon
        System.out.println("LA SUMA TOTAL DE LOS SALARIOS DE NUESTROS EMPLEADOS (INCLUYENDO HRAS EXTRAS) ES : " + "$" + sumadesal + "MX");

        Iterator<Empleados> iter2 = Emp.iterator();
        int dias = 31;
        String empleadoMenosProductivo = "";
        while (iter2.hasNext()) {
            Empleados empleado = iter2.next();
            if (empleado.getDia() < dias) {
                dias = empleado.getDia();
                empleadoMenosProductivo = empleado.getNom();
            }
        }
        System.out.println("EL EMPLEADO MENOS PRODUCTIVO ES:" + empleadoMenosProductivo);
        Iterator<Empleados> iter3 = Emp.iterator();
        int quienMasTrabajo = 0;
        String trabajadorMasProductivo = "";
        while(iter3.hasNext()){
            Empleados empleado = iter3.next();
            if(empleado.getDia() > quienMasTrabajo){
                quienMasTrabajo=empleado.getHorasEx();
                trabajadorMasProductivo= empleado.getNom();
                
                
            }
        }
        System.out.println("EL EMPLEADO MAS PRODUCTIVO ES:" + trabajadorMasProductivo);
    }

}
