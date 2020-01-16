package com.javarush.games.snake;
import com.javarush.engine.cell.*;
import java.util.ArrayList;
import java.util.List;

public class Snake {
    private static final String HEAD_SIGN = "\uD83D\uDC7E";
    private static final String BODY_SIGN = "\u26AB";
    public boolean isAlive = true;
    private List<GameObject> snakeParts = new ArrayList<>();

    private Direction direction = Direction.LEFT;

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Snake(int x, int y) {
        GameObject gameObject1 = new GameObject(x, y);
        GameObject gameObject2 = new GameObject(x+1, y);
        GameObject gameObject3 = new GameObject(x+2, y);
        snakeParts.add(gameObject1);
        snakeParts.add(gameObject2);
        snakeParts.add(gameObject3);
    }

    public void draw(Game game) {
        for (int i = 0; i < snakeParts.size(); i++) {
            if (i == 0) {
                if (!isAlive) {
                    game.setCellValueEx(snakeParts.get(i).x, snakeParts.get(i).y, Color.NONE, HEAD_SIGN, Color.RED, 75);
                }
                else {
                    game.setCellValueEx(snakeParts.get(i).x, snakeParts.get(i).y, Color.NONE, HEAD_SIGN, Color.BLACK, 75);
                }
            }
            else {
                if (!isAlive) {
                    game.setCellValueEx(snakeParts.get(i).x, snakeParts.get(i).y, Color.NONE, BODY_SIGN, Color.RED, 75);
                }
                else {
                    game.setCellValueEx(snakeParts.get(i).x, snakeParts.get(i).y, Color.NONE, BODY_SIGN, Color.BLACK, 75);
                }
            }
        }
    }

    public void move(){
        snakeParts.set(0, createNewHead());
        removeTail();

    }

    public GameObject createNewHead() {
        if (direction == Direction.LEFT) {
            return new GameObject(snakeParts.get(0).x-1,snakeParts.get(0).y);
        }
        else if (direction == Direction.RIGHT) {
            return new GameObject(snakeParts.get(0).x+1,snakeParts.get(0).y);
        }
        else if (direction == Direction.DOWN) {
            return new GameObject(snakeParts.get(0).x,snakeParts.get(0).y+1);
        }
        else if (direction == Direction.UP) {
            return new GameObject(snakeParts.get(0).x,snakeParts.get(0).y-1);
        }
        else return null;
    }

    public void removeTail() {
        snakeParts.remove(snakeParts.size()-1);
    }

}
