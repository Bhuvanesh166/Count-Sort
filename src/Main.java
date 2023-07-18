import java.util.Scanner;

class CountSort{
    public static void findCountSort(int[] arr){
        int count[]=new int[10];
        for(int i=0;i<arr.length;i++){
            int index=arr[i];
            count[index]++;

        }
        for (int i=0;i<count.length;i++){
            for (int j=0;j<count[i];j++){
                System.out.print(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter size of array:");
        int sze=scanner.nextInt();
        System.out.println("Enter array elements:");
        int arr[]=new int[sze];
        for(int i=0;i<sze;i++){
            arr[i]= scanner.nextInt();
        }
        System.out.println("Count Sort:");
        findCountSort(arr);
    }
}
