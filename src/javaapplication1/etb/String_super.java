package javaapplication1.etb;


public class String_super {
    public static String strSideSpaceCut(String S)
    {
        int i=0;
        String Result="";
        boolean filter=true;
        for(;i<S.length();i++)
        {
            if(S.charAt(i)==32&&filter)
            {
                continue;
            }
            else
            {
                filter=false;
            }
            Result+=""+S.charAt(i);

        }
        S=Result;
        Result="";
        filter=true;
        for(i=S.length();i>-1;i--)
        {
            if(S.charAt(i)==32&&filter)
            {
                continue;
            }
            else
            {
                filter=false;
            }
            Result+=""+S.charAt(i);

        }
        return Result;
    }
    String cut(String S,int a,int b)
    {
        char z[]=new char[100];
        int i=S.length();
        for(int k=0,m=0;k<i;k++)
        {
            if(k>a-1&&k<a+b-1)
            {
                continue;
            }
            z[m]=S.charAt(k);
            m++;
        }
        S=new String(z,0,i-b);
        return S;
    }
    String add(String S,String S1,int a)
    {
        char z[]=new char[1000];
        int b=S1.length();
        int i=S.length();
        for(int k=0,m=0;k<i;k++)
        {
            if(k==a)
            {
                for(int y=0;y<b;y++)
                {
                    z[m]=S1.charAt(y);
                    m++;
                }
            }
            z[m]=S.charAt(k);
            m++;
        }
        S=new String(z,0,i+b);
        return S;
    }
    int compare(String one,String two)
    {
        System.out.println(two);
        int i=one.length();
        int k=two.length();
        int re=0,n=1;
        for(int j=2,l=0;l<=i&&j<=k;j++,l++)
        {
            if(l<i&&j<k)
            {
            if(one.charAt(l)!=two.charAt(j))
            {
                if(one.charAt(l)-two.charAt(j)<0)n=-1;
                return (((l+1)*3000)+(one.charAt(l)-two.charAt(j)))*n;
            }
            }
            else
            {
             if(l==i&&j==k)return 0;
             else
             {
                if(l==i){n=-1;
                return ((((l+1)*255)+(0-two.charAt(j)))+20000)*n;}
                if(j==k){if(true)n=1;
                return (((l+1)*255)+(one.charAt(l)-0))*n;}
             }
            }
        }
        return 0;
    }




    public static String replace(String source,String serch,String instead)
    {
       if(serch.length()>0){
        for(int i=0;i<source.length();i++)
        {
            if(serch.charAt(0)==source.charAt(i))
            {
                int j=1;
                for(;j<serch.length();j++)
                {
                    if(serch.charAt(j)!=source.charAt(i+j))break;
                }
                if(j==serch.length())
                {
                    source=source.substring(0,i)+instead+source.substring(i+1,source.length());
                }
            }
        }
        }
        return source;
    }

}
