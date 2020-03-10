package pglp_3.pglp_3;

import java.util.List;

public class Terrain {


	private int longeur;
	private int largeur;
	
	Terrain( int longeur, int largeur) {
		this.longeur=longeur;
		this.largeur=largeur;
		
	}
	//private List<Robot> robotList;
	private List<Robot_Statique> liste_robot_statique;
	
	public void avancerTous() {
		for (Robot_Statique robotS : liste_robot_statique) {
			robotS.avance();
		}
		}
}
