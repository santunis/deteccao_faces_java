package br.com.deteccao.faces;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;
import static org.opencv.imgcodecs.Imgcodecs.IMREAD_LOAD_GDAL;
import static org.opencv.imgcodecs.Imgcodecs.imread;
import static org.opencv.imgproc.Imgproc.COLOR_BGR2GRAY;

public class TesteOpenCV {

	public static void main(String[] args) {

		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		System.out.println(Core.VERSION);
		
		Mat imagem = imread("src\\main\\resources\\opencv_java.jpg", IMREAD_LOAD_GDAL);
        Utilitarios ut = new Utilitarios();
        ut.mostraImagem(ut.convertMatToImage(imagem));
        
        Mat imagemCinza = new Mat();
        Imgproc.cvtColor(imagem, imagemCinza, COLOR_BGR2GRAY);
        ut.mostraImagem(ut.convertMatToImage(imagemCinza));

	}

}
