package pglp_3.pglp_3;

import java.util.List;
/**
 *classe Terrain. 
 * 
 * 
 * */
public class Terrain {
	/**
	 * int longeur qui est private.
	 *
	 * @see Terrain#Terrain(int, int)
	 */
private int longeur;
/**
 * int largeur qui est private.
 *
 * @see Terrain#Terrain(int, int)
 */
private int largeur;
/**
 * constructeur Terrain.
 * @param longeur
 * la longeur du terrain.
 * @param largeur
 * la largeur du terrain.
 * */
Terrain( int longeur, int largeur) {
this.longeur = longeur;
this.largeur = largeur;
}
/**
 * La liste Robot_Statique.
 * @see Terrain#avancerTous()
 */
private List<Robot_Statique> liste_robot_statique;
/**
 * methode avancer tous les robots.*/
public void avancerTous() {
	for (Robot_Statique robotS : liste_robot_statique) {
		robotS.avance();
}
}
}
