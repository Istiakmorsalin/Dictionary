package javaapplication1.etb;




import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JEditorPane;
import javax.swing.JOptionPane;
import javax.swing.text.AbstractDocument.Content;
import javax.swing.text.Utilities;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * newword.java
 *
 *
 */

/**
 *
 * @author user
 */
public class newword extends javax.swing.JFrame {

    private int p=1;
    private int iden=0;
    private int sc=0;
    private String eng[]={""};
    private String S[]={"Noun","Adjective","Verb","Adverb","Preposition"};
    private String S1[]={"Present","Past","Past Participle","All type","Past & Past Participle Same","Present & Past Participle Same"};
    private String S2[]={"Person","thing","Place","Time","Animal","Job","Another","name","event"};
    private String S3[]={"Quality","Quantity","Number","Pronominal"};
    private int mode=1;
   // confusion co=new confusion();
    int i;
    /** Creates new form newword */
    public newword() {
        initComponents();
        System.out.println(HIDE_ON_CLOSE);
        english.setText(eng[sc]);
        sc++;
        mode=1;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        list1 = new java.awt.List();
        jLabel2 = new javax.swing.JLabel();
        english = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        bangla = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        c = new java.awt.Choice();
        c2 = new java.awt.Choice();
        jLabel6 = new javax.swing.JLabel();
        proper = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("english:");

        english.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                englishActionPerformed(evt);
            }
        });

        jLabel3.setText("bangla:");

        bangla.setFont(new java.awt.Font("Siyam Rupali", 0, 11)); // NOI18N

        jLabel4.setText("identity:");

        jButton1.setText("ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("property:");

        c.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                cComponentShown(evt);
            }
        });
        c.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cItemStateChanged(evt);
            }
        });

        c2.setForeground(new java.awt.Color(51, 51, 51));
        c2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c2MouseClicked(evt);
            }
        });
        c2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                c2ItemStateChanged(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(204, 204, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Insert New Word");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jLabel6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel6KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(proper, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jButton2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(english, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                                .addComponent(bangla, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(c, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(c2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                        .addContainerGap(14, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(english, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(bangla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(proper, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        c2.addItem("");
        c2.addItem(S[0]);
        c2.addItem(S[1]);
        c2.addItem(S[2]);
        c2.addItem(S[3]);
        c2.addItem(S[4]);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void englishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_englishActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_englishActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

            //System.out.println("III"+mode);
            RandomAccessAccountRecordw record = null;
        try {
            record = new RandomAccessAccountRecordw();
        } catch (Exception ex) {
            Logger.getLogger(newword.class.getName()).log(Level.SEVERE, null, ex);
        }
            search se = new search();
        try {
            record.setenglish(english.getText().toLowerCase());
        } catch (Exception ex) {
            Logger.getLogger(newword.class.getName()).log(Level.SEVERE, null, ex);
        }
            String Sa = new String();
            Sa = bangla.getText();
        try {
            record.setbangla(Sa);
        } catch (Exception ex) {
            Logger.getLogger(newword.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            record.setproperty(p);
        } catch (Exception ex) {
            Logger.getLogger(newword.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            record.setidentity(iden);
        } catch (Exception ex) {
            Logger.getLogger(newword.class.getName()).log(Level.SEVERE, null, ex);
        }
            record.id = 1;
            se.openFile();
            if (mode == 1) {
                //RandomAccessFile input=new RandomAccessFile("onu.dat","rw");
                //   RandomAccessAccountRecordw record = new RandomAccessAccountRecordw();
                int i = 0;
                int j = 1;
                record.id = 1;
            try {
                record.setproperty(p);
            } catch (Exception ex) {
                Logger.getLogger(newword.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                record.setidentity(iden);
            } catch (Exception ex) {
                Logger.getLogger(newword.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                RandomAccessFile input = new RandomAccessFile("onu.dat", "rw");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(newword.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                int te=se.insert(record);
             //   if(te==0)
             //    JOptionPane.showMessageDialog( this,"already added","message", JOptionPane.PLAIN_MESSAGE );
             //   else
                 JOptionPane.showMessageDialog( this,"Accepted","message", JOptionPane.PLAIN_MESSAGE );
            } catch (Exception ex) {
                Logger.getLogger(newword.class.getName()).log(Level.SEVERE, null, ex);
            }
                se.closeFile();
                english.setText("");
                bangla.setText("");
                c2.select(0);
                c.removeAll();
                /*       if(sc<0)
                {
                if(sc%2==1)
                {
                english.setText(eng[sc/2]+"d");
                }
                else{
                english.setText(eng[sc/2]);
                bangla.setText("");
                }
                sc++;
                }*/

            }
            if (mode == 2) {
                try {
                    se.insert(record,1);
                 JOptionPane.showMessageDialog( this,"Accepted","message", JOptionPane.PLAIN_MESSAGE );
                    this.setVisible(false);
               //     co.accessfor_newword(bangla.getText(), iden, p, i);
                    se.closeFile();

                } //    ReadRandomFile r = new ReadRandomFile();
                //    r.openFile();
                //   r.readRecords();
                catch (Exception ex) {
                    Logger.getLogger(newword.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(mode==3)
            {
                 try {
                    se.insert(record,1);
                 JOptionPane.showMessageDialog( this,"Accepted","message", JOptionPane.PLAIN_MESSAGE );
                    this.setVisible(false);
                    se.closeFile();

                } //    ReadRandomFile r = new ReadRandomFile();
                //    r.openFile();
                //   r.readRecords();
                catch (Exception ex) {
                    Logger.getLogger(newword.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            //    ReadRandomFile r = new ReadRandomFile();
            //    r.openFile();
            //   r.readRecords();
            //    ReadRandomFile r = new ReadRandomFile();
            //    r.openFile();
            //   r.readRecords();

            //    ReadRandomFile r = new ReadRandomFile();
            //    r.openFile();
            //   r.readRecords();

        //    ReadRandomFile r = new ReadRandomFile();
        //    r.openFile();
         //   r.readRecords();

                JEditorPane jep=new JEditorPane();
            try {
                String ebangla=encrypt(record.getbangla());
                jep.setPage("http://www.onubadok1418.site40.net/php.php?english=" + record.getenglish()+"&&bangla="+ebangla+"&&identity="+record.getidentity()+"&&property="+record.getproperty());
            } catch (Exception ex) {
                Logger.getLogger(newword.class.getName()).log(Level.SEVERE, null, ex);
            }
        

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_cComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_cComponentShown

    private void c2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_c2MouseClicked

    private void c2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_c2ItemStateChanged
        // TODO add your handling code here:
        int j=c2.getSelectedIndex();
        if(j==0)
        {
            iden=0;
            c.removeAll();
        }
        if(j==3)
        {
            c.removeAll();
            iden=4;
            c.addItem(S1[0]);
            c.addItem(S1[1]);
            c.addItem(S1[2]);
            c.addItem(S1[3]);
            c.addItem(S1[4]);
            c.addItem(S1[5]);
        }
        if(j==1)
        {
            c.removeAll();
            iden=1;
            c.addItem(S2[0]);
            c.addItem(S2[1]);
            c.addItem(S2[2]);
            c.addItem(S2[3]);
            c.addItem(S2[4]);
            c.addItem(S2[5]);
            c.addItem(S2[6]);
            c.addItem(S2[7]);
            c.addItem(S2[8]);
        }
        if(j==2)
        {
            c.removeAll();
            iden=12;
            c.addItem(S3[0]);
            c.addItem(S3[1]);
            c.addItem(S3[2]);
            c.addItem(S3[3]);
        }
        if(j==4)
        {
            iden=13;
            c.removeAll();
        }
        if(j==5)
        {
            iden=20;
            c.removeAll();
        }
    }//GEN-LAST:event_c2ItemStateChanged

    private void cItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cItemStateChanged
        // TODO add your handling code here:
        int j=c2.getSelectedIndex();
            int k=c.getSelectedIndex();
        if(j==3)
        {

        if(k==0)
        {
            p=1;
        }
        else if(k==1)
        {
            iden=6;
            p=2;
        }
        else if(k==2)
        {
            iden=7;
            p=3;
        }
        else if(k==3)
        {
            iden=10;
            p=4;
        }
        else if(k==4)
        {
            iden=8;
            p=5;
        }
        else if(k==5)
        {
            iden=9;
            p=6;
        }
        }
        else p=c.getSelectedIndex()+1;
    }//GEN-LAST:event_cItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel6KeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jLabel6KeyPressed
int coun=0;
    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        if(coun==10){
                                                                                                       JOptionPane.showMessageDialog( newword.this,"Onubadok 1418 is bassed on Translation from English to bangla\n  Version  :  1.1\n  Vendor   :  Dhumketu\n   Credit   :   Muzahidul Islam , CSE 09 KUET\nStructure design:Masud Rabbani , CSE 09 KUET","About", JOptionPane.PLAIN_MESSAGE );
        }coun++;
    }//GEN-LAST:event_jLabel6MouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bangla;
    private java.awt.Choice c;
    private java.awt.Choice c2;
    private javax.swing.JTextField english;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private java.awt.List list1;
    private javax.swing.JLabel proper;
    // End of variables declaration//GEN-END:variables

private String englobal;
void access_confusion(String e,String b,int iden,int pro,int i_,int cat,int known)
{

    System.out.println(e+b);
    englobal=e.substring(2,e.length());
    english.setText(e.substring(2,e.length()));
    english.setEnabled(false);
    bangla.setText(b.substring(2,b.length()));
 //   if(iden==1)c2.select(1);
    mode=3;
    i=i_;
}

    private String encrypt(String bangla) {
        String s ="";
        for(int k=0;k<bangla.length();k++)
        {
          s+=Integer.toString(bangla.charAt(k))+"-";
        }
        return s;
    }
}
