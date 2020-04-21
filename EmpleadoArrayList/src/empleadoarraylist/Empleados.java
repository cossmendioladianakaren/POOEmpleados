/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package empleadoarraylist;

/**
 *
 * @author dianakaren
 */
class Empleados {
    private String nom;
    private String dep;
    private int sueldoPorDia;
    private int dia;
    private int horasEx;

    public Empleados() {
    }

    public Empleados(String nom, String dep, int sueldoPorDia, int dia, int horasEx) {
        this.nom = nom;
        this.dep = dep;
        this.sueldoPorDia = sueldoPorDia;
        this.dia = dia;
        this.horasEx = horasEx;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public int getSueldoPorDia() {
        return sueldoPorDia;
    }

    public void setSueldoPorDia(int sueldoPorDia) {
        this.sueldoPorDia = sueldoPorDia;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getHorasEx() {
        return horasEx;
    }

    public void setHorasEx(int horasEx) {
        this.horasEx = horasEx;
    }
   
}
