   public static void main(String[] args) {
        saludarUsuario("Ana", 20);
        saludarAdmin("Carlos", 35);
    }

    public static void saludarUsuario(String nombre, int edad) {
        System.out.println("Hola usuario " + nombre);
        System.out.println("Edad: " + edad);

        if (edad >= 18) {
            System.out.println("Mayor de edad");
        } else {
            System.out.println("Menor de edad");
        }

        if (edad > 30) {
            System.out.println("Usuario mayor");
        } else {
            System.out.println("Usuario joven");
        }
    }

    public static void saludarAdmin(String nombre, int edad) {
        System.out.println("Hola admin " + nombre);
        System.out.println("Edad: " + edad);

        if (edad >= 18) {
            System.out.println("Mayor de edad");
        } else {
            System.out.println("Menor de edad");
        }

        if (edad > 30) {
            System.out.println("Admin mayor");
        } else {
            System.out.println("Admin joven");
        }
    }
}
