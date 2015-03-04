package javaapplication1.etb;




import java.util.logging.Level;
import java.util.logging.Logger;

   public class word
   {
      public int id;
       private String english;
 //     private int number;
      private String bangla;
      private int identity;
      private int property;
  //    private int confusion[]=new int[15];
      private int authority;
   /*  public word( int num, String first, String last[], double bal ) throws Exception
     {
        try {
            setnumber(num);
        } catch (Exception ex) {
            Logger.getLogger(AccountRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        setenglish( first );
        setbangla( last );
        setBalance( bal );
     } // end four-argument AccountRecord constructor
     // set account number   */
      word()
      {
          id=0;
      }
           public void setid( int num )throws Exception
     {
        id = num;
     } // end method setAccount

     // get account number
     public int getid()
     {
        return id;
     } // end method getAccount
  /*   public void setnumber( int num )throws Exception
     {
        number = num;
     } // end method setAccount

     // get account number
     public int getnumber()
     {
        return number;
     } // end method getAccount           */

     // set first name
     public void setenglish( String first ) throws Exception
     {
        english = first;
     } // end method setFirstName

     // get first name
     public String getenglish() throws Exception
     {
        return english;
     } // end method getFirstName

     // set last name
     public void setbangla( String ban ) throws Exception
     {
            bangla=ban;
     } // end method setLastName

     // get last name
     public String getbangla() throws Exception
     {
        return bangla;
     } // end method getLastName
          public void setidentity( int iden ) throws Exception
     {
            identity=iden;
     } // end method setLastName

     // get last name
     public int getidentity() throws Exception
     {
        return identity;
     } // end method getLastName
          public void setproperty( int pro ) throws Exception
     {
            property=pro;
     } // end method setLastName

     // get last name
     public int getproperty() throws Exception
     {
        return property;
     } // end method getLastName
   /*            public void setconfusion( int con ) throws Exception
     {
       
            confusion=con;
     } // end method setLastName

     // get last name
     public int[] getconfusion() throws Exception
     {
        return confusion;
     } // end method getLastName  */
     //public void setidentity( int iden[] ) throws Exception
   public void setauthority( int au ) throws Exception
     {
            authority=au;
     } // end method setLastName

     // get last name
     public int getauthority() throws Exception
     {
        return authority;
     } // end method getLastName
  } 

