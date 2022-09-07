package com.ltizzi.conversor.Vista;

import com.ltizzi.conversor.Model.Dolar;
import com.ltizzi.conversor.Model.Euro;
import com.ltizzi.conversor.Model.LibraEsterlina;
import com.ltizzi.conversor.Model.PesoArgentino;
import com.ltizzi.conversor.Model.Real;
import com.ltizzi.conversor.Model.Rublo;
import com.ltizzi.conversor.Model.Rupia;
import com.ltizzi.conversor.Model.Won;
import com.ltizzi.conversor.Model.Yen;
import com.ltizzi.conversor.Model.Yuan;
import com.ltizzi.conversor.Service.ConversorServiceImp;
import javax.swing.JOptionPane;

/**
 * @author ltizzi
 */
public class OpcionesConversion {

  ConversorServiceImp conServ = new ConversorServiceImp();

  public void convertirMonedas(double cantidad) {
    String opcion =
        (JOptionPane.showInputDialog(
                null,
                "Elige la moneda a la que deseas convertir tu dinero",
                "Monedas",
                JOptionPane.PLAIN_MESSAGE,
                null,
                new Object[] {
                  "De pesos a dólares",
                  "De pesos a euros",
                  "De pesos a libras esterlinas",
                  "De pesos a reales",
                  "De pesos a rublos",
                  "De pesos a rupias",
                  "De pesos a wones",
                  "De pesos a yenes",
                  "De pesos a yuanes",
                  "De dólares a pesos",
                  "De euros  a pesos",
                  "De libras esterlinas  a pesos",
                  "De reales  a pesos",
                  "De rublos  a pesos",
                  "De rupias  a pesos",
                  "De wones  a pesos",
                  "De yenes  a pesos",
                  "De yuanes  a pesos",
                },
                "Selección"))
            .toString();
    switch (opcion) {
      case "De pesos a dólares":
        {
          Dolar dolar = new Dolar(1);
          PesoArgentino peso = new PesoArgentino(1);
          double resultado = conServ.convertirMoneda(peso, dolar, cantidad);
          System.out.println(resultado);
          JOptionPane.showMessageDialog(null, "Tienes " + resultado + " dolares.");
          break;
        }
      case "De pesos a euros":
        {
          Euro euro = new Euro(1);
          PesoArgentino peso = new PesoArgentino(1);
          double resultado = conServ.convertirMoneda(peso, euro, cantidad);
          System.out.println(resultado);
          JOptionPane.showMessageDialog(null, "Tienes " + resultado + " euros.");
          break;
        }
      case "De pesos a libras esterlinas":
        {
          LibraEsterlina libra = new LibraEsterlina(1);
          PesoArgentino peso = new PesoArgentino(1);
          double resultado = conServ.convertirMoneda(peso, libra, cantidad);
          System.out.println(resultado);
          JOptionPane.showMessageDialog(null, "Tienes " + resultado + " libras.");
          break;
        }
      case "De pesos a reales":
        {
          Real real = new Real(1);
          PesoArgentino peso = new PesoArgentino(1);
          double resultado = conServ.convertirMoneda(peso, real, cantidad);
          System.out.println(resultado);
          JOptionPane.showMessageDialog(null, "Tienes " + resultado + " reales.");
          break;
        }
      case "De pesos a rublos":
        {
          Rublo rublo = new Rublo(1);
          PesoArgentino peso = new PesoArgentino(1);
          double resultado = conServ.convertirMoneda(peso, rublo, cantidad);
          System.out.println(resultado);
          JOptionPane.showMessageDialog(null, "Tienes " + resultado + " rublos.");
          break;
        }
      case "De pesos a rupias":
        {
          Rupia rupia = new Rupia(1);
          PesoArgentino peso = new PesoArgentino(1);
          double resultado = conServ.convertirMoneda(peso, rupia, cantidad);
          System.out.println(resultado);
          JOptionPane.showMessageDialog(null, "Tienes " + resultado + " rupias.");
          break;
        }
      case "De pesos a wones":
        {
          Won won = new Won(1);
          PesoArgentino peso = new PesoArgentino(1);
          double resultado = conServ.convertirMoneda(peso, won, cantidad);
          System.out.println(resultado);
          JOptionPane.showMessageDialog(null, "Tienes " + resultado + " wones.");
          break;
        }
      case "De pesos a yenes":
        {
          Yen yen = new Yen(1);
          PesoArgentino peso = new PesoArgentino(1);
          double resultado = conServ.convertirMoneda(peso, yen, cantidad);
          System.out.println(resultado);
          JOptionPane.showMessageDialog(null, "Tienes " + resultado + " yenes.");
          break;
        }
      case "De pesos a yuanes":
        {
          Yuan yuan = new Yuan(1);
          PesoArgentino peso = new PesoArgentino(1);
          double resultado = conServ.convertirMoneda(peso, yuan, cantidad);
          System.out.println(resultado);
          JOptionPane.showMessageDialog(null, "Tienes " + resultado + " yuanes.");
          break;
        }
      case "De dólares a pesos":
        {
          Dolar dolar = new Dolar(1);
          PesoArgentino peso = new PesoArgentino(1);
          double resultado = conServ.convertirMoneda(dolar, peso, cantidad);
          System.out.println(resultado);
          JOptionPane.showMessageDialog(null, "Tienes " + resultado + " pesos.");
          break;
        }
      case "De euros  a pesos":
        {
          Euro euro = new Euro(1);
          PesoArgentino peso = new PesoArgentino(1);
          double resultado = conServ.convertirMoneda(euro, peso, cantidad);
          System.out.println(resultado);
          JOptionPane.showMessageDialog(null, "Tienes " + resultado + " pesos.");
          break;
        }
      case "De libras esterlinas  a pesos":
        {
          LibraEsterlina libra = new LibraEsterlina(1);
          PesoArgentino peso = new PesoArgentino(1);
          double resultado = conServ.convertirMoneda(libra, peso, cantidad);
          System.out.println(resultado);
          JOptionPane.showMessageDialog(null, "Tienes " + resultado + " pesos.");
          break;
        }
      case "De reales  a pesos":
        {
          Real real = new Real(1);
          PesoArgentino peso = new PesoArgentino(1);
          double resultado = conServ.convertirMoneda(real, peso, cantidad);
          System.out.println(resultado);
          JOptionPane.showMessageDialog(null, "Tienes " + resultado + " pesos.");
          break;
        }
      case "De rublos  a pesos":
        {
          Rublo rublo = new Rublo(1);
          PesoArgentino peso = new PesoArgentino(1);
          double resultado = conServ.convertirMoneda(rublo, peso, cantidad);
          System.out.println(resultado);
          JOptionPane.showMessageDialog(null, "Tienes " + resultado + " pesos.");
          break;
        }
      case "De rupias  a pesos":
        {
          Rupia rupia = new Rupia(1);
          PesoArgentino peso = new PesoArgentino(1);
          double resultado = conServ.convertirMoneda(rupia, peso, cantidad);
          System.out.println(resultado);
          JOptionPane.showMessageDialog(null, "Tienes " + resultado + " pesos.");
          break;
        }
      case "De wones  a pesos":
        {
          Won won = new Won(1);
          PesoArgentino peso = new PesoArgentino(1);
          double resultado = conServ.convertirMoneda(won, peso, cantidad);
          System.out.println(resultado);
          JOptionPane.showMessageDialog(null, "Tienes " + resultado + " pesos.");
          break;
        }
      case "De yenes  a pesos":
        {
          Yen yen = new Yen(1);
          PesoArgentino peso = new PesoArgentino(1);
          double resultado = conServ.convertirMoneda(yen, peso, cantidad);
          System.out.println(resultado);
          JOptionPane.showMessageDialog(null, "Tienes " + resultado + " pesos.");
          break;
        }
      case "De yuanes  a pesos":
        {
          Yuan yuan = new Yuan(1);
          PesoArgentino peso = new PesoArgentino(1);
          double resultado = conServ.convertirMoneda(yuan, peso, cantidad);
          System.out.println(resultado);
          JOptionPane.showMessageDialog(null, "Tienes " + resultado + " pesos.");
          break;
        }
    }
  }
}
