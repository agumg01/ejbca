/*
 * Generated by XDoclet - Do not edit!
 */
package se.anatom.ejbca.ca.publisher;

/**
 * Local home interface for PublisherSession.
 */
public interface IPublisherSessionLocalHome
   extends javax.ejb.EJBLocalHome
{
   public static final String COMP_NAME="java:comp/env/ejb/PublisherSessionLocal";
   public static final String JNDI_NAME="PublisherSessionLocal";

   public se.anatom.ejbca.ca.publisher.IPublisherSessionLocal create()
      throws javax.ejb.CreateException;

}
