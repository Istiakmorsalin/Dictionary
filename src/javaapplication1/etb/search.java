package javaapplication1.etb;



  // Fig. 14.28: search.java
   // This program reads a random-access file sequentially and
   // displays the contents one record at a time in text fields.
   import java.io.EOFException;
import java.io.File;
   import java.io.IOException;
   import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
 
//  import com.deitel.jhtp6.ch14.RandomAccessAccountRecord;

  public class search
  {
     private RandomAccessFile input;
     private RandomAccessFile link;

     // enable user to select file to open
     public int component()
     {
        try {
            return (int) input.length();
        } catch (IOException ex) {
            Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
     }
     public void openFile()
     {
        try // open file
        {
                File f=new File("src//1.txt");
    String Ss=f.getAbsolutePath().substring(0,f.getAbsolutePath().length()-9);
    System.out.println(Ss);
           input = new RandomAccessFile( Ss+"onu.dat", "rw" );
           link =new RandomAccessFile(Ss+"link.txt" , "rw" );
        } // end try
        catch ( IOException ioException )
        {
            try {
        //        TextAreaFrame taf=new TextAreaFrame();
          //      taf.setVisible(true);
          //      JOptionPane.showMessageDialog(taf, "Onubadok 1418 is bassed on Translation from English to bangla\n  Version  :  1.0\n  Vendor   :  Dhumketu\n   Credit   :   Ashraf & Masud , CSE 09 KUET", "About", JOptionPane.PLAIN_MESSAGE);
            } catch (Exception ex) {
                Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
            }
           System.err.println( "File does not exist." );
        } // end catch
     } // end method openFile

public void replace(int first,int second)
      {
        try {
            link.seek(first*4);
            int temp = link.readInt();

            RandomAccessAccountRecordw ra=null;
            RandomAccessAccountRecordw se=null;
            try {
                input.seek(temp*RandomAccessAccountRecordw.SIZE);
                ra = new RandomAccessAccountRecordw();
                ra.read(input);
                link.seek(second*4);
                int seint=link.readInt();
                input.seek(seint*RandomAccessAccountRecordw.SIZE);
                se = new RandomAccessAccountRecordw();
                se.read(input);


                input.seek(temp*RandomAccessAccountRecordw.SIZE);
                se.write(input);
                input.seek(seint*RandomAccessAccountRecordw.SIZE);
                ra.write(input);
            } catch (Exception ex) {
                Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
        }

}

public int search_position(String en) throws Exception
     {
        RandomAccessAccountRecordw[] record = new RandomAccessAccountRecordw[1];

    record[0]=new RandomAccessAccountRecordw();


         //   int word_number=(int)input.length()/816;
            int word_number=(int)link.length()/4;
          //  link.seek(452*4);

     //       input.seek(0);
     //       record.read(input);
      //      return record;
            input.seek(link.readInt()*816+4);
      //      System.out.println(word_number+"   "+record.readName(input));
            int n=word_number;
            int beg=1;
            int mid=(int)((n+beg)/2);
            int l=1;
            while(true)
            {
            link.seek((mid-1)*4);
            if(mid>567)l=1;
            else l=0;
               if((mid<1||mid>word_number)||beg>n)break;
               link.seek((mid-1)*4);

               input.seek(((link.readInt())*816)+4);
               String S=record[0].readName(input);
         //   link.seek((mid-1)*4);
//System.out.println(S+"  "+mid+"  "+link.readInt());
        //           System.out.println("???"+S+"  "+mid);
               if(en.compareTo(S)==0)
               {
            //       System.out.println("??"+S);
            //   link.seek((mid-1)*4);

               link.seek((mid-1)*4);
               input.seek((link.readInt())*816);
                record[0].read(input);
                int start=mid-1,end=mid-1;
                for(;start>0;start--)
                {
                    link.seek(start*4);
                    input.seek((link.readInt())*816+4);
                    S=record[0].readName(input);
                    if(en.compareTo(S)!=0)break;
                }
                for(;end<word_number;end++)
                {
                    link.seek(end*4);
                    input.seek((link.readInt())*816+4);
                    S=record[0].readName(input);
                    System.out.println(S+word_number);
                    if(en.compareTo(S)!=0)break;
                }
                start++;
                int start_temp=start;
                end--;
                int arry_length=end-start+1;
                record=new RandomAccessAccountRecordw[arry_length];
                System.out.println(start+"--"+end);
 for(int loop=0;loop<arry_length;loop++)
{
    record[loop]=new RandomAccessAccountRecordw();
                    link.seek(start*4);
                    input.seek((link.readInt())*816);
                    record[loop].read(input);
                    start++;
}
         //   System.out.println(record.getbangla());
               return start_temp;
               }

               if(en.compareTo(S)>0)
               {
                   beg=mid+1;
                   mid=(int)((beg+n)/2);
               }
                              if(en.compareTo(S)<0)
               {
                   n=mid-1;
                   mid=(int)((beg+n)/2);
               }


            }

            record[0].read( input );

            // end while
 // end catch
 // end catch
        return -1;
     }








// read and display records
     public RandomAccessAccountRecordw[] search(String St) throws Exception
     {
        RandomAccessAccountRecordw[] record = new RandomAccessAccountRecordw[1];

    record[0]=new RandomAccessAccountRecordw();


         //   int word_number=(int)input.length()/816;
            int word_number=(int)link.length()/4;
          //  link.seek(452*4);

     //       input.seek(0);
     //       record.read(input);
      //      return record;
            input.seek(link.readInt()*816+4);
      //      System.out.println(word_number+"   "+record.readName(input));
            int n=word_number;
            int beg=1;
            int mid=(int)((n+beg)/2);
            int l=1;
            while(true)
            {
            link.seek((mid-1)*4);
            if(mid>567)l=1;
            else l=0;
               if((mid<1||mid>word_number)||beg>n)break;
               link.seek((mid-1)*4);

               input.seek(((link.readInt())*816)+4);
               String S=record[0].readName(input);
         //   link.seek((mid-1)*4);
//System.out.println(S+"  "+mid+"  "+link.readInt());
        //           System.out.println("???"+S+"  "+mid);
               if(St.compareTo(S)==0)
               {
            //       System.out.println("??"+S);
            //   link.seek((mid-1)*4);

               link.seek((mid-1)*4);
               input.seek((link.readInt())*816);
                record[0].read(input);
                int start=mid-1,end=mid-1;
                for(;start>0;start--)
                {
                    link.seek(start*4);
                    input.seek((link.readInt())*816+4);
                    S=record[0].readName(input);
                    if(St.compareTo(S)!=0)break;
                }
                for(;end<word_number;end++)
                {
                    link.seek(end*4);
                    input.seek((link.readInt())*816+4);
                    S=record[0].readName(input);
                    System.out.println(S+word_number);
                    if(St.compareTo(S)!=0)break;
                }
                start++;
                end--;
                int arry_length=end-start+1;
                record=new RandomAccessAccountRecordw[arry_length];
                System.out.println(start+"--"+end);
 for(int loop=0;loop<arry_length;loop++)
{
    record[loop]=new RandomAccessAccountRecordw();
                    link.seek(start*4);
                    input.seek((link.readInt())*816);
                    record[loop].read(input);
                    start++;
}
         //   System.out.println(record.getbangla());
               return record;
               }

               if(St.compareTo(S)>0)
               {
                   beg=mid+1;
                   mid=(int)((beg+n)/2);
               }
                              if(St.compareTo(S)<0)
               {
                   n=mid-1;
                   mid=(int)((beg+n)/2);
               }
               

            }
            
            record[0].read( input );

            // end while
 // end catch
 // end catch
        return null;
     } // end method readRecords
     // close file and terminate application
     int insert(RandomAccessAccountRecordw rw) throws Exception
        {
                                         
         RandomAccessAccountRecordw temp=new RandomAccessAccountRecordw();
         
            RandomAccessAccountRecordw temp2=new RandomAccessAccountRecordw();
            
            String S=new String();
            S=rw.getenglish();

            int word_number=(int)link.length()/4;
System.out.println(word_number);
            for(int i=0;i<word_number;i++)
            {
                link.seek(i*4);
                input.seek((link.readInt()*RandomAccessAccountRecordw.SIZE)+4);

                int j=S.compareTo(rw.readName(input));
                if(j==0)
                {
                link.seek(i*4);
                input.seek((link.readInt()*RandomAccessAccountRecordw.SIZE)+4);
                RandomAccessAccountRecordw rrw=new RandomAccessAccountRecordw();
                rrw.read(input);
                if(rrw.getbangla().compareTo(rw.getbangla())==0&&rrw.getidentity()==rw.getidentity()&&rrw.getproperty()==rw.getproperty())return 0;
             /*    link.seek(i*4);
                input.seek((link.readInt()*RandomAccessAccountRecordw.SIZE));
                rw.write(input);
                System.out.println(1);
                    return 1;*/
                    for(;word_number>i;word_number--)
                    {
                    link.seek((word_number-1)*4);
             //       input.seek(link.readInt()*RandomAccessAccountRecordw.SIZE);
                  //  temp2.read(input);
                    int z=link.readInt();
                    link.seek((word_number)*4);
                //    input.seek(link.readInt()*RandomAccessAccountRecordw.SIZE);
                 //   temp2.write(input);
                    link.writeInt(z);
                    }
                    link.seek((word_number)*4);
               //     input.seek(link.readInt()*RandomAccessAccountRecordw.SIZE);
                    link.writeInt((int)(input.length()/816));
                    input.seek(input.length());
                    rw.write(input);
                  return 1;
                }

                if(j<0)
                {
                    for(;word_number>i;word_number--)
                    {
                    link.seek((word_number-1)*4);
             //       input.seek(link.readInt()*RandomAccessAccountRecordw.SIZE);
                  //  temp2.read(input);
                    int z=link.readInt();
                    link.seek((word_number)*4);
                //    input.seek(link.readInt()*RandomAccessAccountRecordw.SIZE);
                 //   temp2.write(input);
                    link.writeInt(z);
                    }
                    link.seek((word_number)*4);
               //     input.seek(link.readInt()*RandomAccessAccountRecordw.SIZE);
                    link.writeInt((int)(input.length()/816));
                    input.seek(input.length());
                    rw.write(input);
                  return 2;
                }

            }
  //                          System.out.println(input.length());
        //    input.seek(input.length());
        //    rw.write(input);
                    link.writeInt((int)(input.length()/816));
                    input.seek(input.length());
                    rw.write(input);
                System.out.println(3);
            return 0;
        }
     int insert(RandomAccessAccountRecordw rw,int command) throws Exception
        {

         RandomAccessAccountRecordw temp=new RandomAccessAccountRecordw();

            RandomAccessAccountRecordw temp2=new RandomAccessAccountRecordw();

            String S=new String();
            S=rw.getenglish();

            int word_number=(int)link.length()/4;
System.out.println(word_number);
            for(int i=0;i<word_number;i++)
            {
                link.seek(i*4);
                input.seek((link.readInt()*RandomAccessAccountRecordw.SIZE)+4);

                int j=S.compareTo(rw.readName(input));
                if(j==0)
                {
                link.seek(i*4);
                input.seek((link.readInt()*RandomAccessAccountRecordw.SIZE));
                rw.write(input);
                System.out.println(1);
                    return 1;
                }

                if(j<0)
                {
                    for(;word_number>i;word_number--)
                    {
                    link.seek((word_number-1)*4);
             //       input.seek(link.readInt()*RandomAccessAccountRecordw.SIZE);
                  //  temp2.read(input);
                    int z=link.readInt();
                    link.seek((word_number)*4);
                //    input.seek(link.readInt()*RandomAccessAccountRecordw.SIZE);
                 //   temp2.write(input);
                    link.writeInt(z);
                    }
                    link.seek((word_number)*4);
               //     input.seek(link.readInt()*RandomAccessAccountRecordw.SIZE);
                    link.writeInt((int)(input.length()/816));
                    input.seek(input.length());
                    rw.write(input);
                  return 2;
                }

            }
  //                          System.out.println(input.length());
        //    input.seek(input.length());
        //    rw.write(input);
                    link.writeInt((int)(input.length()/816));
                    input.seek(input.length());
                    rw.write(input);
                System.out.println(3);
            return 0;
        }
     public RandomAccessAccountRecordw[] read() throws IOException, Exception
     {
         int w=(int)input.length()/RandomAccessAccountRecordw.SIZE;
         System.out.println(input.length());
         RandomAccessAccountRecordw r[]=new RandomAccessAccountRecordw[w];
         for(int i=0;i<w;i++)
         {
             input.seek(i*RandomAccessAccountRecordw.SIZE);
             try{r[i].read(input);}
             catch(Exception e){}
          //   System.out.println(r.getenglish()+"   "+r.getbangla()+"   "+r.getidentity());

         }
         return r;
     }
     public void closeFile()
     {
        try // close file and exit
        {
           if ( input != null )
           {
               input.close();
               link.close();
            }
        } // end try
        catch ( IOException ioException )
        {
           System.err.println( "Error closing file." );
           System.exit( 1 );
        } // end catch
     } // end method closeFile
  } // end class search


