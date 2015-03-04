package javaapplication1.etb;


import java.io.Serializable;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class property_tree_data implements Serializable
{
    public static int parent=1;
    public static int child=2;
    private int element_num=0;
 //   private single_property_element property_element[]=new single_property_element[element_num];
    public void add(String property_address,String property_name,int parent_child)
    {
   //     single_property_element[] spe=new single_property_element[element_num+1];
  //      System.arraycopy(property_element, 0, spe, 0, element_num);
   //     spe[element_num+1].set_element_address(property_address);
   //    spe[element_num+1].set_element_name(property_name);
   //     appmemory.set_tree_info(this);
    }

}
