package Business;

import Business.Employee.Employee;
import Business.Role.CustomerRole;
import Business.Role.LogisticsAssociateRole;
import Business.Role.PatientAssociateRole;
import Business.Role.StudentUsherRole;
import Business.Role.SwabCollectorRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Swapnil
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        UserAccount su = system.getUserAccountDirectory().createUserAccount("dummysu", "123",employee, new StudentUsherRole());
        UserAccount pa = system.getUserAccountDirectory().createUserAccount("dummypa", "123",employee, new PatientAssociateRole());
        UserAccount sc = system.getUserAccountDirectory().createUserAccount("dummysc", "123",employee, new SwabCollectorRole());
        UserAccount la = system.getUserAccountDirectory().createUserAccount("dummyla", "123",employee, new LogisticsAssociateRole());
        
        return system;
    }
    
}
