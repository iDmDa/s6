import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Notebook> notebookSet = new HashSet<>();
        notebookSet.add(new Notebook("HP", "ProBook 455 G9", "Silver", "Windows", 8, 256, 87999));
        notebookSet.add(new Notebook("Apple", "MacBook Air", "Gold", "MacOS", 8, 256, 98399));
        notebookSet.add(new Notebook("Asus", "Vivobook 16", "Black", "Linux", 16, 512, 52999));
        notebookSet.add(new Notebook("Lenovo", "Legion 7 16IAX7", "Grey", "Windows", 32, 512, 329999));
        notebookSet.add(new Notebook("HUAWEI", "MateBook D 14", "Grey", "Windows", 8, 256, 47999));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите минимальный объем памяти RAM (в Гб):");
        int minRam = scanner.nextInt();

        System.out.println("Введите минимальный объем диска (в Гб):");
        int minStorage = scanner.nextInt();

        System.out.println("Желаемая операционая система (введите '-' если не важно):");
        String os = scanner.next();

        System.out.println("Желаемый цвет (введите '-' если не важно):");
        String color = scanner.next();

        System.out.println("Введите минимальную цену (р.):");
        int minPrice = scanner.nextInt();
        
        for (Notebook notebook : notebookSet) {
            if (notebook.getRam() >= minRam && 
            notebook.getStorage() >= minStorage && 
            (notebook.getOperatingSystem().equalsIgnoreCase(os) || os.equals("-"))&& 
            (notebook.getColor().equalsIgnoreCase(color) || color.equals("-"))&&
            notebook.getPrice() >= minPrice) 
            {
                System.out.println(notebook);
            }
        }
    }
}
