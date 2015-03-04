package javaapplication1.etb;


import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.html.HTMLDocument;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * dictable.java
 *
 * Created on 11-May-2011, 16:14:45
 */

/**
 *
 * @author user
 */
public class dictable extends javax.swing.JPanel {
int tabcom;
TableModel tm;
    String iden[]={"Noun","Adjective","Verb","Adverb","Pronoun","Auxi Verb","Preposition"};
        String Sv[]={"Present","Past","Past Participle","All type","Past & Past Participle Same","Present & Past Participle Same"};
    String Sn[]={"Person","thing","Place","Time","Animal","Job","Another","name","event"};
    String ad[]={"Quality","Quantity","Number","Pronominal"};
    /** Creates new form dictable */
    RandomAccessAccountRecordw[] rawa;
    int[] linkf;
    public dictable(){
       

    //UIDefaults ui = UIManager.getLookAndFeel().getDefaults();
   // UIManager.put("RadioButton.focus", ui.getColor("control"));







            initComponents();
            addbutton.setVisible(false);
  // jTable1 = new JTable(tm) {
    //  public void tableChanged(TableModelEvent e) {
      //  super.tableChanged(e);
  //     repaint();
    //  }
    //};

            try {
                jEditorPane1.setFont(appmemory.getstore().bangla);
            } catch (Exception e) {
              //  Logger.getLogger(dictable.class.getName()).log(Level.SEVERE, null, ex);
            }
            jEditorPane1.setContentType("text/html");
           jEditorPane1.setContentType("text/html");
            Font font = jEditorPane1.getFont();
           String rule = "body{font-family:" + "Siyam Rupali" + ";" + "font-size:" + 12 + "pt;" + "}";
            ((HTMLDocument) jEditorPane1.getDocument()).getStyleSheet().addRule(rule);
            /**************************end ********* *********************************/
            ButtonGroup bg = new ButtonGroup();
            bg.add(englishradio);
            bg.add(banglaradio);
            search se = new search();
            File f = new File("src//1.txt");
            String Ss = f.getAbsolutePath().substring(0, f.getAbsolutePath().length() - 9);
            RandomAccessFile input = null;
        try {
            input = new RandomAccessFile(Ss + "onu.dat", "rw");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(dictable.class.getName()).log(Level.SEVERE, null, ex);
        }
            RandomAccessFile link = null;
        try {
            link = new RandomAccessFile(Ss + "link.txt", "rw");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(dictable.class.getName()).log(Level.SEVERE, null, ex);
        }
            se.openFile();
            tabcom = se.component();
            tabcom = tabcom / RandomAccessAccountRecordw.SIZE - 41;
            System.out.print(tabcom);
            try{
            rawa = new RandomAccessAccountRecordw[tabcom];
            linkf = new int[tabcom];
            }
            catch(Exception e){}
            
            System.out.println(tabcom);
            RandomAccessAccountRecordw rw = null;
            try {
                rw = new RandomAccessAccountRecordw();
            } catch (Exception ex) {
                Logger.getLogger(dictable.class.getName()).log(Level.SEVERE, null, ex);
            }
            // rw=se.read();
            String[] S = {"English", "Bangla", "Category", "Property"};
            tm = new DefaultTableModel(S, tabcom-15);
            JLabel jb = new JLabel();
            //jb.setText("muzahid");
            onubadok o = null;
           try {
                o = new onubadok();
            } catch (Exception ex) {
                Logger.getLogger(dictable.class.getName()).log(Level.SEVERE, null, ex);
            }
            int k;
            for (int kk = 15; kk < tabcom + 15; kk++) {
                k = kk - 15;
                try {
                    //   System.out.println(link.readInt()+" >< "+rw.getenglish());
                    link.seek(kk * 4);
                } catch (IOException ex) {
                    Logger.getLogger(dictable.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    linkf[kk] = link.readInt();
                    input.seek(linkf[kk] * RandomAccessAccountRecordw.SIZE);
                } catch (Exception e) {
                }
                try {
                    rw.read(input);
                } catch (IOException ex) {
                    Logger.getLogger(dictable.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(dictable.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    if (rw.getproperty() == 0) {
                        rw.setproperty(1);
                    }
                } catch (Exception ex) {
                    Logger.getLogger(dictable.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    tm.setValueAt("  " + rw.getenglish().replace("."," "), k, 0);
                } catch (Exception ex) {
                    Logger.getLogger(dictable.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    tm.setValueAt("  " + o.banglaFont(rw.getbangla()), k, 1);
                } catch (Exception ex) {
                    Logger.getLogger(dictable.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    if (rw.getidentity() == 1) {
                        tm.setValueAt("  " + iden[0], k, 2);
                        try {
                            tm.setValueAt("  " + Sn[rw.getproperty() - 1], k, 3);
                        } catch (Exception e) {
                        }
                    }
                } catch (Exception ex) {
                    Logger.getLogger(dictable.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    if (rw.getidentity() == 12) {
                        tm.setValueAt("  " + iden[1], k, 2);
                        try {
                            tm.setValueAt("  " + ad[rw.getproperty() - 1], k, 3);
                        } catch (Exception e) {
                        }
                    }
                } catch (Exception ex) {
                    Logger.getLogger(dictable.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    if (rw.getidentity() == 4 || rw.getidentity() == 6 || rw.getidentity() == 7) {
                        tm.setValueAt("  " + iden[2], k, 2);
                        try {
                            tm.setValueAt("  " + Sv[rw.getproperty() - 1], k, 3);
                        } catch (Exception e) {
                        }
                    }
                } catch (Exception ex) {
                    Logger.getLogger(dictable.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    if (rw.getidentity() == 2) {
                        tm.setValueAt("  " + iden[4], k, 2);
                    }
                } catch (Exception ex) {
                    Logger.getLogger(dictable.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    if (rw.getidentity() == 5) {
                        tm.setValueAt("  " + iden[5], k, 2);
                    }
                } catch (Exception ex) {
                    Logger.getLogger(dictable.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    if (rw.getidentity() == 20) {
                        tm.setValueAt("  " + iden[6], k, 2);
                    }
                } catch (Exception ex) {
                    Logger.getLogger(dictable.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    if (rw.getidentity() == 19) {
                        tm.setValueAt("  " + iden[3], k, 2);
                    }
                } catch (Exception ex) {
                    Logger.getLogger(dictable.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

           // jScrollPane1.setViewportView(jTable1);
            // CustomTableCellRenderer ct=new CustomTableCellRenderer();
            // ct.getTableCellRendererComponent(jTable1, "5", false, false, 0, 0);
            //jTable1.setDefaultRenderer(null, ct);
//tm.setValueAt(new JRadioButton(), 0, 0);


jTable1.setModel(tm);




            Font fon = new Font("Siyam Rupali", Font.PLAIN, 10);
            if (fon == null) {
                try {
                    jTable1.setFont(appmemory.getstore().bangla);
                } catch (Exception ex) {
                   // Logger.getLogger(dictable.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            se.closeFile();
            try {
                input.close();
            } catch (IOException ex) {
                Logger.getLogger(dictable.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                link.close();
            } catch (IOException ex) {
                Logger.getLogger(dictable.class.getName()).log(Level.SEVERE, null, ex);
            }


    }



    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        le = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        addbutton = new javax.swing.JButton();
        englishradio = new javax.swing.JRadioButton();
        banglaradio = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();

        le.setFont(new java.awt.Font("Siyam Rupali", 0, 14)); // NOI18N
        le.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                leCaretUpdate(evt);
            }
        });
        le.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leActionPerformed(evt);
            }
        });
        le.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                leInputMethodTextChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Search");

        addbutton.setBackground(new java.awt.Color(153, 255, 255));
        addbutton.setText("Add word");
        addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbuttonActionPerformed(evt);
            }
        });

        englishradio.setSelected(true);
        englishradio.setText("English");

        banglaradio.setText("Bangla");

        jButton1.setBackground(new java.awt.Color(185, 212, 179));
        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 153, 255));
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setFont(new java.awt.Font("Siyam Rupali", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setEnabled(false);
        jTable1.setFillsViewportHeight(true);
        jTable1.setFocusCycleRoot(true);
        jTable1.setFocusTraversalPolicyProvider(true);
        jTable1.setInheritsPopupMenu(true);
        jTable1.setRowHeight(24);
        jTable1.setSelectionBackground(new java.awt.Color(102, 102, 102));
        jTable1.setSurrendersFocusOnKeystroke(true);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(20);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
        );

        jEditorPane1.setEditable(false);
        jScrollPane2.setViewportView(jEditorPane1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(le, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(englishradio)
                .addGap(0, 0, 0)
                .addComponent(banglaradio)
                .addGap(2, 2, 2)
                .addComponent(addbutton)
                .addGap(6, 6, 6)
                .addComponent(jButton3)
                .addGap(6, 6, 6)
                .addComponent(jButton1)
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(le, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(englishradio))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(banglaradio))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(addbutton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void leInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_leInputMethodTextChanged
        // TODO add your handling code here:

    //   bangla.setText(onu.get_eng(onu,le.getText()));
      
    }//GEN-LAST:event_leInputMethodTextChanged

    private void leActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_leActionPerformed

    private void leCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_leCaretUpdate
        // TODO add your handling code here:
        i=0;
        int pos=0;
        int varify=0;
            String S=le.getText().toLowerCase();
//            System.out.println((int)S.charAt(0));
            if(S.compareTo("")==0);

                else if
            
                (S.charAt(0) < 500)
            {
                if(le.getText().compareTo("")==0)i=0;
        if(le.getText().compareTo("")!=0)
        {
            int n=tabcom;
            int beg=1;
            int mid=(n+beg)/2;
            String_super ss=new String_super();

            while(true)
            {
               if((mid<1||mid>tabcom)||beg>n)break;

System.out.println(jTable1.getValueAt(mid-1,0)+"   "+S+"   "+ss.compare(S,jTable1.getValueAt(mid-1,0).toString())+"  "+mid);
               if(ss.compare(S,jTable1.getValueAt(mid-1,0).toString())==0)
               {
                i=mid-1;
                System.out.println("*********");
        for(int z=mid;z<tabcom;z++)
        {
            if(ss.compare(S,jTable1.getValueAt(z,0).toString())!=0)
            {
                pos=z-1;
                break;
            }
        }
        for(int z=i-1;z>=0;z--)
        {
            if(ss.compare(S,jTable1.getValueAt(z,0).toString())!=0)
            {
                i=z+1;
                break;
            }
        }
                varify=1;
System.out.println(pos+"  "+i);
                //pos=i;
                break;
                
               }
                else if(ss.compare(S, jTable1.getValueAt(mid - 1, 0).toString()) > 0)
               {
    if(ss.compare(S,jTable1.getValueAt(mid-1,0).toString())>20000)varify=1;
    else varify=0;
    i=mid-1;
    pos=i;
    beg=mid+1;
                   mid=(int)(beg+n)/2;
               }
                else if(ss.compare(S, jTable1.getValueAt(mid - 1, 0).toString()) < 0)
               {
    if(ss.compare(S,jTable1.getValueAt(mid-1,0).toString())<20000)varify=1;
    else varify=0;
    i=mid-1;
    pos=i;
                   n=mid-1;
                   mid=(int)(beg+n)/2;
               }


            }
        }}
            else if(S.charAt(0)>500)
        {

                int n=tabcom;
            int beg=1;
            int mid=(n+beg)/2;
            String_super ss=new String_super();
int temp,previous=5000000,post;
for(int z=0;z<tabcom;z++)
{
    post=ss.compare(S,jTable1.getValueAt(z,1).toString());
    if(previous>post){
        previous=post;i=z;
        pos=i;
    }
    if(post==0)
    {
        i=z;
        pos=i;
        break;
    }
    varify=1;
}
        
        }
        if(varify==0){i++;pos++;}
jTable1.getSelectionModel().setSelectionInterval(i,pos);
load_editorpane(i,pos);
System.out.println(jScrollPane1.getHeight());
int hi=jScrollPane1.getHeight()/24;
if(pre>i)
jTable1.scrollRectToVisible(new Rectangle(jTable1.getCellRect(i-4, 0, true)));
else
jTable1.scrollRectToVisible(new Rectangle(jTable1.getCellRect(i+(hi-4), 0, true)));
pre=i;

    }//GEN-LAST:event_leCaretUpdate

    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttonActionPerformed
        // TODO add your handling code here:
 newword nw=new newword();
 nw.setDefaultCloseOperation(1);
         Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        nw.setLocation(new Point((screenSize.width-300) / 2,(screenSize.height-400) / 2));
 nw.setVisible(true);


    }//GEN-LAST:event_addbuttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            refresh();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(dictable.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(dictable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                int i=jTable1.getSelectedRow();
                if(i==-1)JOptionPane.showMessageDialog(this,"write the word in search field");//JOptionPane.showMessageDialog(this,"Onubadok 1418 is bassed on Translation from English to bangla\n  Version  :  1.1\n  Vendor   :  Dhumketu\n   Credit   :   Muzahid & Masud , CSE 09 KUET","About", JOptionPane.PLAIN_MESSAGE );
 else{
                newword nw=new newword();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        nw.setLocation(new Point((screenSize.width-300) / 2,(screenSize.height-400) / 2));
                nw.setVisible(true);
                nw.setDefaultCloseOperation(1);
                nw.access_confusion(jTable1.getValueAt(i,0).toString(),jTable1.getValueAt(i,1).toString(),0,0,i,0,0);
        }                   // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed
    
//private newword nw=new newword();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbutton;
    private javax.swing.JRadioButton banglaradio;
    private javax.swing.JRadioButton englishradio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField le;
    // End of variables declaration//GEN-END:variables
int i=0;
int pre=0;

private void refresh() throws FileNotFoundException, Exception
    {
search se=new search();
                File f=new File("src//1.txt");

              //  byte[] b=dicfile.getBytes();
        String Ss=f.getAbsolutePath().substring(0,f.getAbsolutePath().length()-9);
RandomAccessFile input = new RandomAccessFile( Ss+"onu.dat", "rw" );
RandomAccessFile link = new RandomAccessFile( Ss+"link.txt", "rw" );
String dicfile=fReadstring.readFileAsString( Ss+"onu.dat");
se.openFile();
            tabcom =se.component();
            tabcom=tabcom/RandomAccessAccountRecordw.SIZE-41;
            System.out.println(tabcom);
            RandomAccessAccountRecordw rw = new RandomAccessAccountRecordw();
           // rw=se.read();
            String S[]={"English","Bangla","Category","Property"};
tm=new DefaultTableModel(S,tabcom);
JLabel jb=new JLabel();
jb.setText("muzahid");
onubadok o=new onubadok();
    System.out.println(dicfile.length());
    int k;
for(int kk=2;kk<tabcom+2;kk++)
{
    k=kk-2;
 //   System.out.println(link.readInt()+" >< "+rw.getenglish());
    link.seek(kk*4);
    try{
    input.seek(link.readInt()*RandomAccessAccountRecordw.SIZE);
    }
    catch(Exception e){}
    rw.read(input);
   // int cou=link.readInt();
  //  rw.read(dicfile.substring(cou*RandomAccessAccountRecordw.SIZE,cou*RandomAccessAccountRecordw.SIZE+RandomAccessAccountRecordw.SIZE));
    tm.setValueAt("  "+rw.getenglish(),k,0);

    tm.setValueAt("  "+o.banglaFont(rw.getbangla()),k,1);
    if(rw.getidentity()==1)
    {
    tm.setValueAt("  "+iden[0],k,2);
    try{
    tm.setValueAt("  "+Sn[rw.getproperty()-1],k,3);
    }
    catch(Exception e){}
    }
    if(rw.getidentity()==12)
    {
    tm.setValueAt("  "+iden[1],k,2);
    try{
    tm.setValueAt("  "+ad[rw.getproperty()-1],k,3);
    }
    catch(Exception e){}
    }
    if(rw.getidentity()==4||rw.getidentity()==6||rw.getidentity()==7)
    {
    tm.setValueAt("  "+iden[2],k,2);
    try{
    tm.setValueAt("  "+Sv[rw.getproperty()-1],k,3);
        }
    catch(Exception e){}
    }
    if(rw.getidentity()==2)
    {
    tm.setValueAt("  "+iden[4],k,2);
    }
    if(rw.getidentity()==5)
    {
    tm.setValueAt("  "+iden[5],k,2);
    }
    if(rw.getidentity()==20)
    {
    tm.setValueAt("  "+iden[6],k,2);
    }
}
jTable1.setModel(tm);
jScrollPane1.setViewportView(jTable1);

 
}
private void load_editorpane(int i,int j)
    {
  String s="<a href=\"http:e"+Integer.toString(i)+"\">"+tm.getValueAt(i,0).toString()+"</a> :";
  for(int k=i;k<=j;k++)
  {
     s+="<a href=\"http:b"+Integer.toString(i)+"\">"+tm.getValueAt(k,1).toString()+"</a> ,";
  }
  jEditorPane1.setText(s);
}

    private class JTableImpl extends JTable {

        public JTableImpl(TableModel dm) {
            super(dm);
        }

        public void tableChanged(TableModelEvent e) {
            super.tableChanged(e);
            repaint();
        }
    }
}
