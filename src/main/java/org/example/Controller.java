package org.example;
import java.net.URL;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.example.sourceClass.PoorClient;
import org.example.sourceClass.RichClient;
import org.example.sourceClass.StudentClient;

public class Controller {
    private RichClient rich = new RichClient();
    private PoorClient poor = new PoorClient();
    private StudentClient student = new StudentClient();

    @FXML
    private URL location;

    @FXML
    private TextField TextField1;

    @FXML
    private TextField TextField2;
    @FXML
    private ComboBox<String> comboBox;

    @FXML
    void cash(ActionEvent event) {
        Util u = new Util();
        if (chekTextFieldEmpty()) {     //Проверка на введённые дынные
            u.messageBox("Ошибка", "Поля не заполнены");
        } else if (!chekTextFieldNumber()) {
            u.messageBox("Ошибка", "Введена неверная сумма");
        } else {
            if (comboBox.getValue().equals("Богатый клиент")) {
                rich.get_cash(TextField1.getText(), Integer.parseInt(TextField2.getText()));
                u.messageBox("Богатый клиент", "Дорогой " + rich.get_name() + ", деньги в размере " + rich.get_money().get_summ() + "$ успешно сняты с вашего счета");
            } else if (comboBox.getValue().equals("Бедный клиент")) {
                poor.get_cash(TextField1.getText(), Integer.parseInt(TextField2.getText()));
                u.messageBox("Бедный клиент", "Клиент под именем " + poor.get_name() + ", деньги в размере " + poor.get_money().get_summ() + "$ успешно сняты с вашего счета");
            }
            if (comboBox.getValue().equals("Студент")) {
                student.get_cash(TextField1.getText(), Integer.parseInt(TextField2.getText()));
                u.messageBox("Студент", "Студент под именем " + student.get_name() + ", деньги в размере " + student.get_money().get_summ() + "$ успешно сняты с вашего счета");
            }
        }
    }

    @FXML
    void initialize() {
        setComboBox();
    }

    public void setComboBox() {
        comboBox.getItems().removeAll(comboBox.getItems());
        comboBox.getItems().addAll("Богатый клиент", "Бедный клиент", "Студент");
        comboBox.getSelectionModel().select("Студент");
    }

    public boolean chekTextFieldNumber() {
        try {
            Integer.parseInt(TextField2.getText());
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean chekTextFieldEmpty() {
        if (TextField1.getText().equals("") || TextField2.getText().equals("")) {
            return true;
        }
        return false;
    }
}
