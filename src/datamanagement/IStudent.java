package datamanagement;

public interface IStudent {

    public Integer getID();

    public String getFirstName();
    public void setFirstName(String firstName);

    public String getLastName();
    public void setLastName(String lastName);

    public void addUnitRecord( IStudentUnitRecord records );
    public IStudentUnitRecord getUnitRecord( String unitCodes );

    public StudentUnitRecordList getUnitRecords();

}
