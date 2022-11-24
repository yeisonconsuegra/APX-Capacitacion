/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicas;

/**
 *
 * @author santi
 */
public class SucursalPaquete {
    public static void main(String[] args) {
          Paquete p1 = new Paquete(1234456, "JU8A98A", 9, 2, new Sucursal(1, "calle 12", "Pereira"));
          Sucursal s1 = new Sucursal();
          double x = s1.calcularPrecio(p1);
          System.out.println("El precio de su paquete es : "+x);
    }
    
    
    
    static class Sucursal{
        int numeroSucursal;
        String direccion;
        String ciudad;

        public Sucursal() {
        }
        

        public Sucursal(int numeroSucursal, String direccion, String ciudad) {
            this.numeroSucursal = numeroSucursal;
            this.direccion = direccion;
            this.ciudad = ciudad;
        }

        public int getNumeroSucursal() {
            return numeroSucursal;
        }

        public String getDireccion() {
            return direccion;
        }

        public String getCiudad() {
            return ciudad;
        }
        
        void mostarDatos(){
            System.out.println("El numero de la sucursal es : "+this.getNumeroSucursal());
            System.out.println("La direccion de la sucursal es : "+this.getDireccion());
            System.out.println("La cuidad de la sucursal es : "+this.getCiudad());
        }
        
        public double calcularPrecio(Paquete p){
            double precio;
            precio = p.getPeso();
            if(p.getPrioridad() == 1){
                precio += 10;
            }
            if(p.getPrioridad() == 2){
                precio += 20;
            }
            return precio;
        }
    }
    
    static class Paquete{
        int numeroPaquete;
        String dni;
        double peso;
        int prioridad;
        Sucursal sucursal;

        public Paquete(int numeroPaquete, String dni, double peso, int prioridad, Sucursal sucursal) {
            this.numeroPaquete = numeroPaquete;
            this.dni = dni;
            this.peso = peso;
            this.prioridad = prioridad;
            this.sucursal = sucursal;
        }

        public int getNumeroPaquete() {
            return numeroPaquete;
        }

        public String getDni() {
            return dni;
        }

        public double getPeso() {
            return peso;
        }

        public int getPrioridad() {
            return prioridad;
        }
        
        
        void mostrarDatos(){
            System.out.println("El numero del paquete es : "+this.getNumeroPaquete());
            System.out.println("El dni del paquete es : "+this.getDni());
            System.out.println("El peso del paquete es : "+this.getPeso());
            System.out.println("La prioridad del paquete es : "+this.getPrioridad());
        }
    }
}
