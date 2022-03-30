package co.endava.app;

import co.endava.datos.Bebida;
import co.endava.datos.Comida;
import co.endava.datos.Producto;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AdministradorProductosTest {

    @Test
    void main() {

        //Inicio Validacion Metodo Producto
        //Datos de Prueba
        Integer idTest = 105;
        String nombreTest="Agua";
        Double precioTest = 1800.0;
        //Fin Datos de Prueba


        //Usando Metodos creados en clase Producto
        Producto p5 = new Producto(105, "Agua", 1800.0);

        //Validacion ID jUnit
        assertEquals(idTest,p5.getId());

        //Validacion Nombre jUnit
        assertEquals(nombreTest,p5.getNombre());

        //Validacion Descuento jUnit
        assertEquals(getDescuentoTest(precioTest),p5.getDescuento());
        //Fin Validacion Metodo Producto


        //Inicio Validacion Metodo Comida
        //Datos de Prueba
        Integer idTestComida = 103;
        String nombreTestComida="Pastel";
        Double precioTestComida = 2000.0;
        //Fin Datos de Prueba


        //Usando Metodos creados en clase Comida
        Comida p3 = new Comida(103, "Pastel", 2000, LocalDate.now().plusDays(0));

        //Validacion ID jUnit
        assertEquals(idTestComida,p3.getId());

        //Validacion Nombre jUnit
        assertEquals(nombreTestComida,p3.getNombre());

        //Validacion Descuento jUnit
        assertEquals(getDescuentoTest(precioTestComida),p3.getDescuento());
        //Fin Validacion Metodo Comida


        //Inicio Validacion Metodo Bebida
        //Datos de Prueba
        Integer idTestBebida = 104;
        String nombreTestBebida="Té";
        Double precioTestBebida = 1800.0;
        //Fin Datos de Prueba


        //Usando Metodos creados en clase Bebida
        Producto p4 = new Bebida(104, "Té", 1800);

        //Validacion ID jUnit
        assertEquals(idTestBebida,p4.getId());

        //Validacion Nombre jUnit
        assertEquals(nombreTestBebida,p4.getNombre());

        //Validacion Descuento jUnit
        assertEquals(getDescuentoTest(precioTestBebida),p4.getDescuento());
        //Fin Validacion Metodo Bebida

    }

    //Metodo propio para sacar Descuento para la prueba, diferente al de las clases
    public double getDescuentoTest(Double precioTest){
        return precioTest * 0.50;
    }



}