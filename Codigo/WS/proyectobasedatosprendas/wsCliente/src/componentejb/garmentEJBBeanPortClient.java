package componentejb;
import java.math.BigDecimal;
// This source file is generated by Oracle tools.
// Contents may be subject to change.
// For reporting problems, use the following:
// Generated by Oracle JDeveloper 12c 12.2.1.3.0.0914
public class garmentEJBBeanPortClient {
    public static void main(String[] args) {
        GarmentEJBBeanService garmentEJBBeanService = new GarmentEJBBeanService();
        GarmentEJBBean garmentEJBBean = garmentEJBBeanService.getGarmentEJBBeanPort();
        
        int conn = garmentEJBBean.getConnection();
        if (garmentEJBBean.insertGarment(new Garment())) {
            System.out.println("Inserci�n realizada");
        } else {
            System.out.println("looooool");        
        }


    }
}