/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import static java.lang.Math.*;

/**
 *
 * @author Gustavo
 */
public class Operacion {
    
    //punto 1
    public double Suma(double a, double b){
        return a+b;
    }
    
    //punto 2
    public double cuadrado(double a){
        return pow(a,2);
    }
    
    //punto 3
    public double metrosApulgadas(double metros){
        return metros*39.37;
    }
    
    public double metrosApies(double metros){
        return metros*3.28;
    }
    
    //punto 4
    public double hipotenusa(double catA, double catO){
        return sqrt(pow(catA,2)+pow(catO,2));
    }
    
    //punto 5
    public double factorial(int a){
        
        if(a==0){
            return 1;
        }
        
        return a*factorial(a-1);
    }
    
    //punto 6
    /*
    Resuelto desde la interfaz
    */
    
    //punto 7
    public void generarVector(int[] arreglo){
        arreglo[0]=1;
        
        for(int i=0;i<(arreglo.length-1);i++){
            arreglo[i+1]=i*arreglo[i]+i*2;
        }
    }
    
    //punto 8
    
    //valor de retorno = -1 representa una arreglo sin negativos
    public int posPrimerMenorCero(int[] arreglo){
        int pos=-1;
        
        for(int i=0;i<arreglo.length;i++){
            if(arreglo[i]<0){
                pos=i;
                
                break;
            }
        }
        
        return pos+1;
    }
    
    public int valorMaximo(int[] arreglo){
        int maximo=arreglo[0];
        
        for(int i:arreglo){
            if(i>maximo){
                maximo=i;
            }
        }
        
        return maximo;
    }
    
    public int posValorMaximo(int[] arreglo){
        int maximo=arreglo[0];
        int posMax=0;
        
        for(int i=0;i<arreglo.length;i++){
            if(maximo<arreglo[i]){
                maximo=arreglo[i];
                posMax=i;
            }
        }
        
        return posMax+1;
    }
    
    //punto 9
    public void generarMatrizUnidad(int[][] matriz)throws Exception{
        
        if(matriz.length!=matriz[0].length){
            throw new Exception("La matriz no es cuadrada.");
        }
        
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(i==j){
                    matriz[i][j]=1;
                }
            }
        }
    }
    
    //punto 10
    public int[] sumarFilasMatriz(int[][] matriz, int numCol, int numFil){
        int[] sumas=new int[numCol];
        
        for(int i=0;i<numCol;i++){
            for(int j=0;j<numFil;j++){
                sumas[i]=sumas[i]+matriz[i][j];
            }
        }
        
        return sumas;
    }
    
    public void cargarMatriz(int[][] matriz, int numCol, int numFil){
        for(int i=0;i<numCol;i++){
            for(int j=0;j<numFil;j++){
                
                //genera numero aleatorio entre 0-10
                matriz[i][j]=(int)Math.floor(Math.random()*(10 - 0 + 1) + 0);
            }
        }
    }
}
