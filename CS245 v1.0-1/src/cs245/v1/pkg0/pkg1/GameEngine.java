/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs245.v1.pkg0.pkg1;

/**
 * Game Engine. Selects a word and its only function is to save the high score
 * and store it into a text file as well as choose a random word and be able to
 * tell if a character is in that word or not.
 *
 */
public class GameEngine {
    private int finalScore;
    private int wordLength = 6;
    private MainFrame main;
    private String word;
    private String[] wordList = {"abstract", "cemetery", "nurse", "pharmacy", "climbing"};

    public GameEngine() {
       

    }
    
    public void initEngine() {
        
    }
    
    public void setMain(MainFrame main) {
        this.main = main;
    }
    
    /*
    picks a new word for the game.
    also updates the length of the word
    */
    public void pickWord() {
        
    }
    
    /*
    sets the final score for the 
    end of the game.
    */
    public void setScore(int score) {
        finalScore = score;
    }

    /*
    Returns the letter position in the
    secret word string.
    */
    public int getLetterPosition() {
        
        return 2;
    }
    
    /*
    returns the length of the secret word.
    */
    public int getWordLength() {
        wordLength = 6;
        return wordLength;
    }
    
    /*
    Checks if the letter pressed is contained
    inside the secret word string.
    */
    public boolean containsLetter(String letter) {

        return false;
    }

}
