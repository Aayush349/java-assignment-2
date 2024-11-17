public class  Q1{
    public static void main (String[]args)
    {
      int l1=0,l2=0,l3=0,u1=10,u2=10,u3=20;
       int a[]={1,2,3,4,5,6,7,8,9,10};
       int b[]={11,12,13,14,15,16,17,18,19,20};
          int[] c = new int[20];

            while (l1!=u1||l2!=u2)
              {
              if (a[l2]>b[l1])
                {
                    c[l3]=b[l2];
                    l3++;
                    l2++;

                }
                else{
                    c[l3]=a[l1];
                    l3++;
                    l1++;

                    
                }


              }
              while(l3!=u3)
              {System.out.println(c[l3]);
              l3++;
              }

    }
}