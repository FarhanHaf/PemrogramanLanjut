/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum8;

/**
 *
 * @author kakaahan
 */
public class Titan extends Character {
    Titan(){
        setHP(200);
        setAttack(45);
        setDefense(0);
    }

    @Override
    public boolean attack() {
        double counter = Math.random() * 10;
        if (counter > 0 && counter <= 4.0)
            return true;
        else
            return false;
    }
}