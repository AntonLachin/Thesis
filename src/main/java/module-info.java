module com.work.diploma {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.persistence;
    requires org.hibernate.orm.core;
    requires java.sql;
    requires sqlite.dialect;

    opens calculations.model;
    opens com.work.diploma to javafx.fxml, java.persistence;
    exports com.work.diploma;
    opens com.work.diploma.images;
    opens base;
}