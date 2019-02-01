
package com.lambton.magicalcardgame;
public class MagicalCardGameCalculator implements Interface
{
  @Override
  public String[][] getFirstShuffleResult(MagicalCardGameModel magicalCardGameModel) {
    /*String[][] Matrix = tranpose(magicalCardGameModel.getCardList());
    if (magicalCardGameModel.getFirstShuffleColPos().equalsIgnoreCase("1")) {

    } else if (magicalCardGameModel.getFirstShuffleColPos().equalsIgnoreCase("3")) {
      Matrix = interchangeRows(finalMatrix, 1, 3);
      Matrix = interchangeRows(finalMatrix, 2, 3);*/
    return new String[0][];
  }

  @Override
  public String[][] getSecShuffleResult(MagicalCardGameModel magicalCardGameModel) {
    return new String[0][];
  }

  @Override
  public String getFinalResult(MagicalCardGameModel magicalCardGameModel) {
    return null;
  }
}
