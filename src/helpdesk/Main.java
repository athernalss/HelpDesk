package helpdesk;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.text.html.CSS;

// Main klasė paveldi tėvinę Application klasę, kuri atsakinga už darbalaukio aplikacijų kūrimą.
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        // Nurodoma, kur yra vaizdas. (Kur yra GUI [grafinė vartotojo sąsaja] į kurią vesime duomenis).
        Parent root = FXMLLoader.load(getClass().getResource("view/login.fxml"));

        // Susikuriama scena kuri yra pamodifikuojama.
        Scene loginScene = new Scene(root, 300, 275);
        // Scenai nurodomas CSS failiukas, pagal kurį bus modifikuojami scenoje esami elementai.
        loginScene.getStylesheets().add(getClass().getResource("view/CSS.css").toExternalForm());

        // Šiuo metu rodomas dialogas. Nustatome jo pavadinimą (antraštę).
        primaryStage.setTitle("Login");
        // Nustatomas dialogo plotas ir ilgis. Priskiriama dialogui GUI (grafinė vartotojo sąsaja) forma.
        // Tai yra užkraunami GUI (grafinės vartotojo sąsajos) elementai.
        primaryStage.setScene(loginScene);
        // Reikalinga, kad rodytų dialogą.
        primaryStage.show();
    }


    public static void main(String[] args) {
        // Paleidžiamas metodas, kuris startuos GUI aplikaciją. (start metodas).
        launch(args);
    }
}
