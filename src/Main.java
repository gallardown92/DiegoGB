  public static void main(String[] args) {
            int numero = 7;

            if (numero % 2 == 0) {
                System.out.println("El número " + numero + " es par");
            } else {
                System.out.println("El número " + numero + " es impar");
            }

            if (numero > 0) {
                System.out.println("Es positivo");
            } else {
                if (numero < 0) {
                    System.out.println("Es negativo");
                } else {
                    System.out.println("Es cero");
                }
            }
        }
