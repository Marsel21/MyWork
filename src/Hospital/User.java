/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital;

/**
 *
 * @author userr
 */
public class User {


    //8):encapsulation used here
   
    private   String name;
    private   String DOB;
   private    String Gender; 
   private  String contactNo;
    private String fileNo;
    private String procType;
      private String procDate;
      private String echo;
      private String graft;
      private String extra;
     public User(){
    
}

    public User(String name, String DOB, String Gender, String contactNo, String fileNo, String procType, String procDate, String echo, String graft, String extra) {
        this.name = name;
        this.DOB = DOB;
        this.Gender = Gender;
        this.contactNo = contactNo;
        this.fileNo = fileNo;
        this.procType = procType;
        this.procDate = procDate;
        this.echo = echo;
        this.graft = graft;
        this.extra = extra;
    }

    public String getEcho() {
        return echo;
    }

    public void setEcho(String echo) {
        this.echo = echo;
    }

    public String getGraft() {
        return graft;
    }

    public void setGraft(String graft) {
        this.graft = graft;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

   

    /**
     * @return the procDate
     */
    public String getProcDate() {
        return procDate;
    }

    /**
     * @param procDate the procDate to set
     */
    public void setProcDate(String procDate) {
        this.procDate = procDate;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the DOB
     */
    public String getDOB() {
        return DOB;
    }

    /**
     * @param DOB the DOB to set
     */
    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    /**
     * @return the Gender
     */
    public String getGender() {
        return Gender;
    }

    /**
     * @param Gender the Gender to set
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * @return the contactNo
     */
    public String getContactNo() {
        return contactNo;
    }

    /**
     * @param contactNo the contactNo to set
     */
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    /**
     * @return the fileNo
     */
    public String getFileNo() {
        return fileNo;
    }

    /**
     * @param fileNo the fileNo to set
     */
    public void setFileNo(String fileNo) {
        this.fileNo = fileNo;
    }

    /**
     * @return the procType
     */
    public String getProcType() {
        return procType;
    }

    /**
     * @param procType the procType to set
     */
    public void setProcType(String procType) {
        this.procType = procType;
    }
}

  
    
