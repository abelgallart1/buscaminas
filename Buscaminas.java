
import java.awt.Color;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Component;
import java.awt.Event;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abel
 */
public class Buscaminas extends javax.swing.JFrame {

    /**
     * Creates new form Buscaminas
     */
    
    Random ran=new Random();
    dimension d=new dimension(this,true);
    String [][]matris;
    JButton b[][];
    JLabel l[][];
    
    public Buscaminas() {
        
        initComponents();
        
        d.setLocationRelativeTo(null);
        d.setVisible(true);
         while (d.ancho.getValue()*d.largo.getValue()<d.bombas.getValue()) 
         
        { javax.swing.JOptionPane.showMessageDialog
                                (null,"Error","Mas Bombas que casillas....",javax.swing.JOptionPane.OK_OPTION);d.setVisible(true);
                                }
       
        matris=new String[d.ancho.getValue()][d.largo.getValue()];
          for(int x=0;x<d.ancho.getValue();x++) for(int y=0;y<d.largo.getValue();y++) {matris[x][y]="";   }
          
        int cont=0;
        while(cont<d.bombas.getValue()){
        int x=(int)(d.ancho.getValue()*ran.nextFloat());
        int y=(int)(d.largo.getValue()*ran.nextFloat());
        if (!matris[x][y].equals("B")) { matris[x][y]="B";cont++;}
        }
        
        this.setLocationRelativeTo(null);
       
        
        for(int x=0;x<d.ancho.getValue();x++)
        for(int y=0;y<d.largo.getValue();y++)
        {     
           int c=0;
         
          try{if (matris[x-1][y].equals("B"))c++;}catch(Exception e){;}
          try{if (matris[x-1][y-1].equals("B"))c++;;}catch(Exception e){;}
          try{ if (matris[x][y-1].equals("B"))c++;;}catch(Exception e){;}
          try{if (matris[x+1][y-1].equals("B"))c++;;}catch(Exception e){;}
          try{if (matris[x+1][y].equals("B"))c++;;}catch(Exception e){;}
          try{if (matris[x+1][y+1].equals("B"))c++;;}catch(Exception e){;}
          try{if (matris[x][y+1].equals("B"))c++;;}catch(Exception e){;}
          try{if (matris[x-1][y+1].equals("B"))c++;;}catch(Exception e){;}
          
         if (!matris[x][y].equals("B")) matris[x][y]=c+"";    
         
         if (c==0&&!matris[x][y].equals("B")) matris[x][y]=""; 
        }
    
       b=new JButton[d.ancho.getValue()][d.largo.getValue()];
       l=new JLabel[d.ancho.getValue()][d.largo.getValue()];
       
        for(int x=0;x<d.ancho.getValue();x++)
        for(int y=0;y<d.largo.getValue();y++)
        {     
             l[x][y]=new JLabel();
             l[x][y].setText(" "+matris[x][y]);
             b[x][y]=new JButton();
            
            jPanel2.add(b[x][y], new org.netbeans.lib.awtextra.AbsoluteConstraints(x*20,y*20,25,25));
       
            b[x][y].addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
            b[x][y].addActionListener(new java.awt.event.ActionListener() {
             
                 
       public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
            jPanel2.add(l[x][y], new org.netbeans.lib.awtextra.AbsoluteConstraints(x*20,y*20,25,25));
          
        }
        
    
    
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 660));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Buscaminas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buscaminas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buscaminas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buscaminas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buscaminas().setVisible(true);
            }
        });
    }
    
    public void analiza(JButton bot){
     if (!bot.isVisible()) return ;
     bot.setVisible(false);
    
     int x=bot.getX()/20;
    int y=bot.getY()/20;
  
   
        
        if (matris[x][y].equals("")){ 
          
          try{ analiza(b[x-1][y]) ;}catch(Exception e){;}
          try{ analiza(b[x-1][y-1]);}catch(Exception e){;}
          try{ analiza(b[x][y-1]);}catch(Exception e){;}
          try{ analiza(b[x+1][y-1]);}catch(Exception e){;}
          try{ analiza(b[x+1][y]);}catch(Exception e){;}
          try{ analiza(b[x+1][y+1]);}catch(Exception e){;}
          try{ analiza(b[x][y+1]);}catch(Exception e){;}
          try{ analiza(b[x-1][y+1]);}catch(Exception e){;}
        
          
          
            
        
           }
       
        
    
        }
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        
        Component com=((Component) evt.getSource());
        

        int x=com.getX()/20;
        int y=com.getY()/20;
        
