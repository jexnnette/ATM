/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoatm1;

/**
 *
 * @author Sheyl
 */
public abstract class Transaccion {
    
    private int monto; 

    /**
     * @return the monto
     */
    public int getMonto() {
        return monto;
    }

    /**
     * @param monto the monto to set
     */
    public void setMonto(int monto) {
        this.monto = monto;
    }
    
     public void ejecutar(){
        System.out.println("Se ejectuta la accion desde " +  this.getClass().getSimpleName());
    }
}
