public class Main {
    public static void main(String[] args) {
        System.out.println("Productos en la tienda:");
        tienda.mostrarProductos();

        System.out.println("\nBusca el producto que necesite:");

        Producto buscado = tienda.buscarProducto(teclado.nextLine());
        if (buscado != null) {
            System.out.println(buscado);
        } else {
            System.out.println("Producto no encontrado.");
        }


    }
}
    }

}