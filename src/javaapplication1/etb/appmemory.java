package javaapplication1.etb;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class appmemory {
    public static void main(String ar[]) throws Exception
    {
       setstore(new interfacestore());
        try {
            interfacestore ifcs = getstore();
            System.out.println(ifcs.language);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(appmemory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static interfacestore getstore() throws ClassNotFoundException
    {


        interfacestore is=new interfacestore();
FileInputStream inStream = null;
        try {
                            File f=new File("src//1.txt");
        String Ss=f.getAbsolutePath().substring(0,f.getAbsolutePath().length()-9);
            inStream = new FileInputStream(Ss+"appro.onu");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(appmemory.class.getName()).log(Level.SEVERE, null, ex);
        }
ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(inStream);
        } catch (IOException ex) {
            Logger.getLogger(appmemory.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            is=(interfacestore) in.readObject();
        } catch (IOException ex) {
            Logger.getLogger(appmemory.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            in.close();
        } catch (IOException ex) {
            Logger.getLogger(appmemory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return is;
    }




    public static property_tree_data get_tree_info() throws ClassNotFoundException
    {


        property_tree_data ptd=new property_tree_data();
FileInputStream inStream = null;
        try {
                            File f=new File("src//1.txt");
        String Ss=f.getAbsolutePath().substring(0,f.getAbsolutePath().length()-9);
            inStream = new FileInputStream(Ss+"tree.onu");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(appmemory.class.getName()).log(Level.SEVERE, null, ex);
        }
ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(inStream);
        } catch (IOException ex) {
            Logger.getLogger(appmemory.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ptd=(property_tree_data) in.readObject();
        } catch (IOException ex) {
            Logger.getLogger(appmemory.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            in.close();
        } catch (IOException ex) {
            Logger.getLogger(appmemory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ptd;
    }




    public static void setstore(interfacestore ifs)
    {
FileOutputStream outStream = null;
        try {
                            File f=new File("src//1.txt");
        String Ss=f.getAbsolutePath().substring(0,f.getAbsolutePath().length()-9);
            outStream = new FileOutputStream(Ss+"appro.onu");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(appmemory.class.getName()).log(Level.SEVERE, null, ex);
        }
ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(outStream);
        } catch (IOException ex) {
            Logger.getLogger(appmemory.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            out.writeObject(ifs);
        } catch (IOException ex) {
            Logger.getLogger(appmemory.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            out.flush();
        } catch (IOException ex) {
            Logger.getLogger(appmemory.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(appmemory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }




    public static void set_tree_info(property_tree_data ptd)
    {
FileOutputStream outStream = null;
        try {
                            File f=new File("src//1.txt");
        String Ss=f.getAbsolutePath().substring(0,f.getAbsolutePath().length()-9);
            outStream = new FileOutputStream(Ss+"appro.onu");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(appmemory.class.getName()).log(Level.SEVERE, null, ex);
        }
ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(outStream);
        } catch (IOException ex) {
            Logger.getLogger(appmemory.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            out.writeObject(ptd);
        } catch (IOException ex) {
            Logger.getLogger(appmemory.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            out.flush();
        } catch (IOException ex) {
            Logger.getLogger(appmemory.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(appmemory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    
}
