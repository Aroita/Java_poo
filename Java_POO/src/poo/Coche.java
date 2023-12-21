package poo;

public class Coche {
    //declaro las variables del objeto coche
    
    //encapsular, ponemos private delante y asi no es visible y no se modificara esa variable en otro archivo
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso;
    

    //decirle cuales son sus valores con metodo constructor: Coche() (da un estado incial al objeto)
    public Coche() {
        ruedas=4;
        largo=2000;
        ancho=300;
        motor=1600;
        peso=500;


    }


    
}
