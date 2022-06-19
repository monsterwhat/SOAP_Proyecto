
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
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
}
