
package cd.syna.geotools.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Mishka
 */
public class Connexion {
    
    /**
     * Déclaration des variables pour stocker les informations de connexions à la base des données
     * le port 8889 peut être changé selon votre configuration
     * 3306 : MySQL
     * 8889 : MAMP
     * Le mot de passe aussi dépend de la configuration de votre serveur
    */
    private final String PROPERTY_URL="jdbc:mysql://localhost:8889/smartgeotoolsdb";
    private final String PROPERTY_USER="root";
    private final String PROPERTY_DRIVER="com.mysql.jdbc.Driver";
    private final String PROPERTY_PWD="root";
    //Déclaration d'une variable de type Connection pour la chaine de connexion
    private static Connection connect;
    
    //Instanciation de l'instance de la classe pour se connecter directelent dès qu'elle est appelé
    public Connexion(){
        try{
            Class.forName(PROPERTY_DRIVER);
            connect=DriverManager.getConnection(PROPERTY_URL, PROPERTY_USER, PROPERTY_PWD);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    //Création d'une méthode de type Connection qui va instancier une connexion à la base mysql
    public static Connection getInstance(){
        if(connect==null){
            new Connexion();
            System.out.println("DEBUT DE L'INSTANCIATION DE LA CONNEXION SQL !!!!");
        }else{
            System.out.println("CONNEXION A MySQL EXISTE DEJA !!!");
        }
        return connect;
    }
    
    
}
