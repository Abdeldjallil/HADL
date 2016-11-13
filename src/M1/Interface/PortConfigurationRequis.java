package M1.Interface;

import M1.Serveur.Serveur;
import M1.Serveur.ServeurDetail;
import M2.ObjectArchi.ObjetArchitectural;

/**
 * Created by erhode on 11/10/16.
 */
public class PortConfigurationRequis extends M2.Interface.PortConfigurationRequis {

    public PortConfigurationRequis(ObjetArchitectural parent, String name){
        super(parent, name);
    }

    @Override public void setInformation(Object information) {
        this.information = information.toString();
        if (parent instanceof ServeurDetail) {
            System.out.printf("Le message et sur le port du serveur Detail\n");
            ((ServeurDetail)parent).notifierBinding(this);
        }
        //else la deuxieme config systeme cs

    }
}