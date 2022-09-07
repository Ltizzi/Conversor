# Conversor

Proyecto realizado a partir del primer Challenge de ALura sobre el idioma Java. La idea era desarrollar un simple conversor de monedas, utilizando la libreria Swing (con JOptionPane como motor) para una simple interfaz gráfica.

El programa se ejecuta y aparece una ventana con dos opciones: Conversión de monedas y conversión de temperatura. Esta primera versión convierte de pesos argentinos a una variedad de monedas (dolares, euros, rublos, reales, rupias, yenes, etc), pero la implementación en un servicio con parametros de moneda origen y moneda destino permite la futura implementación de la conversión entre cualquiera de las monedas. La conversión se estandariza utilizando el dólar como valor génerico de conversión.

Tanto las temperaturas y las monedas utilizan herencia, a partir de una clase madre (UnidadTemperatura y Moneda), de la que las clases hijas heredan el nombre, el símbolo (en temperatura, por ahora), y el valor en u$d (en monedas, para facilitar la conversión).

Con un servicio de conversión, cada tipo de unidad a convertir tiene su propio método que acepta un origen, un destino y una cantidad, por lo que desde el diseño, la reutilización de código estuvo como prioridad.

La interfaz gráfica es la sección más "caótica" del código, en la cuál con switch y varios casos, se resuelven los menues y las conversiones. 

Para futuras versiones pretendo seleccionar primero la unidad de origen y luego la de destino para poder hacer la conversión de cualquier moneda, además de agregar unidades de distancia y peso. 
