package datamanagement;

public interface IStudent {

    public Integer getID_();

    public String getFirstName_();
    public void setFirstName(String firstName);

    public String getLastName_();
    public void setLastName(String lastName);

    public void addUnitRecord( IStudentUnitRecord records );
    public IStudentUnitRecord getUnitRecord( String unitCodes );

    public StudentUnitRecordList getUnitRecords();

}
