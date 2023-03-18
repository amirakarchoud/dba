//jax-ws
//jax-b

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

//targetname pour preciser le package
@WebService(targetNamespace = "http://www.polytech.fr")
public class MonServiceWeb {

    @WebMethod(operationName = "Convertir")
    public double conversion(@WebParam(name = "param") double mt){
        return mt*0.9;
    }

    public double somme(double a, double b){
        return a+b;
    }

    public Etudiant getEtudiant(int id){
        return new Etudiant(1,"Test",10);
    }
}
