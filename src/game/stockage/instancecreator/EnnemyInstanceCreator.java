/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.stockage.instancecreator;

import com.google.gson.InstanceCreator;
import underthebeam.application.characters.Hero;
import underthebeam.application.characters.enemies.Ennemy;
import underthebeam.application.characters.enemies.Orc;
import java.lang.reflect.Type;

class EnnemyInstanceCreator implements InstanceCreator<Ennemy>
{

    @Override
    public Ennemy createInstance(Type type) {
        return new Ennemy(null, 0, null, null, null, null) {
            @Override
            public String action(Hero h) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
    }

}