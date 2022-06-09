package Package;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Daniel");
        persona.setEdad(35);
        persona.setTelefono("3217175346");

        String nombre = persona.getNombre();
        int edad = persona.getEdad();
        String telefono = persona.getTelefono();

        System.out.println("Nombre: " + nombre );
        System.out.println("Edad: " + edad );
        System.out.println("Telefono: " + telefono );

    }

    static class Persona{
        private int edad;
        private String nombre;
        private String telefono;

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }
    }
}
