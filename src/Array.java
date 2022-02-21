public class Array {
    public static void main(String[] args) {
        int[] myArray= new int[5];
        System.out.println("Исходный массив");
       for(int i=0; i<myArray.length;i++){
           myArray[i]=((int)(Math.random()*10));

           System.out.println(myArray[i]);
       }
       int k=0;
       int k1=0;
       for(int i=0;i<myArray.length;i++){
           for(int j=i+1;j< myArray.length; j++){
                   if (myArray[i] == myArray[j]) {
                       k++;
                       k1++;
                   }
                   if(k1>=3){
                       k--;
                   }
           }
       }
       boolean check=true;
       int[][]newArray = new int[5-k][2];
        int m=0;
        int c=0;
        int counter=0;
        for(int i=0;i<myArray.length;i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] != myArray[j]) {
                    check = true;
                } else {
                    check =false;
                    break;
                }
            }

            if (check) {
                for (int d = 0; d < myArray.length; d++) {
                    if(myArray[i] == myArray[d]) {
                        counter++;
                    }
                }
                for (int l = m; l < newArray.length; l++) {

                    newArray[l][0] = myArray[i];
                    newArray[l][1] = counter;
                }
                m++;
                counter = 0;
            }
            check = true;
        }
        System.out.println("Новый массив");
        for(int i=0; i<5-k;i++){
            for(int j=0; j<2;j++) {
                System.out.print(" "+newArray[i][j]+" ");
            }
            System.out.println();
        }

        int count1=0;
        for(int i=0; i<myArray.length;i++){
            if(myArray[i]%2==0){
                count1++;
            }
        }
        int[] Array2= new int[count1];
        int p=0;
        for(int i=0; i<myArray.length;i++){
            if(myArray[i]%2==0){
                    Array2[p]=myArray[i];
                p++;
            }
        }
        System.out.println("Массив из четных чисел");
        for(int i=0; i<Array2.length;i++){
            System.out.println(Array2[i]);
        }
    }
}
