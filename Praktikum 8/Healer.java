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
public class Healer extends Character{
    Healer(){
        setHP(70);
        setAttack(10);
        setDefense(10);
    }

    void heal(){
        setHP(getHP() + 25);
    }

    @Override
    public boolean attack() {
        double counter = Math.random() * 10;
        if (counter > 0 && counter <= 8.5)
            return true;
        else
            return false;
    }
}