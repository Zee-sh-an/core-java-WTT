package exercise;

public class Exercise1 {

// --> Array Practice
    public void deleting(int [] b,int index){

        int [] d=new int[b.length-1];

        for (int i=0,k=0;i<b.length;i++){
//            System.out.println(b[i]);
            if(i==index){
                continue;
            }
            System.out.println("Deleted element array");
            System.out.println(b[i]);
            d[k]=b[i];
        }
    }

    public static void main(String[] args) {

        int [] a=new int[5];
//        adding
        a[0]=10;
        a[1]=11;
        a[2]=12;
        a[3]=13;
        a[4]=14;

//       updating
        a[1]=112;

        Exercise1 exercise1=new Exercise1();
        exercise1.deleting(a,3);

//        fetching
        for (int c: a) {
            System.out.println(c);
        }
    }
}
