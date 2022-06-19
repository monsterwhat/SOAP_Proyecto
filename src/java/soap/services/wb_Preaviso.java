package soap.services;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "wb_Preaviso")
public class wb_Preaviso {

    /**
     * Web service operation
     *
     * @param antiguedad_empleado
     * @param salario_promedio
     * @return
     */
    @WebMethod(operationName = "calculo")
    public ArrayList calculo(@WebParam(name = "antiguedad_empleado") double antiguedad_empleado, @WebParam(name = "salario_promedio") double salario_promedio) {

        int dias = 0;
        double monto = 0;
        double salarioDiario = salario_promedio / 30;

        if (antiguedad_empleado > 3 && antiguedad_empleado < 6) {
            dias = 7;
            monto = dias * salarioDiario;
        }
        if (antiguedad_empleado > 6 && antiguedad_empleado < 12) {
            dias = 15;
            monto = dias * salarioDiario;
        }
        if (antiguedad_empleado > 12) {
            dias = 30;
            monto = dias * salarioDiario;
        }

        ArrayList<Object> arrayRetorno = new ArrayList<>();
        arrayRetorno.add(dias);
        arrayRetorno.add(monto);
        
        return arrayRetorno;
    }

}
