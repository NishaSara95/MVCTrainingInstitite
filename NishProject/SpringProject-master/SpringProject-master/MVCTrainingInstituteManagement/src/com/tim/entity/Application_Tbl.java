/*
 * package com.tim.entity;
 * 
 * 
 * 
 * import java.io.Serializable;
 * 
 * import javax.persistence.Column; import javax.persistence.Entity; import
 * javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
 * import javax.persistence.Id; import javax.persistence.SequenceGenerator;
 * import javax.persistence.Table;
 * 
 * // @Id -Used To indicate primary key // @GeneratedValue-To indicate auto
 * increment // @Column-To indicate column name
 * 
 * 
 * @Entity
 * 
 * @Table(name="Application_Tbl") public class Application_Tbl implements
 * Serializable { public static final Long serialVersionUID=854452L;
 * 
 * @Id // Used To indicate primary key
 * 
 * @GeneratedValue (strategy =GenerationType.SEQUENCE,generator =
 * "application_gen")
 * 
 * @SequenceGenerator(name="application_gen", sequenceName="application_seq",
 * allocationSize = 1)
 * 
 * @Column(name ="application_id") private int applicationid;
 * 
 * private String description;
 * 
 * @Column(name="application_name") private String applicationname;
 * 
 * public int getApplicationid() { return applicationid; }
 * 
 * public void setApplicationid(int applicationid) { this.applicationid =
 * applicationid; }
 * 
 * public String getDescription() { return description; }
 * 
 * public void setDescription(String description) { this.description =
 * description; }
 * 
 * public String getApplicationname() { return applicationname; }
 * 
 * public void setApplicationname(String applicationname) { this.applicationname
 * = applicationname; }
 * 
 * public String getOwner() { return owner; }
 * 
 * public void setOwner(String owner) { this.owner = owner; }
 * 
 * public static Long getSerialversionuid() { return serialVersionUID; }
 * 
 * private String owner;
 * 
 * 
 * 
 * }
 */