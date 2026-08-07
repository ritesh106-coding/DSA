import java.util.Scanner;
public class linearSearch {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=s1.nextInt();
        int arr[]=new int [n];
        System.out.println("Enter the elements of the array");
        for(int i=0; i<n; i++){
            arr[i]=s1.nextInt();
        }
        int index=-1;
        System.out.println("Enter the element to be searched");
          int key=s1.nextInt();
        for(int i=0; i<n; i++){
            if(arr[i]==key){
                index=i;
                break;
            }
            
    }
    if(index!=-1){
        System.out.println("Element found at index: "+index);
    }
    else{
        System.out.println("Element not found");
    }

    }
}
