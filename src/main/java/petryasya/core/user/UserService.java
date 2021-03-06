
package petryasya.core.user;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "UserService", targetNamespace = "http://service.petryasya.nure.ua/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UserService {


    /**
     * 
     * @param arg0
     * @return
     *     returns movie.User
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://service.petryasya.nure.ua/UserService/getRequest", output = "http://service.petryasya.nure.ua/UserService/getResponse")
    public User get(
            @WebParam(name = "arg0", partName = "arg0")
            int arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @Action(input = "http://service.petryasya.nure.ua/UserService/updateRequest", output = "http://service.petryasya.nure.ua/UserService/updateResponse")
    public void update(
            @WebParam(name = "arg0", partName = "arg0")
            User arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @Action(input = "http://service.petryasya.nure.ua/UserService/deleteRequest", output = "http://service.petryasya.nure.ua/UserService/deleteResponse")
    public void delete(
            @WebParam(name = "arg0", partName = "arg0")
            int arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @Action(input = "http://service.petryasya.nure.ua/UserService/insertRequest", output = "http://service.petryasya.nure.ua/UserService/insertResponse")
    public void insert(
            @WebParam(name = "arg0", partName = "arg0")
            User arg0);

    /**
     * 
     * @return
     *     returns movie.Users
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://service.petryasya.nure.ua/UserService/getAllRequest", output = "http://service.petryasya.nure.ua/UserService/getAllResponse")
    public Users getAll();

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @Action(input = "http://service.petryasya.nure.ua/UserService/addMovieRequest", output = "http://service.petryasya.nure.ua/UserService/addMovieResponse")
    public void addMovie(
            @WebParam(name = "arg0", partName = "arg0")
            int arg0,
            @WebParam(name = "arg1", partName = "arg1")
            int arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @Action(input = "http://service.petryasya.nure.ua/UserService/deleteMovieRequest", output = "http://service.petryasya.nure.ua/UserService/deleteMovieResponse")
    public void deleteMovie(
            @WebParam(name = "arg0", partName = "arg0")
            int arg0,
            @WebParam(name = "arg1", partName = "arg1")
            int arg1);

}
