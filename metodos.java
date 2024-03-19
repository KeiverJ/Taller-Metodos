import java.util.Scanner;

public class metodos {
    /**
     Ejercicio 1: Cálculo de precios con descuento Escribe un metodo que reciba el precio de un producto y el 
     tanto por ciento de descuento, y te diga el precio con descuento. Por ejemplo, si el precio es 300 y el 
     descuento 20, el metodo retorna que el precio final con descuento es de 240.
     */

    public double descuento (double descuento, double precio){
        double descuentoFinal = precio * (descuento / 100);
        double precioFinal = precio - descuentoFinal;
        return precioFinal;
    }

    /**
     Ejercicio 2: Cálculo de área y perímetro. Escribe un metodo que reciba los dos lados de un rectángulo y el tipo 
     de calculo y retorne el cálculo del perímetro (suma de los lados) o el área (base por altura).
     */

    public double calculo (double ladoA, double ladoB, int tipo){
        double resultado;
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

    public double circunferencia (float radio, int tipoCalculo){
        double resultado = 0;
        if (tipoCalculo == 1){ //perimetro
            resultado = 2 * Math.PI * radio;
        } else if (tipoCalculo == 2) { //area
            resultado = Math.PI * Math.pow(radio, 2);
        } else if (tipoCalculo == 3){ //volumen
            resultado = (4 * Math.PI * Math.pow(radio, 3))/3;
        } else {
            return 0;
        }
        return resultado;
    }

    /**
     Ejercicio 5: Pasar de días, horas y minutos a segundos. Escribe un metodo que reciba los siguientes datos: días, horas y minutos. Y retorne con 
     la cantidad de segundos totales que son esos datos.
     */

    public double segundos (int dias, double horas, double minutos){
        double segundosDias = dias * 86400;
        double segundosHoras = horas * 3600;
        double segundosMinutos = minutos * 60;

        double segundosTotales = segundosDias + segundosHoras + segundosMinutos;

        return segundosTotales;
    }

    /**
     Ejercicio 6: Pasar de segundos a días, horas y minutos. Escribe un metodo que reciba los segundos y el tipo, y le retorne el número de días o horas o minutos
     */

    public double segundos2 (double segundos, int tipo){
        double resultado = 0;
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

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.print("Digite el numero del metodo a ejecutar: ");
        byte tipo = teclado.nextByte();
        metodos metodos = new metodos(); 

        switch (tipo) {
            case 1:
                double precioFinal = metodos.descuento(20, 300); 
                System.out.println("Precio final con descuento: " + precioFinal);
                double precioFinal2 = metodos.descuento(50, 500); 
                System.out.println("Precio final con descuento: " + precioFinal2);
                break;
            case 2:
                double calculo = metodos.calculo(5, 10, 1); 
                System.out.println("Perimetro del rectangulo: " + calculo);
                double calculo2 = metodos.calculo(5, 10, 2); 
                System.out.println("Area del rectangulo: " + calculo2);
                break;
            case 3:
                double cambio = metodos.cambio(50); 
                System.out.println("El cambio de dolares a euros es: " + cambio);
                double cambio2 = metodos.cambio(25); 
                System.out.println("El cambio de dolares a euros es: " + cambio2); 
                break;
            case 4:
                double circunferencia = metodos.circunferencia(7, 1); 
                System.out.println("El perimetro de la circunferencia es: " + circunferencia);
                double circunferencia2 = metodos.circunferencia(10, 3); 
                System.out.println("El volumen de la circuferencia es: " + circunferencia2); 
                break;
            case 5:
                double segundos = metodos.segundos(4, 3, 56); 
                System.out.println("La cantidad de segundos es: " + segundos);
                double segundos2 = metodos.segundos(10, 9.6, 20); 
                System.out.println("La cantidad de segundos es: " + segundos2); 
                break;  
            case 6:
                double segundosF = metodos.segundos2(76540, 2); 
                System.out.println("La cantidad de horas es: " + segundosF );
                double segundosF2 = metodos.segundos2(87652398, 1); 
                System.out.println("La cantidad de dias es: " + segundosF2); 
                break;
            default:
                System.out.println("Digite el numero correctamente.");
                break;
        }
    
        teclado.close();
    }

}
