package lk.jiat.web.ejb;


import jakarta.annotation.security.DenyAll;
import jakarta.annotation.security.PermitAll;
import jakarta.annotation.security.RolesAllowed;
import jakarta.ejb.Stateless;

@Stateless
public class UserSessionBean {

    @DenyAll //outside kattiyata access karanna baa
    public void method1(){
        System.out.println("User Session Bean method 01");
    }

    @PermitAll //onema kenekta access karanna puluwan
    public void method2(){
        System.out.println("User Session Bean method 02");

    }

    @RolesAllowed("admin") // admin role eke kattiyata witharai access karanna puluwan
    public void method3(){
        System.out.println("User Session Bean method 03");

    }

    @RolesAllowed({"admin","user"})
    public void method4(){
        System.out.println("User Session Bean method 04");

    }
    public void method5(){
        System.out.println("User Session Bean method 05");

    }
}
