import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflexao {

    public static void listarAtributos(Object obj) {
        Class<?> clazz = obj.getClass();

        while (clazz != null && clazz != Object.class) {
            System.out.println("Classe: " + clazz.getSimpleName());

            for (Field f : clazz.getDeclaredFields()) {
                System.out.println(" - Atributo: " + f.getName() + " (" + f.getType().getSimpleName() + ")");
            }

            clazz = clazz.getSuperclass();
        }
    }

    public static void listarMetodos(Object obj) {
        Class<?> clazz = obj.getClass();

        while (clazz != null && clazz != Object.class) {
            System.out.println("Classe: " + clazz.getSimpleName());

            for (Method m : clazz.getDeclaredMethods()) {
                System.out.println(" - Método: " + m.getName());
            }

            clazz = clazz.getSuperclass();
        }
    }
}
