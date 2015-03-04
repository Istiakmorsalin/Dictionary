package javaapplication1.etb;



 import java.io.RandomAccessFile;
   import java.io.IOException;

   public class RandomAccessAccountRecordw extends word
   {
      public static final int SIZE = 816;


     // no-argument constructor calls other constructor with default values
     public RandomAccessAccountRecordw() throws Exception
     {
         id=0;
     } // end no-argument RandomAccessAccountRecord constructor

     // initialize a RandomAccessAccountRecord
     public RandomAccessAccountRecordw( int account, String firstName,
        String lastName, double balance ) throws Exception
     {
  //      super( account, firstName, lastName, balance );
     } // end four-argument RandomAccessAccountRecord constructor
     // read a record from specified RandomAccessFile

     public void read( RandomAccessFile file ) throws IOException, Exception
     {
         long l=file.getFilePointer();
        setid(file.readInt());
         setenglish( readName( file ) );
         file.seek(l+404);
 //        setnumber( file.readInt() );
        setbangla( readName( file ) );
         file.seek(l+804);
        setidentity( file.readInt() );
        setproperty(file.readInt());
  //      setconfusion( intary(file) );
        try{
        setauthority( file.readInt() );
         }
        catch(Exception e){}
     }
     public void read(String s ) throws IOException, Exception
     {
           try{
        setid(Integer.parseInt(s.substring(0,4)));
         }
           catch(Exception e){}
   //     System.out.println(Integer.parseInt(s.substring(0,4))+"f");
         setenglish(s.substring(5,404));
         System.out.println(s.substring(5,404));
 //        setnumber( file.readInt() );
        setbangla(s.substring(404,804));
        try{
        setidentity(Integer.parseInt(s.substring(804,808)));
        setproperty(Integer.parseInt(s.substring(808,812)));
  //      setconfusion( intary(file) );
        setauthority(Integer.parseInt(s.substring(812,816)));
         }
               catch(Exception e){}

     }
     // end method read
     // ensure that name is proper length
          private int[] intary( RandomAccessFile file ) throws IOException
     {
        int name[] = new int[15],temp;

        for ( int count = 0; count < 15; count++ )
        {
           temp = file.readInt();
           name[ count ] = temp;
        } // end for

        return name;
     } // end method readName
          private int[][] inttwoary( RandomAccessFile file ) throws IOException
     {
        int name[][] = new int[15][150],temp;

        for ( int count = 0; count < 15; count++ )
        {
           for(int j=0;j<150;j++)
           {
            temp = file.readInt();
           name[ count ][j] = temp;
           }
        } // end for

        return name;
     } // end method readName
     public String readName( RandomAccessFile file ) throws IOException
     {
        char name[] = new char[ 200 ], temp;
        int k=0,l=0;
        for ( int count = 0; count < name.length; count++ )
        {
           temp = file.readChar();
           if(temp==0){if(l==0){k=count;break;}}
           name[ count ] = temp;
        } // end for
String S=new String(name,0, k);
        return S;
     } // end method readName
     private String[] readNamea( RandomAccessFile file ) throws IOException
     {
        char name[] = new char[ 200 ], temp;
        String S[]=new String[15];
        for(int i=0;i<15;i++){
        for ( int count = 0; count < name.length; count++ )
        {
           temp = file.readChar();
           name[ count ] = temp;
        } // end for
        S[i]=new String(name).replace('\0',' ');
        }
        return S;
     }

     // write a record to specified RandomAccessFile
     public void write( RandomAccessFile file ) throws IOException, Exception
     {
         file.writeInt( getid() );
         writeName( file, getenglish() );
      //   file.writeInt( getnumber() );
        writeName( file, getbangla() );
         file.writeInt( getidentity() );
         file.writeInt( getproperty() );
         file.writeInt( getauthority() );


     } // end method write
     // write a name to file; maximum of 15 characters
     private void inta (RandomAccessFile file, int a[]) throws IOException
     {
         for(int i=0;i<15;i++)
             file.writeInt(a[i]);
     }
     private void intta (RandomAccessFile file, int a[][]) throws IOException
     {
         for(int i=0;i<15;i++)
             for(int j=0;j<150;j++)
             file.writeInt(a[i][j]);
     }
     private void writeName( RandomAccessFile file, String name )
        throws IOException
     {
        StringBuffer buffer = null;

        if ( name != null )
           buffer = new StringBuffer( name );
        else
           buffer = new StringBuffer( 200 );

        buffer.setLength( 200 );
        file.writeChars( buffer.toString() );
     } // end method writeName
     private void writeNamea( RandomAccessFile file, String name[] )
        throws IOException
     {
        StringBuffer buffer = null;
        for(int i=0;i<15;i++){
        if ( name != null )
           buffer = new StringBuffer( name[i] );
        else
           buffer = new StringBuffer( 200 );

        buffer.setLength( 200 );
        file.writeChars( buffer.toString() );}
     } // end method writeName
  } 