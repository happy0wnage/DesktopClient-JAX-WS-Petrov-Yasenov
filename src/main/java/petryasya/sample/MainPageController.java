package petryasya.sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import petryasya.constants.Constants;
import petryasya.core.movie.Movie;
import petryasya.core.movie.MovieService;
import petryasya.core.movie.MovieServiceImplService;
import petryasya.core.user.User;
import petryasya.core.user.UserService;
import petryasya.core.user.UserServiceImplService;
import petryasya.validator.UserValidate;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class MainPageController implements Initializable {

    private static final Logger LOGGER = Logger.getLogger(MainPageController.class.getName());
    public static final String INVALID_DATA = "Invalid data";
    public static final String NO_SUCH_USER = "No such user";

    @FXML
    private TableView<Movie> movieTable = new TableView<>();

    @FXML
    private TableColumn<Movie, String> nameColumn;

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label errorMessage;

    @FXML
    private Label yearText;

    @FXML
    private TextArea descriptionText;

    @FXML
    private TextArea nameText;

    @FXML
    private Button signInButton;

    @FXML
    private Button addToListButton;

    @FXML
    private Button deleteFromList;

    @FXML
    private ToggleButton openMovies;

    private MovieService movieService;

    private UserService userService;

    public MainPageController() {
        MovieServiceImplService movieService = new MovieServiceImplService();
        UserServiceImplService userService = new UserServiceImplService();
        this.movieService = movieService.getMovieServiceImplPort();
        this.userService = userService.getUserServiceImplPort();
    }

    private void setMyMovies() {
        Main.user = userService.get(Main.user.getId());
        List<Movie> movies = Main.user.getMovieSet();
        movieTable.getItems().setAll(getMovies(movies));
        movieTable.getSelectionModel().selectFirst();
        showDescription();
    }

    private void setAllMovies() {
        movieTable.getItems().setAll(getMovies(movieService.getMovies().getMovieList()));
        movieTable.getSelectionModel().selectFirst();
        showDescription();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        nameColumn.setCellValueFactory(new PropertyValueFactory<>(Constants.NAME));
        setAllMovies();
        movieTable.setOnMouseClicked(event -> showDescription());
        signInButton.setOnAction(loginEvent);
        addToListButton.setOnAction(event -> {
            Movie movie = movieTable.getSelectionModel().getSelectedItem();
            User currUser = userService.get(Main.user.getId());

            LOGGER.info("Curr movie: " + movie.getName());
            final String dialog = "Add movie dialog";

            boolean flag = false;
            for (Movie m : currUser.getMovieSet()) {
                if (movie.getId() != m.getId()) {
                    userService.addMovie(movie.getId(), currUser.getId());
                    showAlert(dialog, "Movie added to your list");
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                showAlert(dialog, "You have already add this movie");
            }
        });

        deleteFromList.setOnAction(event -> {
            final String dialog = "Delete movie dialog";
            Movie movie = movieTable.getSelectionModel().getSelectedItem();
            userService.deleteMovie(movie.getId(), Main.user.getId());
            setMyMovies();
            showAlert(dialog, "Movie deleted from your list");
        });

        final ToggleGroup group = new ToggleGroup();
        group.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue == null) {
                setMyMovies();
                addToListButton.setVisible(false);
                deleteFromList.setVisible(true);
            } else {
                setAllMovies();
                addToListButton.setVisible(true);
                deleteFromList.setVisible(false);
            }
        });
        openMovies.setToggleGroup(group);
    }

    private void showDescription() {
        Movie movie = movieTable.getSelectionModel().getSelectedItem();
        yearText.setText(movie.getYear() + "");
        nameText.setText(movie.getName());
        descriptionText.setText(movie.getDescription());
    }

    private void login() {
        openMovies.setVisible(true);
        emailField.setText(Main.user.getEmail());
        passwordField.setText(Main.user.getPassword());
        emailField.setDisable(true);
        passwordField.setDisable(true);
        signInButton.setOnAction(logoutEvent);
        signInButton.setText(Constants.LOGOUT_BUTTON);
        signInButton.setStyle("-fx-background-color: rgba(216, 5, 0, 0.7)");
        deleteFromList.setVisible(true);
    }

    private void logout() {
        openMovies.setVisible(false);
        emailField.setText("");
        passwordField.setText("");
        emailField.setDisable(false);
        passwordField.setDisable(false);
        signInButton.setOnAction(loginEvent);
        signInButton.setText(Constants.LOGIN_BUTTON);
        signInButton.setStyle("");
        deleteFromList.setVisible(false);
    }

    private ObservableList<Movie> getMovies(List<Movie> movies) {
        LOGGER.info("Movie list: " + movies);
        ObservableList<Movie> movieData = FXCollections.observableArrayList();
        movieData.addAll(movies.stream().collect(Collectors.toList()));
        return movieData;
    }

    private EventHandler<ActionEvent> loginEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            User user = new User();
            user.setEmail(emailField.getText());
            user.setPassword(passwordField.getText());

            if (UserValidate.isCorrect(user)) {
                boolean flag = false;
                for (User u : userService.getAll().getUserList()) {
                    if (u.equals(user)) {
                        errorMessage.setText("");
                        Main.user = u;
                        setMyMovies();
                        flag = true;
                        login();
                    }
                }
                if (!flag) {
                    errorMessage.setText(NO_SUCH_USER);
                }
            } else {
                errorMessage.setText(INVALID_DATA);
            }
        }
    };

    private EventHandler<ActionEvent> logoutEvent = event -> {
        if (Main.user != null) {
            Main.user = null;
            logout();
            setAllMovies();
        }
    };

    private void showAlert(String dialog, String text) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(dialog);
        alert.setHeaderText(null);
        alert.setContentText(text);

        alert.showAndWait();
    }
}
