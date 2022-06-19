package soap.services;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.ws.BindingType;

@WebService(serviceName = "wb_Cesantia")
@BindingType(value = "http://java.sun.com/xml/ns/jaxws/2003/05/soap/bindings/HTTP/")
public class wb_Cesantia {

    /**
     * Web service operation
     *
     * @param antiguedad_empleado
     * @param salario_promedio
     * @return
     */
    @WebMethod(operationName = "calculo")
    public ArrayList calculo(@WebParam(name = "antiguedad_empleado") int antiguedad_empleado, @WebParam(name = "salario_promedio") double salario_promedio) {
        double dias = 0;
        double pagoCesantia = 0;
        double salarioDiario = salario_promedio/30;
        if(antiguedad_empleado < 3){
            dias = 0;
            pagoCesantia=0;
        }
        if(antiguedad_empleado >= 3 && antiguedad_empleado < 6){
            dias = 7;
            pagoCesantia = salarioDiario*dias;
        }
        if(antiguedad_empleado >= 6 && antiguedad_empleado < 12){
            dias = 14;
            pagoCesantia = salarioDiario*dias;
        }
        if(antiguedad_empleado >= 12 && antiguedad_empleado < 24){ // Ano 1
            dias = 19.5 * antiguedad_empleado%12;
            pagoCesantia = salarioDiario*dias;
        }
        if(antiguedad_empleado >= 24 && antiguedad_empleado < 36){ // 2
            dias = 20 * antiguedad_empleado%12;
            pagoCesantia = salarioDiario*dias;
        }
        if(antiguedad_empleado >= 36 && antiguedad_empleado < 48){ // 3
            dias = 20.5 * antiguedad_empleado%12;
            pagoCesantia = salarioDiario*dias;
        }
        if(antiguedad_empleado >= 48 && antiguedad_empleado < 60){ // 4
            dias = 21 * antiguedad_empleado%12;
            pagoCesantia = salarioDiario*dias;
        }
        if(antiguedad_empleado >= 60 && antiguedad_empleado < 72){ // 5
            dias = 21.24 * antiguedad_empleado%12;
            pagoCesantia = salarioDiario*dias;
        }
        if(antiguedad_empleado >= 72 && antiguedad_empleado < 84){ // 6
            dias = 21.5 * antiguedad_empleado%12;
            pagoCesantia = salarioDiario*dias;
        }
        if(antiguedad_empleado >= 84 && antiguedad_empleado < 96){ // 7
            dias = 22 * antiguedad_empleado%12;
            pagoCesantia = salarioDiario*dias;
        }
        if(antiguedad_empleado >= 96 && antiguedad_empleado < 108){ // 8
            dias = 22 * antiguedad_empleado%12;
            pagoCesantia = salarioDiario*dias;
        }
        if(antiguedad_empleado >= 108 && antiguedad_empleado < 120){ // 9
            dias = 22 * antiguedad_empleado%12;
            pagoCesantia = salarioDiario*dias;
        }
        if(antiguedad_empleado >= 120 && antiguedad_empleado < 132){ // 10
            dias = 21.5 * antiguedad_empleado%12;
            pagoCesantia = salarioDiario*dias;
        }
        if(antiguedad_empleado >= 132 && antiguedad_empleado < 144){ // 11
            dias = 21 * antiguedad_empleado%12;
            pagoCesantia = salarioDiario*dias;
        }
        if(antiguedad_empleado >= 144 && antiguedad_empleado < 156){ // 12
            dias = 20.5 * antiguedad_empleado%12;
            pagoCesantia = salarioDiario*dias;
        }
        if(antiguedad_empleado >= 156){ // 13
            dias = 20 * antiguedad_empleado%12;
            pagoCesantia = salarioDiario*dias;
        }
        
        ArrayList<Object> arrayRetorno = new ArrayList<>();
        arrayRetorno.add(dias);
        arrayRetorno.add(pagoCesantia);
        
        return arrayRetorno;
    }
}
