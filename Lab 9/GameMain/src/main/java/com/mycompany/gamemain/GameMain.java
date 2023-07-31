
package com.mycompany.gamemain;
public class GameMain {
    public static void main(String[] args) {
        PlayerController player = new LifePlayer();
        player.moveUp();
        player.moveLeft();
        player.moveDown();
        player.moveRight();
    }
}
