/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author ferviu
 */
public class CCuenta {
        private String nombre; 
        private String cuenta;
        private Double saldo; 
        private Double tipoInteres;
        
        //Constructor vacio
        public CCuenta()  {
        
    }
        //Constructor con parámetros
        public CCuenta (String nombre, String cuenta, double saldo, double tipoDeInteres) throws Exception
    {
        if(nombre.equals("")) throw new Exception("Nombre vacio");
        else this.nombre=nombre;
        if(cuenta.equals("")) throw new Exception("Cuenta vacia");
        else this.cuenta=cuenta;        
        if(saldo<0) throw new Exception("Saldo Negativo");
        else this.saldo=saldo;
        if(tipoDeInteres<0) throw new Exception("Tipo de Interes negativo");
        else this.tipoInteres=tipoDeInteres;
    }
        
        
    //Gets y sets
        
    public void setNombre(String nombre) throws Exception {
        if(nombre.equals("")) throw new Exception("Nombre vacío");
        else this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCuenta(String cuenta) throws Exception {
        if(cuenta.equals("")) throw new Exception ("Cuenta Vacia");
        else this.cuenta = cuenta;
        
    }
    

    public String getCuenta() {
        return cuenta;
    }

    public void setSaldo(Double saldo) throws Exception {
        if(saldo < 0)
            throw new Exception ("Saldo negativo");
        else this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setTipoInteres(Double tipoInteres) throws Exception {
        if (tipoInteres <= 0)
            throw new Exception ("El tipo de interes no puede ser 0 o menos de 0");
        else this.tipoInteres = tipoInteres;
    }

    public  Double getTipoInteres() {
        return tipoInteres;
    }
    
    public void Ingreso(Double cantidad) throws Exception {
        if(cantidad <= 0)
            throw new Exception ("La cantidad del ingreso no puede ser 0 o menos");
        else saldo = saldo + cantidad;
    }
    
    public void Reintegro (Double cantidad) throws Exception {
        if(cantidad > saldo) throw new Exception ("El reintegro es mayor que el saldo");
        else saldo = saldo - cantidad;
    }
        
        
}
