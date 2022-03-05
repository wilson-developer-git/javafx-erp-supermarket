package org.module;

import org.module.logistica.entities.Categoria;
import org.module.util.connection_db.JpaUtil;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import javax.persistence.EntityManager;
import java.io.IOException;

public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        HBox hb = new HBox();
        Label lb = new Label();
        hb.getChildren().add(lb);
        hb.setAlignment(Pos.CENTER);
        Scene scene = new Scene(hb, 680, 480);
        stage.setScene(scene);

        EntityManager em = JpaUtil.openConection();
        em.getTransaction().begin();

            Categoria categoria = new Categoria();
            categoria.setId(2L);
            categoria.setDescricao("Agua mineral");
            em.merge(categoria);

            Categoria cat = em.find(Categoria.class, 1L);
            lb.setText(cat.getDescricao());

        em.getTransaction().commit();
        JpaUtil.closeConection(em);

        stage.show();

    }


    public static void main(String[] args) {
        launch();
    }

}