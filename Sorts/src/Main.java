import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner miScanner=new Scanner(System.in);
		Random random=new Random();
		System.out.println("de que tamano desea el arreglo");
		int x=miScanner.nextInt();
		double arr[]=new double[x];
		for(int i=0;i<arr.length;i++) {
			int n = (int)(random.nextInt(1000));
			arr[i]=n;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print("["+arr[i]+"] ");
		}
		System.out.println("\n***********************************************************************");
        bubble burbuja = new bubble();
        System.out.println("BUBBLE\n");
        burbuja.sort(arr);
        System.out.println("arreglo ordenado\n");
        burbuja.imprimir(arr);
        final double NSb=1000000000;
        long inicioNSb=System.nanoTime();
        burbuja.sort(arr);
        long duracionNSb=System.nanoTime()-inicioNSb;
        System.out.println("\nlo que se tarda el bubble sort es: "+duracionNSb+" nano segundos");
          
        
        System.out.println("***********************************************************************");
        
        System.out.println("HEAP\n");
        heap heap = new heap();
        System.out.println("arreglo ordenado\n");
        heap.imprimir(arr);
        final double NSh=1000000000;
        long inicioNSh=System.nanoTime();
        heap.sort(arr);
        long duracionNSh=System.nanoTime()-inicioNSh;
        System.out.println("\nlo que se tarda el heap sort es: "+duracionNSh+" nano segundos");
        
        System.out.println("***********************************************************************");
        
        System.out.println("MERGE");
        merge merge = new merge();
        System.out.println("\narreglo ordenado\n");
        merge.imprimir(arr);
        final double NSm=1000000000;
        long inicioNSm=System.nanoTime();
        merge.sort(arr, x, x);
        long duracionNSm=System.nanoTime()-inicioNSm;
        System.out.println("\nlo que se tarda el merge sort es: "+duracionNSm+" nano segundos");

	}
	
	/*
	 * EDD_link_nCuenta
	 * kenneth.vittetoe@ujcv.edu.hn
	 * mandar link
	 * 
	 * bubble x^2
	 * merge nlogn
	 * heap nlog n
	 *  
	 */

}
