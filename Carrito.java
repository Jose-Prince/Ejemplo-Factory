public class Carrito {
    public int precioProducto1;
    public int precioProducto2;
    public int precioProducto3;


    public Carrito() {
        int precioProducto1;
        int precioProducto2;
        int precioProducto3;
    }





    public Carrito(int precioProducto1, int precioProducto2, int precioProducto3) {
        this.precioProducto1 = precioProducto1;
        this.precioProducto2 = precioProducto2;
        this.precioProducto3 = precioProducto3;
    }

    public int getPrecioProducto1() {
        return this.precioProducto1;
    }

    public void setPrecioProducto1(int precioProducto1) {
        this.precioProducto1 = precioProducto1;
    }

    public int getPrecioProducto2() {
        return this.precioProducto2;
    }

    public void setPrecioProducto2(int precioProducto2) {
        this.precioProducto2 = precioProducto2;
    }

    public int getPrecioProducto3() {
        return this.precioProducto3;
    }

    public void setPrecioProducto3(int precioProducto3) {
        this.precioProducto3 = precioProducto3;
    }

    public Carrito precioProducto1(int precioProducto1) {
        setPrecioProducto1(precioProducto1);
        return this;
    }

    public Carrito precioProducto2(int precioProducto2) {
        setPrecioProducto2(precioProducto2);
        return this;
    }

    public Carrito precioProducto3(int precioProducto3) {
        setPrecioProducto3(precioProducto3);
        return this;
    }





  

}
