
package examen1;

/**
 *
 * @author chava
 */
import java.util.Scanner;

import sistema.Vehicle;
import sistema.ElectricVehicle;
import sistema.CombustionVehicle;
public class Examen1 {

   
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
      int opcion;
      boolean datosIngresados = false;
       Vehicle[] escrito = new Vehicle[2];
       
       
      
     
     do{
         
         System.out.println("Menú: ");
         System.out.println("1.Registrar vehiculo ");
         System.out.println("2.consultar detalles del vehiculo");
         System.out.println("3.Calculo costo de funcionamiento ");
         System.out.println("4. Mantenimiento ");
         System.out.println("5. salir ");
         opcion = scanner.nextInt();
             scanner.nextLine();
     switch (opcion) {
         case 1:
                
      for (int i = 0; i < escrito.length; i++) {
          Vehicle vehicle = new Vehicle();
          
          
          
            System.out.println("Ingrese la marca :");
            String brand = scanner.nextLine();
            vehicle.setBrand(brand);
            
            System.out.println("Ingrese el modelo :");
            String model = scanner.nextLine();
            vehicle.setModel(model);
            
            System.out.println("Ingrese la placa :");
            String plate  = scanner.nextLine();
            vehicle.setPlate(plate);
            
             System.out.println("Ingrese el id :");
            String id  = scanner.nextLine();
            vehicle.setId(id);
            
             System.out.println("Ingrese el color :");
            String colour  = scanner.nextLine();
            vehicle.setColour(colour);
            
             System.out.println("Ingrese el año :");
            int year = scanner.nextInt();
            scanner.nextLine();
            vehicle.setAge(year);
            
            System.out.println("Ingrese el estado :  "
                    + "Mantenimiento o"
                     + " disponible:");
             
            String state  = scanner.nextLine();
            vehicle.setState(state);
             System.out.println("Ingrese el Tipo de vehiculo: a.electrico,"
                     + " b.combustion :  ");
             
            String type = scanner.nextLine();
            vehicle.setType(type);
            
             if (("a").equals(vehicle.getType())) {
                 ElectricVehicle electricVehicle = new ElectricVehicle();
                  System.out.println("Ingrese la capacidad de la batería:");
                 int batteryCapacity = scanner.nextInt();
                     scanner.nextLine();  
                     
                electricVehicle.setBatteryCapacity(batteryCapacity);
              
                  System.out.println("Ingrese cuato recorre en km, con"
                          + " la bateria al 100:");
                 double autonomy = scanner.nextDouble();
                     
                electricVehicle.setAutonomy(autonomy);
                scanner.nextLine(); 
                
                System.out.println("Ingrese el tiempo de carga:");
             int chargingTime = scanner.nextInt();
                  
                electricVehicle.setChargingTime(chargingTime );
                scanner.nextLine();
                
                    System.out.println("Posee el vehiculo carga rapida:");
             String fastCharging = scanner.nextLine();
                    
                    
                    
               electricVehicle.setFastcharging( fastCharging );
                scanner.nextLine();
               
              
             } else if (("b").equals(vehicle.getType())){
           CombustionVehicle combustionVehicle = new CombustionVehicle();
             System.out.println("Ingrese el consumo de combustible");
                 double fuelConsumption = scanner.nextDouble();
            
              combustionVehicle.setFuelConsumption(fuelConsumption);
              
                System.out.println("Ingrese el tipo de combustible");
                 String fuelType = scanner.nextLine();
              combustionVehicle.setFuelType(fuelType);
              
               System.out.println("Ingrese las emisiones de gases");
                Double gasEmission = scanner.nextDouble();
    
              combustionVehicle.setGasEmission(gasEmission);
              
              System.out.println("Ingrese la capacidad del tanque");
                Double tankCapacity = scanner.nextDouble();
           
             combustionVehicle.setTankCapacity(tankCapacity);
              
                   } else {
           System.out.println("Tipo de vehiculo no válido. Ingrese 'a' "
                   + "para eléctrico o 'b'"
                   + " para combustión.");
            // Restaurar el índice para reintentar la entrada
            i--; 
             }  
        
  
           
            

            
            escrito[i] = vehicle;
            
        }
             datosIngresados = true;
             break;
          
         case 2:
               
             System.out.println("Ingrese la marca o medelo a buscar:");
             String busqueda = scanner.nextLine();
             
             boolean encontrado = false;
             
             for (int j = 0; j < escrito.length; j++) {
                 Vehicle vehiclebuscado = escrito[j];
            if (busqueda.equalsIgnoreCase(vehiclebuscado.getBrand()) ||
                    busqueda.equalsIgnoreCase(vehiclebuscado.getModel())) {
             System.out.println("Detalles del vehículo:");
            System.out.println("Marca: " + vehiclebuscado.getBrand());
            System.out.println("Modelo: " + vehiclebuscado.getModel());
            System.out.println("Placa: " + vehiclebuscado.getPlate());
            System.out.println("ID: " + vehiclebuscado.getId());
            System.out.println("Color: " + vehiclebuscado.getColour());
            System.out.println("Año: " + vehiclebuscado.getAge());
            System.out.println("Estado: " + vehiclebuscado.getState());
        if (!encontrado){
            System.out.println("No hay vehiculos encontrados con la marca o"
                    + " modelo ingresado");
             }
            }
             }
             break;
             
         case 3:
             break;
             
             case 4:
                 break;
                 
             case 5:
                 break;
                 
             default:
                 System.out.println("Opción no válida. Inténtalo de nuevo.");
                    
                         break;
             
     }
     }while(opcion != 5);
     scanner.close();
     
     
     
     
     
     
   
      
       
     
      
      
       
        
     
    }
}

