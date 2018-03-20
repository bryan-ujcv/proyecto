
public class heap {
	public void sort(double arr[]) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heap(arr, n, i);
        }
 
        for (int i=n-1; i>=0; i--) {
            double temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
 
            heap(arr, i, 0);
        }
    }
	
	void heap(double arr[],int n,int i) {
        int padre = i;  
        int hijoizq = (2*i) + 1;  
        int hijoder = (2*i) + 2;  
 
        if (hijoizq < n && arr[hijoizq] > arr[padre]) padre = hijoizq;
 
        if (hijoder < n && arr[hijoder] > arr[padre]) padre = hijoder;
 
        if (padre != i) {
            double swap = arr[i];
            arr[i] = arr[padre];
            arr[padre] = swap;
            heap(arr, n, padre);
        }
    }
 
    static void imprimir(double arr[]) {
        double n = arr.length;
        for (int i=0; i<n; ++i) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
 
}
