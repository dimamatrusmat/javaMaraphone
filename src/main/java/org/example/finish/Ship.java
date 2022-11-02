package org.example.finish;

import java.util.ArrayList;

public class Ship {

    private int size;
    private String allCoord;

    private boolean creating;

    private Board board;
    private ArrayList<int[]> coor = new ArrayList<>();
    private ArrayList<int[]> coorObl = new ArrayList<>();

    public Ship (String init, Board board, int size) throws Throwable {

        creating = true;

        this.size = size;

        switch (size) {
            case 4: System.out.println("Введи координаты четырёхпалубного корабля (формат: х,у;х,у;х,у;х,у)"); break;
            case 3: System.out.println("Введи координаты трехпалубного корабля (формат: х,у;х,у;х,у)"); break;
            case 2: System.out.println("Введи координаты второго двухпалубного корабля (формат: х,у;х,у)"); break;
            case 1: System.out.println("Введи координаты однопалубного корабля (формат: х,у)"); break;
            default: System.out.println("Введите верный размер"); break;
        }

        String [] coordies = init.split(";");

        if (!this.cheackCoords()) {
            creating = false;
            System.out.println("Не верные координаты коробля");
        }

        for (String coord: coordies) {
            int y = Integer.parseInt(coord.split(",")[0]);
            int x = Integer.parseInt(coord.split(",")[1]);
            coor.add(new int[]{x, y});
        }

        if (!creating) {
            this.finalize();
        } else {
            //Если все ок добавляем кораблик
            createOblCoor();
            board.toShip(this);
            board.addShip(this);
        }

    }

    public int getSize() {
        return size;
    }

    public String getAllCoord() {
        return allCoord;
    }

    public ArrayList<int[]> getCoor() {
        return coor;
    }

    public void createOblCoor() {
        for (int [] coord: coor) {
            coorObl.add(new int[] {coord[0]-1, coord[1]});
            coorObl.add(new int[] {coord[0], coord[1]-1});
            coorObl.add(new int[] {coord[0]+1, coord[1]});
            coorObl.add(new int[] {coord[0], coord[1]+1});
            coorObl.add(new int[] {coord[0]+1, coord[1]-1});
            coorObl.add(new int[] {coord[0]-1, coord[1]+1});
            coorObl.add(new int[] {coord[0]-1, coord[1]-1});
            coorObl.add(new int[] {coord[0]+1, coord[1]+1});
        }

        int counter = 0;
        for (int [] coords: coorObl) {
            for (int [] coord1: coor) {
                if (coords == coord1) {
                    coorObl.remove(counter);
                }
            }
            counter++;
        }
    }

    public boolean cheackCoords() {
        for (int [] coords: this.getCoor()) {
            if (!board.cheackOblEmpty(coords)) {
                return false;
            }

        }
        return true;
    }

    public boolean isCreating() {
        return creating;
    }

    public ArrayList<int[]> getCoordsObl() {
        return coorObl;
    }
}
