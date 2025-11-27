package ejercicio1;
import java.io.IO;
import java.util.Random;
public class Ejercicio1 {

    public static void main(String[] args) {
        double totalApagar;
        Random random= new Random();
        
        IO.println("Introduce tu nombre: ");
        String nombre= IO.readln();
        IO.println("Introduce tu id: ");
        int id= Integer.parseInt(IO.readln());
        IO.println("Introduce tu numero telefonico: ");
        String telefono= IO.readln();
        IO.println("Introduce tu email: ");
        String email= IO.readln();
        Cliente cliente1 = new Cliente(nombre, id, telefono, email);
        
        IO.println("Introduzca la cantidad de articulos: ");
        int cantidad= Integer.parseInt(IO.readln());
        IO.println("Introduzca el precio: ");
        double precio= Double.parseDouble(IO.readln());
        
        Factura miFactura = new Factura (cantidad, precio,cliente1);
        
        IO.println("¿Deseas añadir descuentos? (1.Si)(2.No)");
        int op= Integer.parseInt(IO.readln());
        if(op == 1){
            IO.println("Introduce el porcentaje de descuento (ejemplo: 10 para 10%): ");
            double descuento = Double.parseDouble(IO.readln());
            miFactura.setDescuento(descuento);
        }
        
        totalApagar= (int)miFactura.calcularVenta();
        IO.println("");
        IO.println("-------FACTURA------");
        IO.println("Numero de Factura: "+random.nextInt(100));
        IO.println("Fecha: "+miFactura.getFecha());
        IO.println("Hora: "+miFactura.getHora());
        IO.println("--------------------");
        IO.println("Nombre: "+miFactura.getCliente().getNombre());
        IO.println("Id: "+miFactura.getCliente().getId());
        IO.println("Telefono: "+miFactura.getCliente().getTelefono());
        IO.println("Email: "+miFactura.getCliente().getEmail());
        IO.println("--------------------");
        IO.println("Datos de su compra:");
        IO.println("Cantidad: "+cantidad);
        IO.println("Precio unitario: "+precio);
        if (miFactura.getDescuento() > 0){
            IO.println("Descuento ("+miFactura.getDescuento() +"%): "+miFactura.calcularDescuento());
        }
        IO.println("El total de la factura es: "+totalApagar);
        IO.println("-------TENGA BUEN DIA------");
    }
    
}
