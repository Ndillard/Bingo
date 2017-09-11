package com.arkansascodingacademy;

public class Card
{
    private Square square[][];

    public Card()
    {
        square = new Square[5][5];

        square[0][0] = new Square(15);
        square[0][1] = new Square(28);
        square[0][2] = new Square(38);
        square[0][3] = new Square(56);
        square[0][4] = new Square(74);

        square[1][0] = new Square(1);
        square[1][1] = new Square(19);
        square[1][2] = new Square(35);
        square[1][3] = new Square(53);
        square[1][4] = new Square(66);

        square[2][0] = new Square(12);
        square[2][1] = new Square(17);
        square[2][2] = new Square(0);
        square[2][2].cover();
        square[2][3] = new Square(59);
        square[2][4] = new Square(62);

        square[3][0] = new Square(13);
        square[3][1] = new Square(20);
        square[3][2] = new Square(37);
        square[3][3] = new Square(58);
        square[3][4] = new Square(65);

        square[4][0] = new Square(6);
        square[4][1] = new Square(23);
        square[4][2] = new Square(34);
        square[4][3] = new Square(60);
        square[4][4] = new Square(70);
    }


    public void print()
    {
        //Go through rows 0 to 4
        for (int row = 0; row < 5; row++)
        {
            //For the current row go through columns 0 to 4
            for (int column = 0; column < 5; column++)
            {
                //print out the square
                square[row][column].print();
                System.out.print(" ");
            }

            System.out.println();
        }
    }
    public void play(int number)
    {

        //Go through rows 0 to 4
        for (int row = 0; row < 5; row++)
        {
            //For the current row go through columns 0 to 4
            for (int column = 0; column < 5; column++)
            {
                //check for the number
                if (square[row][column].getNumber() == number)
                {

                    // if we found the number cover it
                    square[row][column].cover();
                }

            }
        }
    }

    public boolean bingo()
    {
        boolean bingo = false;

        //check for now
        for (int row = 0; row < 5; row++)
        {

            //check to see if the square is covered
            if (square[row][0].isCovered() &&
                    square[row][1].isCovered() &&
                    square[row][2].isCovered() &&
                    square[row][3].isCovered() &&
                    square[row][4].isCovered())


            {
                bingo = true;
            }
        }
            for (int column = 0; column < 5; column++)

                if (square[0][column].isCovered() &&
                        square[1][column].isCovered() &&
                        square[2][column].isCovered() &&
                        square[3][column].isCovered() &&
                        square[4][column].isCovered())

        {
            bingo = true;
        }

        return bingo;
    }


    public static void main(String[] args)
    {
        Card card = new Card();
        card.print();
    }
}