////////////////////////////////////////has perdido
       
        if (matris[x][y].equals("B"))  {
            
            javax.swing.JOptionPane.showMessageDialog
                                (null,"Has Perdido","Fin del juego....",javax.swing.JOptionPane.OK_OPTION); 
        jPanel2.removeAll();
       
        d.setLocationRelativeTo(null);
        
        d.setVisible(true);
        while (d.ancho.getValue()*d.largo.getValue()<d.bombas.getValue()) 
         
        { javax.swing.JOptionPane.showMessageDialog
                                (null,"Error","Mas Bombas que casillas....",javax.swing.JOptionPane.OK_OPTION);d.setVisible(true);
                                }
        
        matris=new String[d.ancho.getValue()][d.largo.getValue()];
        
        for(int i=0;i<d.ancho.getValue();i++) for(int j=0;j<d.largo.getValue();j++) {matris[i][j]="";   }
          
        int cont=0;
        while(cont<d.bombas.getValue()){
        int i=(int)(d.ancho.getValue()*ran.nextFloat());
        int j=(int)(d.largo.getValue()*ran.nextFloat());
        if (!matris[i][j].equals("B")) { matris[i][j]="B";cont++;}
        }
        
        this.setLocationRelativeTo(null);
       
        
        for(int i=0;i<d.ancho.getValue();i++)
        for(int j=0;j<d.largo.getValue();j++)
        {     
           int c=0;
         
          try{if (matris[i-1][j].equals("B"))c++;}catch(Exception e){;}
          try{if (matris[i-1][j-1].equals("B"))c++;;}catch(Exception e){;}
          try{ if (matris[i][j-1].equals("B"))c++;;}catch(Exception e){;}
          try{if (matris[i+1][j-1].equals("B"))c++;;}catch(Exception e){;}
          try{if (matris[i+1][j].equals("B"))c++;;}catch(Exception e){;}
          try{if (matris[i+1][j+1].equals("B"))c++;;}catch(Exception e){;}
          try{if (matris[i][j+1].equals("B"))c++;;}catch(Exception e){;}
          try{if (matris[i-1][j+1].equals("B"))c++;;}catch(Exception e){;}
          
         if (!matris[i][j].equals("B")) matris[i][j]=c+"";    
         
         if (c==0&&!matris[i][j].equals("B")) matris[i][j]=""; 
        }
    
       b=new JButton[d.ancho.getValue()][d.largo.getValue()];
       l=new JLabel[d.ancho.getValue()][d.largo.getValue()];
       
        for(int i=0;i<d.ancho.getValue();i++)
        for(int j=0;j<d.largo.getValue();j++)
        {     
             l[i][j]=new JLabel();
             l[i][j].setText(" "+matris[i][j]);
             b[i][j]=new JButton();
            
            jPanel2.add(b[i][j], new org.netbeans.lib.awtextra.AbsoluteConstraints(i*20,j*20,25,25));
            
            b[i][j].addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
            b[i][j].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
            jPanel2.add(l[i][j], new org.netbeans.lib.awtextra.AbsoluteConstraints(i*20,j*20,25,25));
          
        }
        jPanel2.repaint();
       jPanel2.validate();
        return;
        
        }
