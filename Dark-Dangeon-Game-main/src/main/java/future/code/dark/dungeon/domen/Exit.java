package future.code.dark.dungeon.domen;

import java.util.stream.DoubleStream;

import static future.code.dark.dungeon.config.Configuration.EXIT_SPRITE;

public class Exit extends GameObject{

    public Exit(int xPosition, int yPosition) {
        super(xPosition, yPosition, EXIT_SPRITE);
    }


}
