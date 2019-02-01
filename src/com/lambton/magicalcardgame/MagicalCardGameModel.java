package com.lambton.magicalcardgame;

public class MagicalCardGameModel {
    String firstShuffleColPos;
    String secShuffleColPos;
    //String [][]cardList=null;
    String [][]firstShuffle=null;
    String [][]secShuffle=null;
    String guessedCard;


    String [][]cardList = { {"1","A","5"},
            {"2","7","3"},
            {"3","6","K"} };

    public String getFirstShuffleColPos() {
        return firstShuffleColPos;
    }

    public void setFirstShuffleColPos(String firstShuffleColPos) {
        this.firstShuffleColPos = firstShuffleColPos;
    }

    public String getSecShuffleColPos() {
        return secShuffleColPos;
    }

    public void setSecShuffleColPos(String secShuffleColPos) {
        this.secShuffleColPos = secShuffleColPos;
    }

    public String[][] getCardList() {
        return cardList;
    }

    public void setCardList(String[][] cardList) {
        this.cardList = cardList;
    }

    public String[][] getFirstShuffle() {
        return firstShuffle;
    }

    public void setFirstShuffle(String[][] firstShuffle) {
        this.firstShuffle = firstShuffle;
    }

    public String[][] getSecShuffle() {
        return secShuffle;
    }

    public void setSecShuffle(String[][] secShuffle) {
        this.secShuffle = secShuffle;
    }

    public String getGuessedCard() {
        return guessedCard;
    }

    public void setGuessedCard(String guessedCard) {
        this.guessedCard = guessedCard;
    }

    public String[][] getFirstShuffleResult(MagicalCardGameModel magicalCardGameModel)
    {
        String firstShuffleColPos= "C3";
        
        return new String[i][j];


    }
    public String[][] getSecShuffleResult(MagicalCardGameModel magicalCardGameModel)
    {
        String secShuffleColPos= "C3";
    }
    public String getFinalResult(MagicalCardGameModel magicalCardGameModel)
    {

    }

}
