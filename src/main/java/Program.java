import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        // DEPARTMENT
        Department department= new Department();
        department.id= 1;
        department.name="Bao ve";
        System.out.println("Ten phong ban: " + department.name);

        //POSITION
        Position position_01= new Position();
        position_01.id= 1;
        position_01.name= PositionName.TEST;
        System.out.println("Id phong ban: "+ position_01.id);
        System.out.println("Chuc Vu: "+ position_01.name);

        //ACCOUNT
        Account account= new Account();
        account.AccountId=1;
        account.uesrName="dat.nt";
        account.fullName="Nguyen Thanh Dat";
        account.department= department;
        account.position= position_01;
        account.CreateDate= LocalDate.now();

    }
}
