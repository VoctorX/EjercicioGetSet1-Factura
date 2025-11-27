
package ejercicio1;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Factura {
    private double cantidad;
    private double precio;
    private double descuento;
    private LocalDateTime fecha;
    private Cliente cliente;
    
    public Factura(){
        cantidad=0;
        precio=0;
        descuento=0;
        this.fecha= LocalDateTime.now();
        this.cliente=null;
    }
    public Factura(double cantidad, double precio, Cliente cliente){
        this.cantidad=cantidad;
        this.precio=precio;
        this.descuento=0;
        this.fecha= LocalDateTime.now();
        this.cliente=cliente;
    }
    public void setPrecio(double precio){
        this.precio=precio;
    }
    public double getPrecio(){
        return this.precio;
    }
    public void setCantidad(double cantiddad){
        this.cantidad=cantidad;
    }
    public double getCantidad(){
        return this.cantidad;       
    }
    
    public double calcularVenta(){
        double subtotal;
        double iva;
        double totalDescuento;
        double total;
        subtotal= cantidad*precio;
        totalDescuento= subtotal - (subtotal * descuento/100);
        iva= totalDescuento *0.19;
        total= totalDescuento + iva;
        return total;
    }
    
    public double calcularDescuento(){
        double subtotal = cantidad * precio;
        return subtotal * descuento / 100;
    }
    
    public double getDescuento(){
        return this.descuento;
    }
    
    public void setDescuento(double descuento){
        this.descuento=descuento;
    }
    
    public String getFecha(){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return fecha.format(formato);
    }
    
    public String getHora(){
        DateTimeFormatter formato= DateTimeFormatter.ofPattern("HH:mm");
        return fecha.format(formato);
    }
    
    public void setCliente(Cliente cliente){
        this.cliente=cliente;
    }
    public Cliente getCliente(){
        return this.cliente;
    }
    
}
