/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoatm1;

/**
 *
 * @author Sheyl
 */
public class ATM {
    
     private Dispensador oDispensador;
     private Pantalla oPantalla;
     private RanuraDeDeposito oRanora;
     private Teclado oTeclado;
     private Transaccion oDeposito;
     private Transaccion oRetiro;
     private Cuenta oCuenta;
     private int SaldoATM;

    public ATM() {
        this.oDispensador = new Dispensador();
        this.oPantalla = new Pantalla();
        this.oRanora = new RanuraDeDeposito();
        this.oTeclado = new Teclado();
        this.oDeposito = new Deposito();
        this.oRetiro = new Retiro();
        this.oCuenta = new Cuenta();
        this.SaldoATM = 100000;
        this.inicializar();
    }
    
    public void despositar(int monto) {
    this.oDeposito.ejecutar();
    }
    
    public void mostrarSaldo(int numeroDeCuenta){
        float Saldo = 0;
        Saldo = oCuenta.getSaldo();
        float saldoFlotante;
        saldoFlotante = oCuenta.getSaldoFlotante();
        float saldoTotal = saldoFlotante + Saldo;
        this.oPantalla.mostrarMensaje(String.format("Ver saldo disponible %s \n", Saldo));
        this.oPantalla.mostrarMensaje(String.format("Saldo flotante %s \n", saldoFlotante));
        this.oPantalla.mostrarMensaje(String.format("Saldo total %s \n", saldoTotal));
        
    }
    
    public void retirar(int monto){
        this.oRetiro.ejecutar();
        
    }
    
    public boolean autenticar(int nip, int numeroDeCuenta){
    this.oPantalla.mostrarMensaje(String.format("El numero de cuenta que se ingresó es: %s \nTu nip es: %s\n", numeroDeCuenta, nip));
    return true;
    }
    
    public void ejecutar(int opcion, int cuenta){
        int monto;
        switch (opcion){
            case 1:
                this.mostrarSaldo(cuenta);
                break;
            case 2:
                this.oPantalla.mostrarMensaje("Ingrese un monto a retirar: ");
                monto = this.oTeclado.recibirEntrada();
                this.retirar(monto);
                break;
            case 3:
                this.oPantalla.mostrarMensaje("Ingrese un monto a depositar: ");
                monto = this.oTeclado.recibirEntrada();
                break;
            case 4:
                this.oPantalla.mostrarMensaje("Ha salido del programa");
                break;
            default:
                this.oPantalla.mostrarMensaje("Ingrese una opcion valida");
                break;
        }
    }
    
    private void inicializar(){
        int nip = 0;
        int numeroDeCuenta = 0;
        int op;
        this.oCuenta.setSaldo(100000);
        this.oPantalla.mostrarMensaje("Bienvenido a servicios de cajero ");
        
        this.oPantalla.mostrarMensaje("Ingrese numero de cuenta: ");
        numeroDeCuenta = this.oTeclado.recibirEntrada();
        
        this.oPantalla.mostrarMensaje("Ingrese nip: ");
        nip = this.oTeclado.recibirEntrada();
        
        this.autenticar(nip, numeroDeCuenta);
        this.oPantalla.mostrarMenu();
        op = this.oTeclado.recibirEntrada();
        
        this.ejecutar(op, numeroDeCuenta);
    }

    /**
     * @return the SaldoATM
     */
    public int getSaldoATM() {
        return SaldoATM;
    }

    /**
     * @param SaldoATM the SaldoATM to set
     */
    public void setSaldoATM(int SaldoATM) {
        this.SaldoATM = SaldoATM;
    }
}

