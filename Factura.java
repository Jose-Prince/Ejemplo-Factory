public abstract class Factura {
 
private int id;
private double importe;
private Carrito compras;
//agregración

public Carrito getCompras() {
    return this.compras;
}

public void setCompras(Carrito compras) {
    this.compras = compras;
}

 public int getId() {
 return id;
 }
 public void setId(int id) {
 this.id = id;
 }
 public double getImporte() {
 return importe;
 }
 public void setImporte(double importe) {
 this.importe = importe;
 }
 
 public abstract double getImporteIva();
}