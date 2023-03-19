package Ej5.Uno;

public class Carrito {
    private Producto prod1 = null;
    private Producto prod2 = null;
    private Producto prod3 = null;



    //hice 3 constructores por si faltaba algun producto, nose si esta bien
    Carrito(){}
    Carrito(Producto prod1){
        this.prod1 = prod1;
    }

    Carrito(Producto prod1, Producto prod2){
        this.prod1 = prod1;
        this.prod2 = prod2;
    }

    Carrito(Producto prod1, Producto prod2, Producto prod3){
        this.prod1 = prod1;
        this.prod2 = prod2;
        this.prod3 = prod3;
    }
    public void agregoProducto(Producto prod){
        if(this.prod1 == null){
            this.prod1 = prod;
        } else if(this.prod2 == null){
            this.prod2 =prod;
        } else {
            this.prod3 = prod;
        }
    }

    public double costoFinal(){
        double costoFinal = 0;
        if(this.prod1!= null){
            costoFinal += this.prod1.getPrecio();
        }
        if(this.prod2!= null){
            costoFinal += this.prod2.getPrecio();
        }
        if (this.prod3!=null){
            costoFinal += this.prod3.getPrecio();
        }
        return costoFinal;
    }
}
