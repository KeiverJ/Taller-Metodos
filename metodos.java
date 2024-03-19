public class metodos {
    /**
     Ejercicio 1: Cálculo de precios con descuento Escribe un metodo que reciba el precio de un producto y el 
     tanto por ciento de descuento, y te diga el precio con descuento. Por ejemplo, si el precio es 300 y el 
     descuento 20, el metodo retorna que el precio final con descuento es de 240.
     */

    public float descuento (float descuento, float precio){
        float descuentoFinal = precio * (descuento / 100);
        float precioFinal = precio - descuentoFinal;
        return precioFinal;
    }

    /**
     Ejercicio 2: Cálculo de área y perímetro. Escribe un metodo que reciba los dos lados de un rectángulo y el tipo 
     de calculo y retorne el cálculo del perímetro (suma de los lados) o el área (base por altura).
     */

    public float calculo (float ladoA, float ladoB, byte tipo){
        float resultado;
        if (tipo == 1){ //perimetro
            resultado = (ladoA + ladoB) * 2;
        } else if (tipo == 2) { //area
            resultado = (ladoA * ladoB);
        } else {
            return 0;
        }
        return resultado;
    }

    /**
     Ejercicio 3: Cambio de dólares a euros. Suponiendo que 1 euro = 1.33250 dólares. Escribe un metodo que reciba un número 
     de dólares y retorne el calculo del cambio en euros.
     */

    public double cambio (float dolares){
        double valorCambio = 1.33250;
        double euros = dolares / valorCambio;
        return euros;
     }

    /**
     Ejercicio 4: Cálculo de perímetro de circunferencia, área del círculo, y volumen de la esfera. Suponiendo que pi = 3.1416. Escribe 
     un metodo que reciba el radio y el tipo de calculo, y retorne el cálculo del perímetro de la circunferencia (2*pi*r) o el área del círculo 
     (pi*r2 ) o el volumen de la esfera (V = 4*pi*r3 /3).
     */

    public double circunferencia (float radio, byte tipoCalculo){
        double resultado = 0;
        if (tipoCalculo == 1){ //perimetro
            resultado = 2 * Math.PI * radio;
        } else if (tipoCalculo == 2) { //area
            resultado = Math.PI * Math.pow(radio, 2);
        } else if (tipoCalculo == 3){ //volumen
            resultado = (4 / 3) * Math.PI * Math.pow(radio, 3);
        } else {
            return 0;
        }
        return resultado;
    }

    /**
     Ejercicio 5: Pasar de días, horas y minutos a segundos. Escribe un metodo que reciba los siguientes datos: días, horas y minutos. Y retorne con 
     la cantidad de segundos totales que son esos datos.
     */

    public float segundos (int dias, float horas, float minutos){
        float segundosDias = dias * 86400;
        float segundosHoras = horas * 3600;
        float segundosMinutos = minutos * 60;

        float segundosTotales = segundosDias + segundosHoras + segundosMinutos;

        return segundosTotales;
    }

    /**
     Ejercicio 6: Pasar de segundos a días, horas y minutos. Escribe un metodo que reciba los segundos y el tipo, y le retorne el número de días o horas o minutos
     */

    public float segundos2 (float segundos, byte tipo){
        float resultado = 0;
        switch (tipo) {
            case 1: //dias
                resultado = segundos / 86400;
                break;
            case 2: //horas
                resultado = segundos / 3600;
                break;
            case 3: //minutos
                resultado = segundos / 60;
                break;
            default:
                return 0;
        } 
        return resultado;
    }
}
