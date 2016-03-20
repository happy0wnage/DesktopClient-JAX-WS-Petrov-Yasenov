
package petryasya.core.movie;

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
@WebService(name = "MovieService", targetNamespace = "http://service.petryasya.nure.ua/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MovieService {


    /**
     * 
     * @param arg0
     * @return
     *     returns movie.Movie
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://service.petryasya.nure.ua/MovieService/getMovieRequest", output = "http://service.petryasya.nure.ua/MovieService/getMovieResponse")
    public Movie getMovie(
            @WebParam(name = "arg0", partName = "arg0")
            int arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @Action(input = "http://service.petryasya.nure.ua/MovieService/addMovieRequest", output = "http://service.petryasya.nure.ua/MovieService/addMovieResponse")
    public void addMovie(
            @WebParam(name = "arg0", partName = "arg0")
            Movie arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @Action(input = "http://service.petryasya.nure.ua/MovieService/deleteMovieRequest", output = "http://service.petryasya.nure.ua/MovieService/deleteMovieResponse")
    public void deleteMovie(
            @WebParam(name = "arg0", partName = "arg0")
            int arg0);

    /**
     * 
     * @return
     *     returns movie.Movies
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://service.petryasya.nure.ua/MovieService/getMoviesRequest", output = "http://service.petryasya.nure.ua/MovieService/getMoviesResponse")
    public Movies getMovies();

    /**
     * 
     * @param arg0
     * @return
     *     returns movie.Movies
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://service.petryasya.nure.ua/MovieService/getByUserRequest", output = "http://service.petryasya.nure.ua/MovieService/getByUserResponse")
    public Movies getByUser(
            @WebParam(name = "arg0", partName = "arg0")
            int arg0);

}
