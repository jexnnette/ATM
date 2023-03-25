/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoatm1;

/**
 *
 * @author Sheyl
 */
public class Cuenta {
    private float saldo;
    private int numeroDeCuenta;
    private int nip;
    private float saldoFlotante;
    private Cliente cliente;
    
    
    Cuenta(){
    }
    
    public Cuenta (int numeroCuenta){
        if (numeroCuenta > 9999 && numeroCuenta < 100000){
            this.numeroDeCuenta = numeroCuenta;
        }else{
            System.out.println("Ingrese un numero de cuenta valido");
        }
    }

    /**
     * @return the saldo
     */
    public float getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the numeroDeCuenta
     */
    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    /**
     * @param numeroDeCuenta the numeroDeCuenta to set
     */
    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    /**
     * @return the nip
     */
    public int getNip() {
        return nip;
    }

    /**
     * @param nip the nip to set
     */
    public void setNip(int nip) {
        this.nip = nip;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public float consultar(int numeroDeCuenta){
    
    float consulta = 100000;
    
    return consulta;
    }

    /**
     * @return the saldoFlotante
     */
    public float getSaldoFlotante() {
        return saldoFlotante;
    }

    /**
     * @param saldoFlotante the saldoFlotante to set
     */
    public void setSaldoFlotante(float saldoFlotante) {
        this.saldoFlotante = saldoFlotante;
    }
    
    
 }        