import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Path file = Paths.get("file.txt");


        Car BMW = new Car("BMW", "X7");
        Car VW = new  Car("VW", "Jetta");
        Car Toyota = new Car("Toyota", "Hilux");

        ArrayList<Car> cars = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        try {
            List<String> lines = Files.readAllLines(file);
            for(String line : lines){
                Car car = new Car(line);
                cars.add(car);
            }


        }catch (IOException e){
            e.printStackTrace();
        }
        for (Car c : cars){
            System.out.println(c.toString());
        }

        Car selectedCAR = null;

        while (true) {
            System.out.println("What you wanna do, write (engine,drive,quit,fuel,cars,select,createCar,delete)?");
            String action = scanner.next();
            if (action.equals("quit")) break;

            switch (action) {

                case "delete" -> {
                    System.out.println("Enter car number you want to detele:");
                    int carNumber = read(scanner) - 1;
                    try {
                        selectedCAR = cars.remove(carNumber);
                    } catch (IndexOutOfBoundsException e) {
                        System.err.println("Selected car does not exist.");
                    }
                }
                case "createCar"->{
                    System.out.println("Choose Make");
                    scanner.nextLine();
                    String make = scanner.nextLine();
                    System.out.println("Choose Model");
                    String model = scanner.nextLine();

                    Car newCar = new Car(make, model);
                    cars.add(newCar);
                }

                case "cars" -> {
                    for(int i = 0; i < cars.size(); i++)
                    {
                        System.out.println(i + 1 + " - " + cars.get(i));
                    }
                }
                case "select" -> {
                    System.out.println("Enter car number:");
                    int carNumber = read(scanner) - 1;
                    try {
                        selectedCAR = cars.get(carNumber);
                    } catch (IndexOutOfBoundsException e) {
                        System.err.println("Selected car does not exist.");
                    }
                }
                case "engine" -> {
                    if(!checkSelection(selectedCAR)) break;
                    boolean engine = selectedCAR.invert();
                    System.out.println(engine ? "Engine on" : "Engine off");
                }
                case "drive" -> {
                    if(!checkSelection(selectedCAR)) break;
                    System.out.println("Distance:");
                    int km = read(scanner);
                    int newkm = selectedCAR.drive(km);
                    if (newkm == -1) {
                        System.err.println("Engine is off");
                        break;
                    }
                    System.out.println("Drove: " + newkm + "km");
                    if(selectedCAR.getFuel() == 0){
                        selectedCAR.invert();
                        System.err.println("Need Fuel, Engine off");
                    }
                }
                case "fuel" -> {
                    if(!checkSelection(selectedCAR)) break;
                    System.out.println("How much fuel?");
                    int fueladd = read(scanner);
                    int newfuel = selectedCAR.fuel(fueladd);
                    if (newfuel == -1) {
                        System.err.println("Engine is on");
                    }
                    System.out.println("Fuel amount, " + newfuel + "l");
                }

            }


        }
        try{
            String filetext = "";
            for(Car car : cars){
                filetext += car.toFile() + "\n";
            }
            Files.writeString(file, filetext);
            System.out.println(filetext);
        } catch (IOException e){
            e.printStackTrace();
        }

    }
    private static int read(Scanner scanner) {
        try{
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Enter a Number!");
            return 0;
        }
    }
    private static boolean checkSelection(Car car){
       if(car == null) {
           System.out.println("Select a car first!");
           return false;
       }
       return true;
    }

}