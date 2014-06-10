/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cd.syna.geotools.ihms;

import cd.syna.geotools.main.SplashScreen;
import cd.syna.geotools.utils.MySwingUtilities;
import java.awt.Component;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.JXHyperlink;

/**
 *
 * @author Mishka
 */
public class MainForm extends javax.swing.JFrame {

    private JXHyperlink hynewcity, hynewrestaurant, hylogout,
            hymapcontrol;
    
    private MySwingUtilities mUtils=new MySwingUtilities();
    private SplashScreen welcomepanel;
    private MapControlPanel mappanel;
    
    /** Creates new form MainForm */
    public MainForm() {
        initComponents();
        /** Initialisation de la frame */
        setTitle("SmartGeoTools 1.0");
        /** call the method for creating task pane */
        createGeoToolsTaskPane();
        MapPrevisualization();
    }
    
    
    void createGeoToolsTaskPane(){
        /** HyperLink for cities */
        hynewcity=new JXHyperlink(new_city_action);
        hynewcity.setText("Visualiser les cités");
        hynewcity.setIcon(new ImageIcon(getClass().getResource("/cd/syna/geotools/res/ecole.png")));
        jXt_navigation.add(hynewcity);
        /** HyperLink Logout */
        hymapcontrol=new JXHyperlink();
        hymapcontrol.setText("Afficher la Map");
        hymapcontrol.setIcon(new ImageIcon(getClass().getResource("/cd/syna/geotools/res/search.png")));
        jXtmapcontrol.add(hymapcontrol);
        
    // ------------------------------------------------------------------------------------------------------------------    
        /** Permet de rendre les taskpane collapsable (si cela se dit en anglais... lol !!!) */
        jXt_navigation.setCollapsed(true);
        jXtmapcontrol.setCollapsed(true);
        
    }
    
    /** Define all actions for our hyper link */
    // //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    Action new_city_action=new AbstractAction(){
           
            public void actionPerformed(ActionEvent e){
                addCityMode();
                System.out.println("Nouvelle cité a été créée !"); // pas obligatoire d'ajouter cette ligne de code
            
            }
    };
    /** Action for MapControl  */
    Action mapcontrol_action=new AbstractAction(){
        public void actionPerformed(ActionEvent e){
            addMapcontrolMode();
        }
    };
    
    /** Action to allow user to logout  */
    Action logout_action=new AbstractAction(){
        public void actionPerformed(ActionEvent e){
            if(hymapcontrol.isEnabled()){
                //Put one method here in case the hymapcontrol is active
                
            }else{
                if(JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment quitter ?")==JOptionPane.YES_NO_OPTION){
                    System.exit(0);
                }else{
                    return;
                }
            }
        }
    };
    
    // //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    // ------------------------------------------------------------------------------------------------------------------
    void addCityMode(){
        MySwingUtilities.setContentPane(ParentContent_panel, new CityPanel());
    }
    
    void addMapcontrolMode(){
        MySwingUtilities.setContentPane(main_panel, new MapControlPanel());
    }
    
    // ------------------------------------------------------------------------------------------------------------------

    void enableDisableHyperlinks(boolean enableOrDisable){
        Component[] c=this.getComponents();
        for(int i=0;i<c.length;i++){
            if(c[i].getClass().equals(JXHyperlink.class)){
                c[i].setEnabled(enableOrDisable);
            }
        }
    }
    
    void MapPrevisualization(){
        MySwingUtilities.setContentPane(main_panel, new UsersConnectPanel());
       // hynewcity.setEnabled(false);
        hynewcity.setEnabled(true);
    }
    
    
    public void connectToMode(){
        
        //this will enable all HyperLinks
        hynewcity.setEnabled(true); // to do the same with others hyper links
        hymapcontrol.setEnabled(true);
        
        addCityMode(); //this will be replace by the default map mode
        
        jXTaskPaneContainer1.setVisible(true);
        
        ParentContent_panel.repaint();
        ParentContent_panel.revalidate();
        
        
    }
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXHeader1 = new org.jdesktop.swingx.JXHeader();
        ParentContent_panel = new javax.swing.JPanel();
        jXTaskPaneContainer1 = new org.jdesktop.swingx.JXTaskPaneContainer();
        jXtmapcontrol = new org.jdesktop.swingx.JXTaskPane();
        jXt_navigation = new org.jdesktop.swingx.JXTaskPane();
        jXtAdmin = new org.jdesktop.swingx.JXTaskPane();
        main_panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        org.jdesktop.swingx.VerticalLayout verticalLayout1 = new org.jdesktop.swingx.VerticalLayout();
        verticalLayout1.setGap(14);
        jXTaskPaneContainer1.setLayout(verticalLayout1);

        jXtmapcontrol.setName("jxtaskpMapControl"); // NOI18N
        jXtmapcontrol.setTitle("Map Control & Navigation");
        jXTaskPaneContainer1.add(jXtmapcontrol);

        jXt_navigation.setName("jxtaskpNavigation"); // NOI18N
        jXt_navigation.setTitle("Current Navigation");
        jXTaskPaneContainer1.add(jXt_navigation);

        jXtAdmin.setName("jxtaskpAdmin"); // NOI18N
        jXtAdmin.setTitle("Administration");
        jXTaskPaneContainer1.add(jXtAdmin);

        javax.swing.GroupLayout main_panelLayout = new javax.swing.GroupLayout(main_panel);
        main_panel.setLayout(main_panelLayout);
        main_panelLayout.setHorizontalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        main_panelLayout.setVerticalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ParentContent_panelLayout = new javax.swing.GroupLayout(ParentContent_panel);
        ParentContent_panel.setLayout(ParentContent_panelLayout);
        ParentContent_panelLayout.setHorizontalGroup(
            ParentContent_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParentContent_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jXTaskPaneContainer1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ParentContent_panelLayout.setVerticalGroup(
            ParentContent_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParentContent_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ParentContent_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jXTaskPaneContainer1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jXHeader1, javax.swing.GroupLayout.DEFAULT_SIZE, 966, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(ParentContent_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jXHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ParentContent_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ParentContent_panel;
    private org.jdesktop.swingx.JXHeader jXHeader1;
    private org.jdesktop.swingx.JXTaskPaneContainer jXTaskPaneContainer1;
    private org.jdesktop.swingx.JXTaskPane jXtAdmin;
    private org.jdesktop.swingx.JXTaskPane jXt_navigation;
    private org.jdesktop.swingx.JXTaskPane jXtmapcontrol;
    private javax.swing.JPanel main_panel;
    // End of variables declaration//GEN-END:variables
}
