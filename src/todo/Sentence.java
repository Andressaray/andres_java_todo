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
public class Sentence {
    public String getSentence() {
        String sentence = "";
        sentence = JOptionPane.showInputDialog("Enter a sentence that containt the word like it");
        return sentence;
    }
    
    public String converSentence(String sentence) {
        String newSentence = "";
        sentence = sentence.toLowerCase();
        newSentence = sentence.replaceAll("like it", "don't like it").toUpperCase();
        showChange(sentence, newSentence);
        return newSentence;
    }
    public void showChange(String sentence, String newSentence) {
        JOptionPane.showMessageDialog(null, "Sentence enter: " + sentence + "Sentence change: " + newSentence);
        JOptionPane.showMessageDialog(null, "What we do ?\n We change the word like it for don't like it");
    }
}
