public class LeetCode_RemoveElement {
    
public static int RemoveElement(int num[],int val){
    int k=0;
    for(int i=0; i<num.length; i++){
        if(num[i]!=val){
            num[k]=num[i];
            k++;
        }
    }
    return k;
}
 public static void main (String[] args) {
    int num[]={2,3,4,5,3,3};
    int val=3;
    int k=RemoveElement(num,val);
    System.out.println("Number of element"+k);
    System.out.println("Array");
    for(int i=0; i<k; i++){
        System.out.println(num[i]+" ");
    }
}
}