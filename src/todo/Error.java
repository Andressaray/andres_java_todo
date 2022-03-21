/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo;
import javax.swing.JOptionPane;
/**
 *
 * @author PC
 */
public class Error {
    public void ShowError(Exception e) {
        System.out.println("Errror"+ e);
        JOptionPane.showMessageDialog(null, "Something is wrong", "ERROR", JOptionPane.ERROR_MESSAGE);
        System.exit(0);
    }
}
