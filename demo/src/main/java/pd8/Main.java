package pd8;

public class Main {
    public static void main(String[] args) {

        
        System.out.println("Consumo de memoria de un objeto Marcapasos:");
        System.out.println("Presión Sanguínea (short): 2 bytes");
        System.out.println("Frecuencia Cardíaca (short): 2 bytes");
        System.out.println("Nivel de Azúcar (int): 4 bytes");
        System.out.println("Máxima Fuerza (long): 8 bytes");
        System.out.println("Mínimo Tiempo entre Latidos (float): 4 bytes");
        System.out.println("Batería Restante (double): 8 bytes");
        System.out.println("Código del Fabricante (String, 8 caracteres): 16 bytes");
        System.out.println("Total: 44 bytes (aproximadamente, sin overhead del objeto)");

        System.out.println("Hello world!");
    }
}