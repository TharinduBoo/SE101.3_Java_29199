
package com.mycompany.gamemain;
class LifePlayer extends PlayerController {
    @Override
    void moveUp() {
        System.out.println("Player moves UP.");
    }

    @Override
    void moveDown() {
        System.out.println("Player moves DOWN.");
    }

    @Override
    void moveLeft() {
        System.out.println("Player moves LEFT.");
    }

    @Override
    void moveRight() {
        System.out.println("Player moves RIGHT.");
    }
}
