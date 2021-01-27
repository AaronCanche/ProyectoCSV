import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class  DatosCSV {
    public static void main(string[]args){
        Arraylist<Inf> listInf= new Arraylist<>();
        String ubicacionArchivoCSV=args[0];
            
        try{
            
            BufferedReader DatosCSV=new BufferedReader(new FileReader("C://Users//cursobib//Downloads//ProyectoCSV.csv"));
            
            String linea=DatosCSV.readLine();
            linea=DatosCSV.readLine(); 
            
            while(linea!=null){
                String[] campos=linea.split(",");
                Inf temporalPropiedades=new Inf(campos[0],campos[1],campos[2],campos[3]);
                listInf.add(temporalPropiedades); 
                linea=DatosCSV.readLine(); 
            }
            DatosCSV.close();
        }catch(IOException e){
            System.out.println("Error al leer archivos");
            System.exit(0);
        }
        
        System.out.println("Informacion");
        for(int i=0;i<listaInf.size();i++){
            System.out.println("\t"+listInf.get(i).toString());
        }   
       
        
        BufferedWriter DatosCSV;
        try {
          
            
            DAtosCSV = new BufferedWriter(new FileWriter("Calificaciones.csv"));
            
            String encabezadoCSV="Matricula,Asignatura,Calificacion";
            DatosCSV.write(encabezadoCSV);
            DatosCSV.newLine();
            Scanner scanner = new Scanner(System.in);

           
            for(int i=0;i<listaInf.size();i++){
                int calificacion=0;
                do{
                System.out.println("Escribe la calificacion para la matricula "+listaInf.get(i).getMat()+":");
                calificacion= scanner.nextInt();
                
                }while(calificacion<-1 || calificacion>101 );
                
                      
               
                String lineaNueva=listaInf.get(i).getMat()+","+"Diseño de software"+","+calificacion ;
                DatosCSV.write(lineaNueva);
                DatosCSV.newLine();
            }

         
            DatosCSV.close();

            System.out.println("Guardado\n");

        }catch (IOException e) {
            System.out.println("No guardado");
        }
    }    
}


    
