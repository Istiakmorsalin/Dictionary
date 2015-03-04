package javaapplication1.etb;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class onubadok {

       private String english[]=new String[100];
       private String bangla[]=new String[100];
       private int meaning_amonut[]=new int[100];
       private int identity[]=new int[100];
       private int id[]=new int[100];
       private int length;//length+=1; is length, because length start from 0;
       private int verbmode;
       private int verbtype;
       private int property[]=new int[100];
       private int tense=0;
       private String sstatement=new String();
       private boolean enable[]=new boolean[100];
       private String banglaAfterTranslation[][][]=new String[100][25][3];
       private int blength[]=new int[100];
       private int onu_return_length=0;


    public String banglaFont(String S)
    {
            S=special(S);
            char c=2509;
            S=S.replace('A','আ');
            S=S.replace('m','ম');
            S=S.replace('i','ি');
            S=S.replace('a','া');
            S=S.replace('r','র');
            S=S.replace('k','ক');
            S=S.replace('e','ে');
            S=S.replace('l','ল');
            S=S.replace('b','ব');
            S=S.replace('u','ু');
            S=S.replace('v','ভ');
            S=S.replace('s','স');
            S=S.replace('o','ো');
            S=S.replace('t','ত');
            S=S.replace('T','থ');
            S=S.replace('y','ৎ');
            S=S.replace('d','দ');
            S=S.replace('h','হ');
            S=S.replace('Y','য়');
            S=S.replace('z','জ');
            S=S.replace('n','ন');
            S=S.replace('K','খ');
            S=S.replace('f','ফ');
            S=S.replace('J','ঝ');
            S=S.replace('j','য');
            S=S.replace('S','ছ');
            S=S.replace('g','গ');
            S=S.replace('p','প');
            S=S.replace('R','ড়');
            S=S.replace('I','ই');
            S=S.replace('C','চ');
            S=S.replace('O','ও');
            S=S.replace('E','এ');
        //    S=S.replace('T','');

        return S;
    }
    private String special(String S)
    {
        int k=S.length();
        for(int j=0;j<k;j++)
        {
            if(S.charAt(j)=='T'&&j!=0)
            {
                if(S.charAt(j-1)=='*'){
                StringBuffer S1,S2;
                S2=new StringBuffer("ত্র");
                S1=new StringBuffer(S);
                String Str;
                Str=""+S2;
                S1=S1.insert(j-1,Str);
                S=""+S1;
                char a[]=new char[100];
                for(int z=0,l=0;z<k+3;z++)
                {
                    if(S.charAt(z)=='*'||S.charAt(z)=='T')continue;
                    a[l]=S.charAt(z);
                    l++;
                }
                j=0;
                S=new String(a,0,k+1);
                }}
            if(S.charAt(j)=='S'&&j!=0)
            {
                if(S.charAt(j-1)=='*'){
                StringBuffer S1,S2;
                S2=new StringBuffer("চ্চ");
                S1=new StringBuffer(S);
                String Str;
                Str=""+S2;
                S1=S1.insert(j-1,Str);
                S=""+S1;
                char a[]=new char[100];
                for(int z=0,l=0;z<k+3;z++)
                {
                    if(S.charAt(z)=='*'||S.charAt(z)=='T')continue;
                    a[l]=S.charAt(z);
                    l++;
                }
                j=0;
                S=new String(a,0,k+1);
                }
            }

        }
        return S;
    }
 

}