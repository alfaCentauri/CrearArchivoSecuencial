/**
 * La clase serializable Cuenta para almacenar registros como objetos.
 * Cuenta.java.
 * Creado el: 15/05/2019  4:22 pm.
 * Versión: 1.0.
 */
package creararchivosecuencial;

import java.io.Serializable;
/**
 * La clase serializable Cuenta para almacenar registros como objetos.
 * @author Ing. Ricardo Presilla
 * @version 1.0.
 */
public class Cuenta implements Serializable {
    /**Almacena el número de cuenta*/
    private int cuenta;
    /**Almacena el nombre del cliente*/
    private String primerNombre;
    /**Almacena el apellido del cliente*/
    private String apellidoPaterno;
    /**Almacena el saldo*/
    private double saldo;
    /** Inicializa un objeto Cuenta con valores predeterminados */
    public Cuenta() {
        this(0, "", "", 0.0); // llama a otro constructor
    }
    /** Inicializa un objeto Cuenta con los valores proporcionados */
    public Cuenta(int cuenta, String primerNombre, String apellidoPaterno, 
            double saldo){
        this.cuenta = cuenta;
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.saldo = saldo;
    }
    /** Establece el número de cuenta.
     * 
     * @param cuenta Tipo entero.
     */
    public void establecerCuenta(int cuenta){
        this.cuenta = cuenta;
    }
    /** Obtiene el número de cuenta. 
     * 
     * @return Regresa un entero con el número de cuenta.
     */
    public int obtenerCuenta(){
        return cuenta;
    }
    /** Establece el primer nombre.
     * 
     * @param primerNombre Tipo String.
     */
    public void establecerPrimerNombre(String primerNombre){
        this.primerNombre = primerNombre;
    }
    /** Obtiene el primer nombredel cliente.
     * 
     * @return Regresa un cadena con el primer nombre del cliente.
     */
    public String obtenerPrimerNombre(){
        return primerNombre;
    }
    /** Establece el apellido paterno del cliente.
     * 
     * @param apellidoPaterno Tipo String.
     */
    public void establecerApellidoPaterno(String apellidoPaterno){
        this.apellidoPaterno = apellidoPaterno;
    }
    /** Obtiene el apellido paterno del cliente.
     * 
     * @return Regresa una cadena con el apellido paterno del cliente.
     */
    public String obtenerApellidoPaterno(){
        return apellidoPaterno;
    }
    /** Establece el saldo.
     * 
     * @param saldo Tipo double.
     */
    public void establecerSaldo(double saldo){
        this.saldo = saldo;
    }
    /**
     * Obtiene el saldo.
     * @return Regresa un double con el saldo.
     */
    public double obtenerSaldo(){
        return saldo;
    }

}// Fin de la clase cuenta
