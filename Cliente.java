package ejercicio1;
public class Cliente {
    private String nombre;
    private int id;
    private String telefono;
    private String email;
    
    public Cliente(){
        nombre="";
        id=0;
        telefono="";
        email="";
    }
    public Cliente(String nombre, int id, String telefono, String email){
        this.nombre= nombre;
        this.id= id;
        this.telefono=telefono;
        this.email=email;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    
    public String getTelefono(){
        return this.telefono;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getEmail(){
        return this.email;
    }
}