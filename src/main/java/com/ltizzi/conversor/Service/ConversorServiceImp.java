package com.ltizzi.conversor.Service;

import com.ltizzi.conversor.Model.Dolar;
import com.ltizzi.conversor.Model.Moneda;

/**
 * @author ltizzi
 */
public class ConversorServiceImp implements ConversorService {

  @Override
  public double convertirMoneda(Moneda origen, Moneda destino, double cantidad) {
    Dolar dolar = new Dolar();
    Class d = dolar.getClass();

    //    if (origen.getClass() == d) {
    //      System.out.println("test destino en usd " + destino.getValorEnUSD());
    //      System.out.println(cantidad * destino.getValorEnUSD());
    //      return Math.round(cantidad * destino.getValorEnUSD());
    //    } else if (destino.getClass() == d) {
    //      System.out.println("test destino en usd " + origen.getValorEnUSD());
    //      System.out.println(cantidad * origen.getValorEnUSD());
    //      return Math.round(cantidad * origen.getValorEnUSD());
    //    } else if (destino.getClass() == d && origen.getClass() == d) {
    //      System.out.println(cantidad);
    //      return cantidad;
    //    } else {
    double valorOrigenConvertido = origen.getValorEnUSD() * cantidad;
    double valorDestinoConvertido = Math.round(valorOrigenConvertido / destino.getValorEnUSD());
    System.out.println(valorDestinoConvertido);
    return valorDestinoConvertido;
    //    }
  }
}
