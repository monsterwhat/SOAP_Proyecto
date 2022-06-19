
package soap.services;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "wb_Vacaciones")
public class wb_Vacaciones {

    /**
     * This is a sample web service operation
     */
    
    // Son 2 semanas de vacaciones por cada 50 trabajadas continuamente.
    // 50 semanas son 300 dias
    // Salario promedio/30 = Salario Diario
    // 16 meses en adelante.
    // if(antiguedad_empleado < 15){sout = no tiene vacaciones.}
    // if(antiguedad_empleado >= 16){mate para calcular cuanto tiempo/pago}
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
}