///////////////////////////////////////////////////        
        if (matris[x][y].equals("")) analiza(b[x][y]);
        
        b[x][y].setVisible(false);
        
        
////////////////////////////has ganado
 int cont1=0;
 for(int i=0;i<d.ancho.getValue();i++) for(int j=0;j<d.largo.getValue();j++) if ( b[i][j].isVisible())  cont1++;   
 if (cont1==d.bombas.getValue())           
     {
            
            javax.swing.JOptionPane.showMessageDialog
                                (null,"Has Ganado","Fin del juego....",javax.swing.JOptionPane.OK_OPTION); 
        jPanel2.removeAll();
       
        d.setLocationRelativeTo(null);
        d.setVisible(true);
        while (d.ancho.getValue()*d.largo.getValue()<d.bombas.getValue()) 
         
        { javax.swing.JOptionPane.showMessageDialog
                                (null,"Error","Mas Bombas que casillas....",javax.swing.JOptionPane.OK_OPTION);d.setVisible(true);
                                }
       
        
        matris=new String[d.ancho.getValue()][d.largo.getValue()];
        
        for(int i=0;i<d.ancho.getValue();i++) for(int j=0;j<d.largo.getValue();j++) {matris[i][j]="";   }
          
        int cont=0;
        while(cont<d.bombas.getValue()){
        int i=(int)(d.ancho.getValue()*ran.nextFloat());
        int j=(int)(d.largo.getValue()*ran.nextFloat());
        if (!matris[i][j].equals("B")) { matris[i][j]="B";cont++;}
        }
        
        this.setLocationRelativeTo(null);
       
        
        for(int i=0;i<d.ancho.getValue();i++)
        for(int j=0;j<d.largo.getValue();j++)
        {     
           int c=0;
         
          try{if (matris[i-1][j].equals("B"))c++;}catch(Exception e){;}
          try{if (matris[i-1][j-1].equals("B"))c++;;}catch(Exception e){;}
          try{ if (matris[i][j-1].equals("B"))c++;;}catch(Exception e){;}
          try{if (matris[i+1][j-1].equals("B"))c++;;}catch(Exception e){;}
          try{if (matris[i+1][j].equals("B"))c++;;}catch(Exception e){;}
          try{if (matris[i+1][j+1].equals("B"))c++;;}catch(Exception e){;}
          try{if (matris[i][j+1].equals("B"))c++;;}catch(Exception e){;}
          try{if (matris[i-1][j+1].equals("B"))c++;;}catch(Exception e){;}
          
         if (!matris[i][j].equals("B")) matris[i][j]=c+"";    
         
         if (c==0&&!matris[i][j].equals("B")) matris[i][j]=""; 
        }
    
       b=new JButton[d.ancho.getValue()][d.largo.getValue()];
       l=new JLabel[d.ancho.getValue()][d.largo.getValue()];
       
        for(int i=0;i<d.ancho.getValue();i++)
        for(int j=0;j<d.largo.getValue();j++)
        {     
             l[i][j]=new JLabel();
             l[i][j].setText(" "+matris[i][j]);
             b[i][j]=new JButton();
            
            jPanel2.add(b[i][j], new org.netbeans.lib.awtextra.AbsoluteConstraints(i*20,j*20,25,25));
            
            b[i][j].addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
            b[i][j].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
            jPanel2.add(l[i][j], new org.netbeans.lib.awtextra.AbsoluteConstraints(i*20,j*20,25,25));
          
        }
        jPanel2.repaint();
       jPanel2.validate();
        return;
        
        }        
            
     
       
//////////////////////////
        
          
      
        // TODO add your handling code here:
    }                                        

 private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {                                      
       
        Component com=((Component) evt.getSource());
        

        int x=com.getX()/20;
        int y=com.getY()/20;
    
        if (evt.getModifiers()==Event.META_MASK) com.setBackground(Color.red);
        

// TODO add your handling code here:
    }    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

}
