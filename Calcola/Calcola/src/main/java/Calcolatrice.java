/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author prete
 */

import java.util.*;

public class Calcolatrice {
    private final List<Integer> vettore;
    private int[] array;
    private int count;
    public Calcolatrice(){
        vettore = new ArrayList<>();
        array = new int[3];
        count = 0;
    }
    public int somma(int a,int b){
        vettore.add(a+b);
        array[count]=a+b;
        count++;
        return a+b;
    }
    public double divisione(int a, int b) throws Exception{
        if (b==0) throw new Exception();
        vettore.add(a/b);
        array[count]=a/b;
        count++;
        return a/b;
    }
    
    public List<Integer> getList(){
        return vettore;
    }
    
    public int[] getArray(){
        return array;
    }
}
