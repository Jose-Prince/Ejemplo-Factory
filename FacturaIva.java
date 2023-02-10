public class FacturaIva extends Factura{
    //Herencia se aplica con Factura
 
@Override
 public double getImporteIva() {

    
 return getImporte()*1.12;
 }
 
}
