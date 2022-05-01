//package View;
//
///**
// * JavaFX lib import
// */
//import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.stage.Stage;
//
//import java.io.IOException;
//import java.net.URL;
//
//public class UserInterface extends Application {
//
//
//    private Stage primaryStage;
//    private static int themeNumber;
//    private static String themeBackgroundURL;
//    Scene dictScene;
//    UserInterfaceController controller;
//
//
//    @Override
//    public void start(Stage primaryStage) {
//        this.primaryStage = primaryStage;
//        primaryStage.setTitle("Dictionary");
//        setThemeNumber(1);
//        primaryStage.show();
//    }
//
//    public void setThemeNumber(int a){
//        this.themeNumber = a;
//        this.themeBackgroundURL = getClass().getClassLoader().getResource(
//                            "D:/UETLearningDocs/Dictionary/src/main/resources/background/background"
//                                    + a + ".png").toString();
//        System.out.println("theme is now " + themeNumber);
//        System.out.println("theme background set to " + themeBackgroundURL);
//    }
//
//    public URL loadFile(String input){
//        ClassLoader classLoader = getClass().getClassLoader();
//        URL resource = classLoader.getResource(input);
//        return resource;
//    }
//
//    public void initDictLayout(){
//        try{
//            // Load root layout from fxml file.
//            FXMLLoader loader = new FXMLLoader();
//
//            loader.setLocation(loadFile("certainUI.fxml"));
//            //loader.setLocation(UserInterface.class.getClass().getResource("/certainUI.fxml"));
//
//            Parent root = loader.load();
//            dictScene = new Scene(root, 1000, 768);
//
//            dictScene.getStylesheets().add(loadFile("certainUIStyle.css").toString());
//            //dictScene.getStylesheets().add(getClass().getClassLoader().getResource("certainUIStyle.css").toString());
//            primaryStage.setScene(dictScene);
//            primaryStage.show();
//
//            //loader.setController(UserInterfaceController);
//            controller = loader.getController();
//            controller.setUserInterface(this);
//
//        } catch (IOException e){
//            e.printStackTrace();
//        }
//
//    }
//
//
//
//
//    public static String getThemeBackgroundURL(){
//        return themeBackgroundURL;
//    };
//
//    public static int getThemeNumber(){
//        return themeNumber;
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//
//}