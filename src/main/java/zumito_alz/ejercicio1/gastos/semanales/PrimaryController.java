package zumito_alz.ejercicio1.gastos.semanales;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML TextField txtAlim;
    @FXML TextField txtRefr;
    @FXML TextField txtTrans;
    @FXML TextField txtTel;
    @FXML TextField txtOtros;
    @FXML TextField txtTotal;
    @FXML TextField txtAlto;

    @FXML
    private void btnCalcular_click() throws IOException {
        int alim = Integer.parseInt(txtAlim.getText());
        int refr = Integer.parseInt(txtRefr.getText());
        int trans = Integer.parseInt(txtTrans.getText());
        int tel = Integer.parseInt(txtTel.getText());
        int otros = Integer.parseInt(txtOtros.getText());
        
        int total = alim + refr + trans + tel + otros;
        txtTotal.setText("" + total);
        
        if (alim > refr && alim > trans && alim > tel && alim > otros)
            txtAlto.setText("Alimentacion");
        else if (refr > alim && refr > trans && refr > tel && refr > otros)
            txtAlto.setText("Refrigerios");
        else if (trans > alim && trans > refr && trans > tel && trans > otros)
            txtAlto.setText("Transporte");
        else if (tel > alim && tel > refr && tel > trans && tel > otros)
            txtAlto.setText("Telefonia");
        else
            txtAlto.setText("otros");
        
    }
    
    @FXML
    private void btnLimpiar_click() throws IOException {
        txtAlim.setText("");
        txtRefr.setText("");
        txtTrans.setText("");
        txtTel.setText("");
        txtOtros.setText("");
        txtTotal.setText("");
        txtAlto.setText("");
        
    }
    
}
