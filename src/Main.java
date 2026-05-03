
            //Dentro de Main en DiegoGB

            public static void main(String[] args) {
                procesarPersona("Usuario", "Ana", 20);
                procesarPersona("Admin", "Carlos", 35);
            }

            public static void procesarPersona(String tipo, String nombre, int edad) {
                System.out.println("Hola " + tipo + " " + nombre);
                System.out.println("Edad: " + edad);

                mostrarEdad(edad,tipo);
            }
            //Dentro del Main en DiegoGB
            private static void mostrarEdad(int edad, String tipo) {
                if (edad >= 18) {
                    System.out.println("Eres mayor de edad");
                } else {
                    System.out.println("Eres menor de edad");
                }
                 if (edad > 30){
                     System.out.println(tipo + " es mayor.");
                 } else {
                     System.out.println(tipo + " es joven.");
                 }

                }




