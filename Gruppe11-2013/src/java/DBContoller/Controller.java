/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DBContoller;

import Hibernate.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author deb
 */
public class Controller {
    Session session = null;

    public Controller() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }
}
