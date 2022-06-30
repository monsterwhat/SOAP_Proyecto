
package soap.services;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "wb_Vacaciones")
public class wb_Vacaciones {

    /**
     * Web service operation
     */
    
    //Calcula los dias de vacaciones segun las semanas laboradas y calcula el saldo pendiente de vacaciones
    @WebMethod(operationName = "Vacaciones")
    public ArrayList Vacaciones(@WebParam(name = "semanasTrabajadas") int semanasTrabajadas, @WebParam(name = "saldoVacaciones") double saldoVacaciones) {
        //TODO write your implementation code here:
        
         //calculo de vacaciones por días según las semanas laboradas
        //son 14 días por cada 50 entonces según esta formula se sacan los días pendientes de vacaciones
        int totalVacaciones = semanasTrabajadas*14/50;
 
        //calculo de salario diario 
        double salarioVacaciones = saldoVacaciones/30;
        //calculo de saldo de vacaciones segun salario diario
        double pagoVacaciones = salarioVacaciones*14;
        
        
        ArrayList<Object> arrayRetorno = new ArrayList<>();
        arrayRetorno.add(totalVacaciones);
        arrayRetorno.add(pagoVacaciones);
        
        return arrayRetorno;
    }

    /**
     * Web service operation
     */
    


    /**
     * Web service operation
     */
    

    /**
     * Web service operation
     */
  

    /**
     * Web service operation
     */
    


    /**
     * This is a sample web service operation
     */
    
  
    
}
