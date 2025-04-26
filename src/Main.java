import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorProducto = 0, valorCompra = 0;
        String nombreCliente = "", opcion = "";
        int cantidadProductos = 0, edad =0;
        System.out.println("Bienvenido a la tienda Don Andres: Mercancía de dudosa procedencia");
        System.out.println("Seleccione: \n1 - Tecnología\n2 - Ropa\n3 - Drogas");
        opcion = sc.nextLine();
        switch (opcion) {
            case "1":
                System.out.println("Categoria Tencología: \n1 - Televisores\n2 - Computadores\n3 - Celulares");
                opcion = sc.nextLine();
                switch (opcion) {
                    case "1":
                        System.out.println("Televisores");
                        break;
                    case "2":
                        System.out.println("Computadores");
                        break;
                    case "3":
                        System.out.println("Celulares");
                        break;
                }
                break;
            case "2":
                System.out.println("Categoria Ropa: \n1 - Jeans\n2 - Tennis Puma\n3 - Camisetas");
                opcion = sc.nextLine();
                switch (opcion) {
                    case "1":
                        System.out.println("Jeans");
                        break;
                    case "2":
                        System.out.println("Tennis Puma");
                        break;
                    case "3":
                        System.out.println("Camisetas");
                        break;

                }
                break;
            case "3":
                System.out.println("Ingrese su edad: ");
                edad = sc.nextInt();
                System.out.println("Tiene formula medica?\n1 - Si\n2 - No");
                opcion = sc.next();
                if (edad >= 18 && opcion.equals("1")) {
                    System.out.println("Catergoria Drogas: \n1 - Omeprazol\n2 - Opioides\n3 - Tramadol");
                    opcion = sc.nextLine();
                    switch (opcion) {
                        case "1":
                            System.out.println("Omeprazol");
                            break;
                        case "2":
                            System.out.println("Opioides");
                            break;
                        case "3":
                            System.out.println("Tramadol");
                            break;
                        }
                    }else{
                        System.out.println("No le puedo vender Drogas, Guiño, Guiño...");
                }
           break;
        }


    }

}