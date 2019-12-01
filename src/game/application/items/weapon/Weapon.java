/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.application.items.weapon;

import game.application.Lookable;
import game.application.Takeable;
import game.application.Usable;
import game.application.items.Item;

/**
 *
 * @author cbastin
 */
public abstract class Weapon extends Item implements Lookable, Takeable {

	private int damage;
	
    public Weapon(String name, String description) {
        super(name, description);
    }
    
    public int getDamage() {
    	return this.damage;
    }

}
