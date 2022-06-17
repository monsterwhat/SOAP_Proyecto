
package soap.services;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "wb_Cesantia")
public class wb_Cesantia {

    /**
     * Web service operation
     * @param antiguedad_empleado
     * @param salario_promedio
     * @return 
     */
    @WebMethod(operationName = "calculo")
    public double calculo(@WebParam(name = "antiguedad_empleado") int antiguedad_empleado, @WebParam(name = "salario_promedio") double salario_promedio) {
        //TODO write your implementation code here:
        return 0.0;
    }
}
