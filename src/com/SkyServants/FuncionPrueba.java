package com.SkyServants;

public class FuncionPrueba {

    public static void main(String[] args) {

        //Datos de entra 1
        double valorProducto = 75000; //Precio del producto en COP

        //Resultado obtenido de la funcion valorConIva
        double precioProducto = valorConIva(valorProducto);
        System.out.println("Precio del producto en Colombia es de:" + " " +precioProducto + " " +"COP");


        //Para la funcion de sobrecarga valorConIva si es un país diferente a Colombia

        //Datos de entrada 2
        double valorProducto2 = 20; //Precio produto en España en euros
        double iva = 0.21; //Valor del iva en España 21%

        //Es necesario ingregar dos datos en la funcion,nprecio e iva dependiendo el pais.
        double precioProducto2 = valorConIva(valorProducto2,iva);
        System.out.println("Precio del producto en España es de:" + " " + precioProducto2 + " " +"Euros");

    }


    public static double valorConIva(double valorProducto)
    {
      double iva = 0.19; //El iva en colombia es del 19%

      return  valorProducto += valorProducto * iva;

    }

    public static double valorConIva(double valorProducto, double iva)
    {
        return valorProducto += valorProducto * iva;
    }
}
