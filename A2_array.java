public class A2_array {

    public static void main(String[] args) {
        // int a = 35;
        // int arr[] = {10,20,30,40,50};
        // int arr1[] = new int[6];
        // for(int i=0; i<4; i++) {
        //     arr1[i]=arr[i];
        //     if(i==3) {
        //         arr1[i]=a;
        //     }
        // }
        // for(int i=3; i<5; i++) {
        //     arr1[i+1]=arr[i];
        // }
        // for(int i=0; i<6; i++) {
        //     System.out.println(arr1[i]);
        // }

        // int arr[] = {10,20,30,35,40,50};
        // int arr1[] = new int[5];
        // for(int i=0; i<4; i++) {
        //     if(i==3) {
        //         continue;
        //     } else {
        //         arr1[i]=arr[i];
        //     }
        // }
        // for(int i=4; i<6; i++) {
        //     arr1[i-1]=arr[i];
        // }
        // for(int i=0; i<5; i++) {
        //     System.out.println(arr1[i]);
        // }

        int arr[]={1,2,3,4,5};
        int sum =arr[0];
        int opp=0;
        for(int i=0; i<4; i++) {
            sum += arr[i+1];
            opp++;
        }
        System.out.println(sum);
        System.out.println(opp);
    }
}