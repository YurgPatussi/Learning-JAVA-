package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application{
	public int valor = 0;

	private void atualizarLabelNumero(Label label) {
		label.setText(Integer.toString(valor));
		label.getStyleClass().remove("verde");
		label.getStyleClass().remove("vermelha");
		
		if (valor<0) {
			label.getStyleClass().add("vermelha");
		} else if (valor> 0) {
			label.getStyleClass().add("verde");
		}
	}
	


	@Override
	public void start(Stage primaryStage) throws Exception {
		

		
		
		Label labelTitulo = new Label ("Contador");
		Label labelNumero = new Label ("0");
		labelNumero.getStyleClass().add("numero");
		labelTitulo.getStyleClass().add("titulo");
	
		
		
		Button botaoIncremento = new Button ("+");
		botaoIncremento.getStyleClass().add("botoes");
		botaoIncremento.setOnAction(e -> {valor++;
		atualizarLabelNumero(labelNumero);
		});
		
	
		Button botaoDecremento = new Button ("-");
		botaoDecremento.getStyleClass().add("botoes");
		botaoDecremento.setOnAction(e -> {valor--;
		atualizarLabelNumero(labelNumero);
		});

		HBox boxBotoes = new HBox();
		boxBotoes.setAlignment(Pos.CENTER);
		boxBotoes.setSpacing(10);
		boxBotoes.getChildren().add(botaoDecremento);
		boxBotoes.getChildren().add(botaoIncremento);
	
		
		VBox boxConteudo = new VBox();
		boxConteudo.getStyleClass().add("conteudo");
		boxConteudo.setSpacing(10);
		boxConteudo.setAlignment(Pos.CENTER);
		boxConteudo.getChildren().add(labelTitulo);
		boxConteudo.getChildren().add(labelNumero);
		boxConteudo.getChildren().add(boxBotoes);

		
		String caminhoDoCss = getClass().getResource("/basico/Contador.css").toExternalForm();
		
		Scene cenaPrincipal = new Scene (boxConteudo,400,400);
		cenaPrincipal.getStylesheets().add(caminhoDoCss);
		cenaPrincipal.getStylesheets().add("https://fonts.googleapis.com/css2?family=Hurricane");
		primaryStage.setScene(cenaPrincipal);
		primaryStage.show();
	
		

		
		
	}



	public static void main(String[] args) {
		launch(args);

		};
		
	}

