 
public class Principal {
 
 public static void main(String[] args) {
 
 Factura f = FactoriaFacturas.getFactura("iva");
 //Dependencia

 f.setId(1);
 f.setImporte(100);
 System.out.println(f.getImporteIva());

 System.out.println("Reseteando...");



 }


 
}