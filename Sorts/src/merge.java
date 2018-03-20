
public class merge {
	 void merge(double arr[], int l, int m, int r) {
	        int n1 = m - l + 1;
	        int n2 = r - m;
	        /* arreglos temporales */
	        double izq[] = new double [n1];
	        double der[] = new double [n2];
	 
	        for (int i=0; i<n1; ++i) {
	            izq[i] = arr[l + i];
	            for (int j=0; j<n2; ++j) {
	            	der[j] = arr[m + 1+ j];
	            }
	        }
	
	        int i = 0;
	        int j = 0;
	        int x = l;
	        while (i < n1 && j < n2) {
	            if (izq[i] <= der[j]) {
	                arr[x] = izq[i];
	                i++;
	            }else {
	                arr[x] = der[j];
	                j++;
	            }
	            x++;
	        }
	 
	        while (i < n1) {
	            arr[x] = izq[i];
	            i++;
	            x++;
	        }
	
	        while (j < n2) {
	            arr[x] = der[j];
	            j++;
	            x++;
	        }
	    }
	 
	    void sort(double arr[], int l, int r) {
	        if (l < r) {
	            int m = (l+r)/2;
	 
	            sort(arr, l, m);
	            sort(arr , m+1, r);
	 
	            merge(arr, l, m, r);
	        }
	    }
	 
	    static void imprimir(double arr[]) {
	        double n = arr.length;
	        for (int i=0; i<n; ++i) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }
	 
	}
