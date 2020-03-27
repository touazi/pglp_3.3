package pglp_3.pglp_3;
/**
 *classe Robot. 
 * 
 * 
 * */
public class Robot {
	  /**
     * position pos qui est private.
     *
     * @see Robot#Robot(Position, Direction)
     */
private Position pos;
/**
 * Direction dir qui est private.
 *
 * @see Robot#Robot(Position, Direction)
 */
private Direction dir;
/**
 * constructeur Robot.
 * @param pos la position du robot.
 * @param dir la direction du robot.
 * */
Robot(Position pos,Direction dir){
		this.dir = dir;
		this.pos = pos;
		}
/**methode torner.*/
	public void tourne() {}
/**methode avanceer.*/
	public void avance() {}
	}
