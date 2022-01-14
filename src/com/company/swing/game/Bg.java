package com.company.swing.game;

import java.awt.*;

public class Bg {
    Image bj;
    Image sky;
    Image person;

    public Bg(){
          bj = Toolkit.getDefaultToolkit().getImage("src/com/company/swing/game/images/捕获收到.PNG");
          sky = Toolkit.getDefaultToolkit().getImage("src/com/company/swing/game/images/sky.PNG");
          person = Toolkit.getDefaultToolkit().getImage("src/com/company/swing/game/images/person.PNG");
    }



    public void paintSelf(Graphics graphics){
        graphics.drawImage(bj, 0, 130, null);
        graphics.drawImage(sky, 0, 0, null);
        graphics.drawImage(person, 130, 25, null);

    }
}
