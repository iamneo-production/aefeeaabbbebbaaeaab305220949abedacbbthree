
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEES")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeId;
   private String employeeName;
   private String email;
   private long mobile;
   
public int getEmployeeId() {
    return employeeId;
}
public void setEmployeeId(int employeeId) {
    this.employeeId = employeeId;
}
public String getEmployeeName() {
    return employeeName;
}
public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
public long getMobile() {
    return mobile;
}
public void setMobile(long mobile) {
    this.mobile = mobile;
}
public Employee() {
    super();
}
public Employee(int employeeId, String employeeName, String email, long mobile ){
    this.employeeId = employeeId;
    this.employeeName = employeeName;
    this.email = email;
    this.mobile = mobile;  
}
@Override
public String toString() {
    return "Employee [address=" + address + ", department=" + department + ", email=" + email + ", employeeId="
            + employeeId + ", employeeName=" + employeeName + ", mobile=" + mobile + ", roll=" + roll + ", salary="
            + salary + "]";
}
   
    
}
