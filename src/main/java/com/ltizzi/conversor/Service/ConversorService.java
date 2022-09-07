package com.ltizzi.conversor.Service;

import com.ltizzi.conversor.Model.Moneda;

/**
 * @author ltizzi
 */
public interface ConversorService {

  public double convertirMoneda(Moneda origen, Moneda destino, double cantidad);
}
