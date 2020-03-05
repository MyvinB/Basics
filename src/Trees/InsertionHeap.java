package Trees;

/*
 @author Myvin Barboza
 05/03/20 4:09 PM 
 */

public class InsertionHeap {

    static void heapify(int ar[],int n,int i){
        int largest=i;
        int l=i*2+1;
        int r=i*2+2;

        if(l<n && ar[largest]<ar[l])largest=l;
        if(r<n && ar[largest]<ar[r])largest=r;

        if(largest!=i){
            int swap=ar[i];
            ar[i]=ar[largest];
            ar[largest]=swap;
            heapify(ar,n,largest);
        }
    }

    static int deleteRoot(int ar[],int n){
        int lastElement=ar[n-1];
        ar[n-1]=ar[0];
        ar[0]=lastElement;

        n=n-1;
        heapify(ar,n,0);
        return n;
    }


    public static void main(String[] args) {
        int ar[]={10,5,3,2,4};
        int p=ar.length;
        int n=deleteRoot(ar,p);

        for (int i = 0; i < p; ++i)
            System.out.print(ar[i] + " ");

    }

}