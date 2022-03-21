/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo;

/**
 *
 * @author PC
 */
public class Todo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        Sentence obj_sentence = new Sentence();
        Error obj_error = new Error();
        
        int num_1, num_2;
        String sentence = "";
        String conver_sentence = "";
        try {
            num_1 = numbers.getNumber();
            num_2 = numbers.randomNumber();
            int[] nums = numbers.getMinNumber(num_1, num_2);
            numbers.showNumber("You entered the number: ", num_1);
            numbers.showNumber("Number random: ", num_2);
            numbers.showNumber("Number less: ", nums[1]);
            numbers.showNumber("Difference: ", numbers.getDiference(nums));
            sentence = obj_sentence.getSentence();
            conver_sentence = obj_sentence.converSentence(sentence);
        } catch (Exception e) {
            obj_error.ShowError(e);
        }
    }
}
