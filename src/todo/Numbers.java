/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Numbers {
    public int getNumber() {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
        return num;
    }
    
    public void showNumber(String message, int num) {
        JOptionPane.showMessageDialog(null, message + num);
    }
    
    public int randomNumber(){
       Random rand = new Random();
       int num = rand.nextInt(40 - 20)+ 20;
       return num;
    }
    public int[] getMinNumber(int num_1, int num_2){
        int[] nums = new int[2];
        if (num_1 > num_2){
            nums[0] = num_1;
            nums[1] = num_2;
        }else{
            nums[0] = num_2;
            nums[1] = num_1;
        }
        return nums;
    }
    
    public int getDiference (int[] nums){
        return nums[0] - nums[1];
    }
}
