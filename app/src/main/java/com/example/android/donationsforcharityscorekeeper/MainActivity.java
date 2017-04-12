package com.example.android.donationsforcharityscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String MONEY_SCORE_TEAM_A = "teamamoneyscore";
    private static final String MONEY_SCORE_TEAM_B = "teambmoneyscore";
    private static final String PRODUCTS_SCORE_TEAM_A = "teamaproductsscore";
    private static final String PRODUCTS_SCORE_TEAM_B = "teambproductsscore";

    // tracks total amount of money raised by TeamA
    int moneyScoreTeamA = 0;

    // keeps track of total number of products sold by Team A
    int productsScoreTeamA = 0;

    //keeps track of total amount of money raised by TeamB
    int moneyScoreTeamB = 0;

    //keeps track of total number of products sold by TeamB
    int productsScoreTeamB = 0;

    //keeps track of whether to display or hide score description text when pressing "SCORE STATUS" button.
    // if showScoreStatus is odd, it displays the score; if it is even, it hides the score.
    int showScoreStatus = 0;

    //keeps message to be displayed when Team A wins
    String finalWinMessageTeamA = "Green Team\nwins\nthe game!";
    //keeps message to be displayed when Team B wins
    String finalWinMessageTeamB = "Blue Team\nwins\nthe game!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null) {
            moneyScoreTeamA = savedInstanceState.getInt(MONEY_SCORE_TEAM_A, 0);
            moneyScoreTeamB = savedInstanceState.getInt(MONEY_SCORE_TEAM_B, 0);
            productsScoreTeamA = savedInstanceState.getInt(PRODUCTS_SCORE_TEAM_A, 0);
            productsScoreTeamB = savedInstanceState.getInt(PRODUCTS_SCORE_TEAM_B, 0);
            String moneyMessage = "€" + moneyScoreTeamA;
            displayMoneyForTeamA(moneyMessage);
            String moneyMessageB = "€" + moneyScoreTeamB;
            displayMoneyForTeamB(moneyMessageB);
            displayProductsForTeamA(productsScoreTeamA);
            displayProductsForTeamB(productsScoreTeamB);
        }
    }

    /**
     * adds 1 euro to TeamA and +1 product sold for TeamA
     */
    public void addOneForTeamA(View view) {

        if (moneyScoreTeamA < 100 && productsScoreTeamA < 40 && moneyScoreTeamB < 100 && productsScoreTeamB < 40) {
            moneyScoreTeamA = moneyScoreTeamA + 1;
            productsScoreTeamA = productsScoreTeamA + 1;
            String moneyMessage = "€" + moneyScoreTeamA;
            displayMoneyForTeamA(moneyMessage);
            displayProductsForTeamA(productsScoreTeamA);
        }
        if (moneyScoreTeamA >= 100) {
            displayMoneyMessage(finalWinMessageTeamA);
        }
        if (productsScoreTeamA >= 40) {
            displayProductsMessage(finalWinMessageTeamA);
        }
    }

    /**
     * adds 2 euro to TeamA and +1 product sold for TeamA when pressing second button
     */
    public void addTwoForTeamAProduct2(View view) {

        if (moneyScoreTeamA < 100 && productsScoreTeamA < 40 && moneyScoreTeamB < 100 && productsScoreTeamB < 40) {
            moneyScoreTeamA = moneyScoreTeamA + 2;
            productsScoreTeamA = productsScoreTeamA + 1;
            String moneyMessage = "€" + moneyScoreTeamA;
            displayMoneyForTeamA(moneyMessage);
            displayProductsForTeamA(productsScoreTeamA);
        }
        if (moneyScoreTeamA >= 100) {
            displayMoneyMessage(finalWinMessageTeamA);
        }
        if (productsScoreTeamA >= 40) {
            displayProductsMessage(finalWinMessageTeamA);
        }
    }

    /**
     * adds 2 euro to TeamA and +1 product sold for TeamA when pressing third button
     */
    public void addTwoForTeamAProduct3(View view) {

        if (moneyScoreTeamA < 100 && productsScoreTeamA < 40 && moneyScoreTeamB < 100 && productsScoreTeamB < 40) {
            moneyScoreTeamA = moneyScoreTeamA + 2;
            productsScoreTeamA = productsScoreTeamA + 1;
            String moneyMessage = "€" + moneyScoreTeamA;
            displayMoneyForTeamA(moneyMessage);
            displayProductsForTeamA(productsScoreTeamA);
        }
        if (moneyScoreTeamA >= 100) {
            displayMoneyMessage(finalWinMessageTeamA);
        }
        if (productsScoreTeamA >= 40) {
            displayProductsMessage(finalWinMessageTeamA);
        }
    }

    /**
     * adds 3 euro to TeamA and +1 product sold for TeamA
     */
    public void addThreeForTeamA(View view) {

        if (moneyScoreTeamA < 100 && productsScoreTeamA < 40 && moneyScoreTeamB < 100 && productsScoreTeamB < 40) {
            moneyScoreTeamA = moneyScoreTeamA + 3;
            productsScoreTeamA = productsScoreTeamA + 1;
            String moneyMessage = "€" + moneyScoreTeamA;
            displayMoneyForTeamA(moneyMessage);
            displayProductsForTeamA(productsScoreTeamA);
        }
        if (moneyScoreTeamA >= 100) {
            displayMoneyMessage(finalWinMessageTeamA);
        }
        if (productsScoreTeamA >= 40) {
            displayProductsMessage(finalWinMessageTeamA);
        }
    }

    /**
     * adds 5 euro to TeamA and +1 product sold for TeamA
     */
    public void addFiveForTeamA(View view) {

        if (moneyScoreTeamA < 100 && productsScoreTeamA < 40 && moneyScoreTeamB < 100 && productsScoreTeamB < 40) {
            moneyScoreTeamA = moneyScoreTeamA + 5;
            productsScoreTeamA = productsScoreTeamA + 1;
            String moneyMessage = "€" + moneyScoreTeamA;
            displayMoneyForTeamA(moneyMessage);
            displayProductsForTeamA(productsScoreTeamA);
        }
        if (moneyScoreTeamA >= 100) {
            displayMoneyMessage(finalWinMessageTeamA);
        }
        if (productsScoreTeamA >= 40) {
            displayProductsMessage(finalWinMessageTeamA);
        }
    }

    /**
     * adds 1 euro to TeamB and +1 product sold for TeamB
     */
    public void addOneForTeamB(View view) {

        if (moneyScoreTeamB < 100 && productsScoreTeamB < 40 && moneyScoreTeamA < 100 && productsScoreTeamA < 40) {
            moneyScoreTeamB = moneyScoreTeamB + 1;
            productsScoreTeamB = productsScoreTeamB + 1;
            String moneyMessage = "€" + moneyScoreTeamB;
            displayMoneyForTeamB(moneyMessage);
            displayProductsForTeamB(productsScoreTeamB);
        }
        if (moneyScoreTeamB >= 100) {
            displayMoneyMessage(finalWinMessageTeamB);
        }
        if (productsScoreTeamB >= 40) {
            displayProductsMessage(finalWinMessageTeamB);
        }
    }

    /**
     * adds 2 euro to TeamB and +1 product sold for TeamB when pressing second button
     */
    public void addTwoForTeamBProduct2(View view) {

        if (moneyScoreTeamB < 100 && productsScoreTeamB < 40 && moneyScoreTeamA < 100 && productsScoreTeamA < 40) {
            moneyScoreTeamB = moneyScoreTeamB + 2;
            productsScoreTeamB = productsScoreTeamB + 1;
            String moneyMessage = "€" + moneyScoreTeamB;
            displayMoneyForTeamB(moneyMessage);
            displayProductsForTeamB(productsScoreTeamB);
        }
        if (moneyScoreTeamB >= 100) {
            displayMoneyMessage(finalWinMessageTeamB);
        }
        if (productsScoreTeamB >= 40) {
            displayProductsMessage(finalWinMessageTeamB);
        }
    }

    /**
     * adds 2 euro to TeamB and +1 product sold for TeamB when pressing third button
     */
    public void addTwoForTeamBProduct3(View view) {

        if (moneyScoreTeamB < 100 && productsScoreTeamB < 40 && moneyScoreTeamA < 100 && productsScoreTeamA < 40) {
            moneyScoreTeamB = moneyScoreTeamB + 2;
            productsScoreTeamB = productsScoreTeamB + 1;
            String moneyMessage = "€" + moneyScoreTeamB;
            displayMoneyForTeamB(moneyMessage);
            displayProductsForTeamB(productsScoreTeamB);
        }
        if (moneyScoreTeamB >= 100) {
            displayMoneyMessage(finalWinMessageTeamB);
        }
        if (productsScoreTeamB >= 40) {
            displayProductsMessage(finalWinMessageTeamB);
        }
    }

    /**
     * adds 3 euro to TeamB and +1 product sold for TeamB
     */
    public void addThreeForTeamB(View view) {

        if (moneyScoreTeamB < 100 && productsScoreTeamB < 40 && moneyScoreTeamA < 100 && productsScoreTeamA < 40) {
            moneyScoreTeamB = moneyScoreTeamB + 3;
            productsScoreTeamB = productsScoreTeamB + 1;
            String moneyMessage = "€" + moneyScoreTeamB;
            displayMoneyForTeamB(moneyMessage);
            displayProductsForTeamB(productsScoreTeamB);
        }
        if (moneyScoreTeamB >= 100) {
            displayMoneyMessage(finalWinMessageTeamB);
        }
        if (productsScoreTeamB >= 40) {
            displayProductsMessage(finalWinMessageTeamB);
        }
    }

    /**
     * adds 5 euro to TeamB and +1 product sold for TeamB
     */
    public void addFiveForTeamB(View view) {

        if (moneyScoreTeamB < 100 && productsScoreTeamB < 40 && moneyScoreTeamA < 100 && productsScoreTeamA < 40) {
            moneyScoreTeamB = moneyScoreTeamB + 5;
            productsScoreTeamB = productsScoreTeamB + 1;
            String moneyMessage = "€" + moneyScoreTeamB;
            displayMoneyForTeamB(moneyMessage);
            displayProductsForTeamB(productsScoreTeamB);
        }
        if (moneyScoreTeamB >= 100) {
            displayMoneyMessage(finalWinMessageTeamB);
        }
        if (productsScoreTeamB >= 40) {
            displayProductsMessage(finalWinMessageTeamB);
        }
    }

    /**
     * Compares moneyScore and productsScore variables
     * when pressing the "SCORE STATUS" button, 2 texts are displayed naming the team that raised more money
     * and the team that sold more products.
     * When pressing the "SCORE STATUS" button again, the texts are hidded (deleted)
     * this situation (show/hide text) is repetitive
     */
    public void showStatus(View view) {
        showScoreStatus = showScoreStatus + 1;

        if ((showScoreStatus % 2) == 0) {
            String winMessageTeamA = "";
            String winMessageTeamB = "";
            String tieMessage = "";
            String winProductsMessageTeamA = "";
            String winProductsMessageTeamB = "";
            String tieMessageProducts = "";

            displayMoneyMessage(winMessageTeamA);
            displayMoneyMessage(winMessageTeamB);
            displayMoneyMessage(tieMessage);
            displayProductsMessage(winProductsMessageTeamA);
            displayProductsMessage(winProductsMessageTeamB);
            displayProductsMessage(tieMessageProducts);
        } else {

            String winMessageTeamA = "Green Team\nraised more\nmoney!";
            String winMessageTeamB = "Blue Team\nraised\nmore money!";
            String tieMessage = "It's a tie\non money\nraised!";
            String winProductsMessageTeamA = "Green Team\nsold more\nproducts!";
            String winProductsMessageTeamB = "Blue Team\nsold more\nproducts!";
            String tieMessageProducts = "It's a tie\non products\nsold!";

            if (moneyScoreTeamA > moneyScoreTeamB) {
                displayMoneyMessage(winMessageTeamA);
            } else if (moneyScoreTeamB > moneyScoreTeamA) {
                displayMoneyMessage(winMessageTeamB);
            } else {
                displayMoneyMessage(tieMessage);
            }

            if (productsScoreTeamA > productsScoreTeamB) {
                displayProductsMessage(winProductsMessageTeamA);
            } else if (productsScoreTeamB > productsScoreTeamA) {
                displayProductsMessage(winProductsMessageTeamB);
            } else {
                displayProductsMessage(tieMessageProducts);
            }
        }
    }

    /**
     * resets all scores to 0
     * resets all display messages to ""
     */
    public void resetScore(View view) {
        moneyScoreTeamA = 0;
        productsScoreTeamA = 0;
        moneyScoreTeamB = 0;
        productsScoreTeamB = 0;
        showScoreStatus = 0;
        String moneyMessage = "€" + moneyScoreTeamA;
        displayMoneyForTeamA(moneyMessage);
        displayProductsForTeamA(productsScoreTeamA);
        String moneyMessageB = "€" + moneyScoreTeamB;
        displayMoneyForTeamB(moneyMessageB);
        displayProductsForTeamB(productsScoreTeamB);

        String winMessageTeamA = "";
        String winMessageTeamB = "";
        String tieMessage = "";
        String winProductsMessageTeamA = "";
        String winProductsMessageTeamB = "";
        String tieMessageProducts = "";

        displayMoneyMessage(winMessageTeamA);
        displayMoneyMessage(winMessageTeamB);
        displayMoneyMessage(tieMessage);
        displayProductsMessage(winProductsMessageTeamA);
        displayProductsMessage(winProductsMessageTeamB);
        displayProductsMessage(tieMessageProducts);
    }

    /**
     * Displays the given money score (total money raised) for Team A as a string
     */
    private void displayMoneyForTeamA(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.team_a_money_score);
        priceTextView.setText(message);
    }

    /**
     * Displays the given number of products sold by Team A.
     */
    public void displayProductsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_products_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given money score (total money raised) for Team B as a string
     */
    private void displayMoneyForTeamB(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.team_b_money_score);
        priceTextView.setText(message);
    }

    /**
     * Displays the given number of products sold by Team B.
     */
    public void displayProductsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_products_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the team with most money raised on the screen.
     */
    private void displayMoneyMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.win_message_money);
        priceTextView.setText(message);
    }

    /**
     * Displays the team with most products sold on the screen.
     */
    private void displayProductsMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.win_message_products);
        priceTextView.setText(message);
    }

    // Override the onSaveInstanceState method, this will write the variables values to the Bundle
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt(MONEY_SCORE_TEAM_A, moneyScoreTeamA);
        savedInstanceState.putInt(MONEY_SCORE_TEAM_B, moneyScoreTeamB);
        savedInstanceState.putInt(PRODUCTS_SCORE_TEAM_A, productsScoreTeamA);
        savedInstanceState.putInt(PRODUCTS_SCORE_TEAM_B, productsScoreTeamB);
    }

}
