/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cd.syna.geotools.utils;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Mishka
 */
public class MySwingUtilities {
    
    public MySwingUtilities(){
        /**Null constructor */
    }
    
    public static void setContentPane(JPanel parent, JPanel target){
        parent.removeAll();
        parent.repaint();
        parent.revalidate();
        parent.setLayout(new BorderLayout());
        
        parent.add(target,BorderLayout.CENTER);
        parent.repaint();
        parent.revalidate();
        
    }
    
    public static int showConfirmDialog(String message){
        return JOptionPane.showConfirmDialog(null, message);
    }
    
    public static void showMessageDialog(String message){
        JOptionPane.showMessageDialog(null, message);
    }
    
    
}
