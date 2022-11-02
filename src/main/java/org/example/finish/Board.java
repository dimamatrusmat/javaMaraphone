package org.example.finish;

import java.util.ArrayList;

import static org.example.finish.Symbool.*;

public class Board {

    private Symbool [][] boardBo;
    private Player player;

    private ArrayList<Ship> ships = new ArrayList<>();

    public Board (Player player, Symbool [][] boardBo) {
       this.boardBo = boardBo;
       this.player = player;
    }

    public Board (Player player) {
        this.player = player;
        boardBo = Board.init();
    }

    public static Symbool [][] init() {
        Symbool [][] boardBo = new Symbool[10][10];

        for (int i = 0; i < boardBo.length; i++) {
            for (int a = 0; a < boardBo[i].length; a++) {
                boardBo[i][a] = EMPTY;
            }
        }

        return boardBo;
    }

    public String attach(int [] arr) {
        Symbool sb = getSymbool(arr);
        sb.toVisible();

        if (sb == SHIP) {
            sb = KICK;
            player.addScore();
        } else if (sb == KICK) {
            return KICK.getText();
        }

        return sb.getText();
    }

    public Player getPlayer() {
        return player;
    }

    public void setSymbool(int [] arr, Symbool sb) {
        sb.foVisisble();
        boardBo[arr[0]][arr[1]] = sb;
    }

    public Symbool cheack(int [] arr) {
        Symbool sb = getSymbool(arr);

        return sb;
    }

    public Symbool getSymbool(int [] arr) {
        Symbool sb = boardBo[arr[0]][arr[1]];

        return sb;
    }

    public int[] cheackStr (String str) {
        String [] arg = str.split(",");

        if (arg.length == 2) {
            int a = Integer.parseInt(arg[0]);
            int b = Integer.parseInt(arg[1]);
            return new int[]{a, b};
        } else {
            return new int[]{99, 99};
        }

    }


    public Symbool[][] getBoardBo() {
        return boardBo;
    }

    public void print() {
        int counter = 0;
        StringBuilder sb = new StringBuilder("Ходит " + player.getName() + "\n");


        for (int i = 0; i < boardBo.length; i++) {
            sb.append(counter++);
            for (int a = 0; a < boardBo[i].length; a++) {
                Symbool emq = boardBo[i][a];

                sb.append(" " + emq.getEmj());
            }

            sb.append("\n");
        }

        counter = 0;
        sb.append("  ");
        while (counter < 10) {
            String a = counter++ + " ";
            sb.append(a);
        }

        System.out.println(sb);
    }


    public boolean cheackOblEmpty(int [] coords) {
        Symbool symbool = this.getSymbool(coords);

        if (symbool == Symbool.EMPTY) {
            return true;
        }

        return false;
    }

    public ArrayList<Ship> getShips() {
        return ships;
    }

    public void addShip(Ship ship) {
        ships.add(ship);
    }

    public void toShip(Ship ship) {

        for (int [] newShip: ship.getCoor()){
            setSymbool(newShip, SHIP);
        }

        for (int [] newObl: ship.getCoordsObl()){
            setSymbool(newObl, OBD);
        }
    }

    public void reverce(Player player) {
        this.player = player;
    }
}
