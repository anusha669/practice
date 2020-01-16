import java.util.Scanner;
class Permutation{
    public int a[];
    void perm(int a[],int low,int high)
    {
        Permutation p = new Permutation();

        // if low and high are equal either only one char exists or
        // all chars have been fixed 
        if(low == high){                    
            for(int j=0;j<high;j++)
                System.out.print(a[j]+" ");
            System.out.println();
        }

        //if there are more than one char then fix the left most char, permute the rest of the chars...

        for(int i=low;i<high;i++)
        {                                                     //    1 2 3 
            p.swap(a,i,low);            // fix left most           1(fix) 2 3
            perm(a,low+1,high);             // permute             permute 2 , 3
            p.swap(a,i,low);            // unfix left most char    1(unfix) 2 3 then 
        }
    }
    void swap(int a[],int i,int l)
    {
        int t = a[i];
        a[i] = a[l];
        a[l] = t;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);                // 1 2 3
        Permutation p = new Permutation();                  // 1 3 2
        p.a = new int[3];                                   // 2 1 3
        for(int i=0;i<3;i++)                                // 2 3 1
        {                                                   // 3 1 2
            p.a[i] = sc.nextInt();                          // 3 2 1
        }
        p.perm(p.a,0,p.a.length);
    }
}