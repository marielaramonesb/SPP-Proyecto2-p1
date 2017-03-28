/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.proyecto2.p1;
import java.util.Scanner;
//Mariela Ramones Balvoa
//Catalina Guadalupe Domínguez Garza
//Kevin Gerardo Hinojosa Castellanos
//Alejandro García Monroy
//Lisdy Rohmann
public class SppProyecto2P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int tamaño=Int("el tamaño de los arreglos: ");
        int [][] a=crearMatriz("A",tamaño);
        int [][] b=crearMatriz("B",tamaño);
        menu(a,b);
    }
    
      public static int Int(String mensaje){
        Scanner teclado = new Scanner (System.in);
        int varEntera = 0;
        boolean flag;
        
        do{
        System.out.print("Introduzca " + mensaje);
        try{
        varEntera = teclado.nextInt();
        flag=false;
    }catch (Exception ex){
            System.out.println("Introdujo una variable incorrecta " + ex);
            flag=true;
            teclado.nextLine();
    } 
  } while (flag); 
    return varEntera;
    
    }
       public static int [][] crearMatriz(String mensaje, int tamaño){
        System.out.println("\nIntroduzca el contenido de la matriz "+mensaje);
        int[][]Matrix=new int[tamaño][tamaño];
        int valor;
        System.out.println("El tamaño de la matriz es "+Matrix.length);
        for (int i=0; i<Matrix.length; i++){
            for (int j=0; j<Matrix[i].length; j++){
            Matrix[i][j]=Int("el valor ("+i+","+j+"): ");
            }
        }
        return Matrix;
        }
    
    
    public static void menu(int[][] a,int[][] b){
        int option;
        System.out.println("Introduzca la opcion deaseada");
        System.out.println("1.- Sumar matrices");
        System.out.println("2.- Restar matrices");
        System.out.println("3.- Multiplicar matrices");
        Scanner teclado = new Scanner(System.in);
        option = teclado.nextInt();
        
        switch(option){
            case 1: sumaDeMatrices(a,b);
                    break;
            case 2: restaDeMatrices(a,b);
                    break;
            case 3: multiplicacion(a,b);
                    break;
            default: System.out.println("Introduce un numero valido");
        }
    }
    //Método SUMA
    
    public static void sumaDeMatrices(int[][] a,int[][] b){
         int[][]r=new int[a.length][a.length];
        System.out.println("\nSuma");
        for (int i=0; i<r.length; i++){
            for (int j=0; j<r[i].length; j++){
            r[i][j]=a[i][j]+b[i][j];
            System.out.println("El valor ("+i+","+j+") es igual a: "+(r[i][j]));
        
    }
    }
        
        
    }
    
    public static void restaDeMatrices(int[][] a,int[][] b){
        int[][]r=new int[a.length][a.length];
        System.out.println("\nResta");
        for (int i=0; i<r.length; i++){
            for (int j=0; j<r[i].length; j++){
            r[i][j]=a[i][j]-b[i][j];
            System.out.println("El valor ("+i+","+j+") es igual a: "+(r[i][j]));
        
    }
    }
    }
    
    public static void multiplicacion(int[][] a,int[][] b){
        int[][]r=new int[a.length][a.length];
        System.out.println("\nMultiplicacion");
        for (int i=0; i<r.length; i++){
            for (int j=0; j<r.length; j++){
                for (int z=0; z<r.length; z++){
                    r[i][j]+=(a[i][z]*b[z][j]);
                }
            System.out.println("El valor ("+i+","+j+") es igual a: "+(r[i][j]));
    }
        
}
    }
    
}
