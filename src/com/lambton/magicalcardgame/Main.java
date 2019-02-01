package com.lambton.magicalcardgame;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

                MagicalCardGameModel gameModel= new MagicalCardGameModel();
                MagicalCardGameCalculator gameCalculator= new MagicalCardGameCalculator();
                String[][] cardList={{ "5", "2", "3" }, { "4", "Z", "6" }, { "7", "L", "1" }};
                gameModel.setCardList(cardList);
                displayMatrix( gameModel.getCardList());
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter the column Number ");
                gameModel.setFirstShuffleColPos(sc.next());

                gameCalculator.getFirstShuffleResult(gameModel);

                column1(gameModel.getCardList());

            }

            private static void column1(String[][] cardList) {
                String transpose[][] = new String[3][3];
                for (int i = 0; i < cardList.length; i++) {
                    for (int j = 0; j < cardList[i].length; j++) {
                        transpose[i][j] = cardList[j][i];
                    }
                }
                displayMatrix(transpose);
                interchangeColumns(transpose);
            }

            private static void interchangeColumns(String[][] transpose) {
                int x=1;
                int y=2;
                String temp;
                String[][] tranposedMatrix= transpose;
                for(int i = 0; i < 3; i++)
                {
                    temp = tranposedMatrix[(x-1)][i];
                    tranposedMatrix[x-1][i] = tranposedMatrix[y-1][i];
                    tranposedMatrix[y-1][i] = temp;
                }
                displayMatrix(tranposedMatrix);
            }

            private static void displayMatrix(String[][] matrix) {
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                }
            }

    Scanner sc= new Scanner(System.in);
                System.out.println("Enter the column Number ");


        }

