package Business;

import Business.Customer.Address;
import Business.DeliveryMan.DeliveryMan;
import Business.Employee.Employee;
import Business.Restaurant.Item;
import Business.Restaurant.Restaurant;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.Role.DoctorRole;
import Business.Role.LabAssistantRole;
import Business.Role.LogisticsAssociateRole;
import Business.Role.PatientAssociateRole;
import Business.Role.StudentRole;

import Business.Role.StudentUsherRole;
import Business.Role.SwabCollectorRole;
import Business.Role.SystemAdminRole;

import Business.StudentUsher.StudentUsherDetails;
//import Business.StudentUsher.StudentUsherDirectory;
import Business.UserAccount.UserAccount;
import Business.StudentUsher.StudentUsherDirectory;
import Business.Student.Student;
import com.github.javafaker.Faker;

/**
 *
 * @author Swapnil
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
         Faker faker = new Faker();
//        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", new SystemAdminRole());
        UserAccount su = system.getUserAccountDirectory().createUserAccount("dummysu", "123", new StudentUsherRole());
        StudentUsherDetails sdu = system.getSud().newStudentUsher();
        sdu.setStudentUsherAccount(su);
        sdu.setLastName("Vise");
        sdu.setFirstName("Swapnil");
        
        UserAccount pa = system.getUserAccountDirectory().createUserAccount("dummypa", "123", new PatientAssociateRole());
        UserAccount sc = system.getUserAccountDirectory().createUserAccount("dummysc", "123", new SwabCollectorRole());
        UserAccount la = system.getUserAccountDirectory().createUserAccount("dummyla", "123", new LogisticsAssociateRole());
        UserAccount dc = system.getUserAccountDirectory().createUserAccount("dummydc", "123", new DoctorRole());
        UserAccount labass = system.getUserAccountDirectory().createUserAccount("dummylabas", "123", new LabAssistantRole());
        UserAccount student = system.getUserAccountDirectory().createUserAccount("dummystu", "123", new StudentRole());
        Student sd = system.getStudir().newStudent();
        sd.setStudentAccount(student);
        sd.setStudentLastName("Diggikar");
        sd.setStudentFirstName("Shrishti");
        sd.setStudentID("A1");
        sd.setDob("1997/05/25");
        sd.setContactNumber("1234567890");
        sd.setStreetName("1575 Alphonsus Street");
        sd.setAptNo("711");
        sd.setCity("Boston");
        sd.setState("MA");
        sd.setZipcode("02120");
        sd.setStudentEmail("abc.gmail.com");
        
        Employee e2=system.getEmployeeDirectory().createEmployee("Disha");
        UserAccount ua4 = system.getUserAccountDirectory().createUserAccount("disha", "disha", new AdminRole());
        e2.setUserAccount(ua4);
        
        
        Employee e=system.getEmployeeDirectory().createEmployee("Allen");
        UserAccount ua3 = system.getUserAccountDirectory().createUserAccount("dummyrest", "admin", new AdminRole());
        e.setUserAccount(ua3);
        
        Restaurant r=system.getRestaurantDirectory().newRestaurant(ua3);
        r.setRestName("Qdoba");
        r.setContactNo("7045564766");
        Address ad2= new Address();
        ad2.setStreetAddress("393 Huntington Ave");
        ad2.setCity("Boston");
        ad2.setState("MA");
        ad2.setCountry("USA");
        ad2.setZipCode("02115");
        r.setAddress(ad2);
        for(int j=1;j<=20;j++){
            Item i=r.getItemList().addNewItem();
            i.setItemName(faker.food().dish());
            i.setItemPrice(faker.number().numberBetween(5, 50));
        }
        
        Restaurant r2=system.getRestaurantDirectory().newRestaurant(ua4);
        r2.setRestName("Popeyes Louisiana Kitchen");
        r2.setContactNo("7738861071");
        Address ad4= new Address();
        ad4.setStreetAddress("360 Huntington Ave");
        ad4.setCity("Boston");
        ad4.setState("MA");
        ad4.setCountry("USA");
        ad4.setZipCode("02115");
        r2.setAddress(ad4);
        for(int j=1;j<=20;j++){
            Item i=r2.getItemList().addNewItem();
            i.setItemName(faker.food().dish());
            i.setItemPrice(faker.number().numberBetween(5, 50));
        }
        
        UserAccount ua2 = system.getUserAccountDirectory().createUserAccount("dmlogan", "123", new DeliverManRole());
        DeliveryMan ndm= system.getDeliveryManDirectory().newDeliveryMan();
        ndm.setDeliveryManAccount(ua2);
        Address ad= new Address();
        ndm.setFirstName("Logan");
        ndm.setLastName("Paul");
        ndm.setEmailId("logan@email.com");
        ndm.setPhoneNo("7977147283");
        ad.setStreetAddress("Street 655");
        ad.setCity("Miami");
        ad.setState("MA");
        ad.setCountry("USA");
        ad.setZipCode("02012");
        ndm.setAddress(ad);
        
        UserAccount ua6 = system.getUserAccountDirectory().createUserAccount("dmJack", "123", new DeliverManRole());
        DeliveryMan ndm1= system.getDeliveryManDirectory().newDeliveryMan();
        ndm1.setDeliveryManAccount(ua6);
        Address ad3= new Address();
        ndm1.setFirstName("Jack");
        ndm1.setLastName("Miller");
        ndm1.setEmailId("miller@email.com");
        ndm1.setPhoneNo("876098431");
        ad3.setStreetAddress("Street 786");
        ad3.setCity("California");
        ad3.setState("CA");
        ad3.setCountry("USA");
        ad3.setZipCode("02012");
        ndm1.setAddress(ad);
        
//        UserAccount la = system.getUserAccountDirectory().createUserAccount("dummyla", "123",employee, new LogisticsAssociateRole());
//        UserAccount la = system.getUserAccountDirectory().createUserAccount("dummyla", "123",employee, new LogisticsAssociateRole());
        
        return system;
    }
    
}
