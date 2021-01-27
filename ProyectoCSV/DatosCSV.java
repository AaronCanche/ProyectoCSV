import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class  DatosCSV {

    public static void main(String[]args){
        ArrayList<Inf> listaInf = new ArrayList<>();
        String ubicacionArchivoCSV=args[0];
            
        try{
            
            BufferedReader Dato=new BufferedReader(new FileReader(ubicacionArchivoCSV));
            
            String linea=Dato.readLine();
            linea=Dato.readLine(); 
            
            while(linea!=null){
                String[] dato=linea.split(",");
                Inf a =new Inf(dato[0],dato[1],dato[2],dato[3]);
                listaInf.add(a); 
                linea=Dato.readLine(); 
            }
            Dato.close();
        }catch(IOException e){
            System.out.println("Error al leer archivos");
            System.exit(0);
        }
        
        System.out.println("Informacion");
        for(int i=0;i<listaInf.size();i++){
            System.out.println("\t"+listaInf.get(i).toString());
        }   
       
        
        BufferedWriter Dato;
        try {
          
            Dato = new BufferedWriter(new FileWriter("Calificaciones.csv"));
            
            String CSV="Matricula,Asignatura,Calificacion";
            Dato.write(CSV);
            Dato.newLine();
            Scanner scanner = new Scanner(System.in);

           
            for(int i=0;i<listaInf.size();i++){
                int calificacion=0;
                do{
                System.out.println("Escribe la calificacion "+listaInf.get(i).getMat()+":");
                calificacion= scanner.nextInt();
                
                }while(calificacion<-1 || calificacion>101 );
                
                      
               
                String lineaNueva=listaInf.get(i).getMat()+","+"Diseño de software"+","+calificacion ;
                Dato.write(lineaNueva);
                Dato.newLine();
            }

         
            Dato.close();

            System.out.println("Guardado\n");

        }catch (IOException e) {
            System.out.println("No guardado");
        }
    }    
}


    
