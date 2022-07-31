
/**
 * Write a description of class Producto here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Producto
{
    // instance variables - replace the example below with your own
    private String codigo;
    private String nombre;
    private int precio;
    private int stock;

    /**
     * Constructor for objects of class Producto
     */
    public Producto()
    {
        // initialise instance variables
        this.codigo="";
        this.nombre="";
        this.precio=0;
        this.stock=0;
    }

    public Producto(String codigo, String nombre, int precio, int stock)
    {
        // initialise instance variables
        this.codigo=codigo;
        this.nombre=nombre;
        this.precio=precio;
        this.stock=stock;
    }
    
    public String getCodigo()
    {
    return this.codigo;
    }
    
    public void setCodigo()
    {
    this.codigo=codigo;
    }
    
    public String getNombre()
    {
    return this.nombre;
    }
    
    public void setNombre()
    {
    this.nombre=nombre;
    }
    
    public int getPrecio()
    {
    return this.precio;
    }
    
    public void setPrecio()
    {
    this.precio=precio;
    }
    
    public int getStock()
    {
    return this.stock;
    }
    
    public void setStock()
    {
    this.stock=stock;
    }
    
    public int Vender(int cantidad)
    {
    int total=0;
    //evalua que la cantidad a vender sea mayor o igual al stock
    if(this.stock>=cantidad)
    {
    total=this.precio*cantidad;//calcula total
    this.stock=this.stock-cantidad;//actualiza stock
    }
    return total;
    }
}
