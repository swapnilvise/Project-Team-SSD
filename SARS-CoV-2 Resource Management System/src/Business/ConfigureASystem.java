package Business;

import Business.Employee.Employee;
import Business.Role.CustomerRole;
import Business.Role.DoctorRole;
import Business.Role.LabAssistantRole;
import Business.Role.LogisticsAssociateRole;
import Business.Role.PatientAssociateRole;
import Business.Role.PatientRole;
import Business.Role.StudentUsherRole;
import Business.Role.SwabCollectorRole;
import Business.Role.SystemAdminRole;
import Business.StudentUsher.StudentUsherDetails;
//import Business.StudentUsher.StudentUsherDirectory;
import Business.UserAccount.UserAccount;
import Business.StudentUsher.StudentUsherDirectory;

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
        StudentUsherDetails sdu = system.getSud().newStudentUsher();
        sdu.setStudentUsherAccount(su);
        sdu.setLastName("Vise");
        sdu.setFirstName("Swapnil");
        
        UserAccount pa = system.getUserAccountDirectory().createUserAccount("dummypa", "123",employee, new PatientAssociateRole());
        UserAccount sc = system.getUserAccountDirectory().createUserAccount("dummysc", "123",employee, new SwabCollectorRole());
        UserAccount la = system.getUserAccountDirectory().createUserAccount("dummyla", "123",employee, new LogisticsAssociateRole());
        UserAccount dc = system.getUserAccountDirectory().createUserAccount("dummydc", "123",employee, new DoctorRole());
        UserAccount labass = system.getUserAccountDirectory().createUserAccount("dummylabas", "123",employee, new LabAssistantRole());
        UserAccount student = system.getUserAccountDirectory().createUserAccount("dummystu", "123",employee, new PatientRole());
//        UserAccount la = system.getUserAccountDirectory().createUserAccount("dummyla", "123",employee, new LogisticsAssociateRole());
//        UserAccount la = system.getUserAccountDirectory().createUserAccount("dummyla", "123",employee, new LogisticsAssociateRole());
        
        return system;
    }
    
}
