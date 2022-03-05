module org.module {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.persistence;
    requires lombok;
    requires org.hibernate.orm.core;
    requires mysql.connector.java;
    requires java.sql;

    opens org.module to javafx.fxml;
    exports org.module;

    opens org.module.logistica.entities to javafx.fxml;
    exports org.module.logistica.entities;

    opens org.module.recursos_humanos.entities to javafx.fxml;
    exports org.module.recursos_humanos.entities;

}